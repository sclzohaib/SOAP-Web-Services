package com.ofbiz.facilitywithproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ofbiz.connection.ConnectionFactory;
import com.ofbiz.createproduct.CreateProductInput;

public class FacilityWithProduct {
	private static final String INSERT = "INSERT INTO PRODUCT_FACILITY (PRODUCT_ID, FACILITY_ID, MINIMUM_STOCK, REORDER_QUANTITY, DAYS_TO_SHIP, LAST_INVENTORY_COUNT, LAST_UPDATED_STAMP, LAST_UPDATED_TX_STAMP, CREATED_STAMP, CREATED_TX_STAMP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String GET = "select p.PRODUCT_NAME, pf.* from product_facility pf join product p on pf.PRODUCT_ID = p.PRODUCT_ID;";
	
	public List<FacilityWithProductInput> getFacilityWithProduct(){
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		ResultSet rs = null;
	
		List<FacilityWithProductInput> getFacilityWithProduct = new ArrayList<>();
		try {
			connection = connectionFactory.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(GET);
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				FacilityWithProductInput createFacilityWithProductInput = new FacilityWithProductInput();
				createFacilityWithProductInput.setProductName(rs.getString("PRODUCT_NAME"));
				createFacilityWithProductInput.setMinimumStock(rs.getDouble("MINIMUM_STOCK"));
				createFacilityWithProductInput.setInventoryCount(rs.getDouble("LAST_INVENTORY_COUNT"));
				createFacilityWithProductInput.setReorderQuantity(rs.getDouble("REORDER_QUANTITY"));
				createFacilityWithProductInput.setDaysToShip(rs.getDouble("DAYS_TO_SHIP"));
				
				
	//System.out.println(createProductInput.getProductName());
				getFacilityWithProduct.add(createFacilityWithProductInput);
			
			}
		
		}
		catch(Exception e) {
			
		}
	finally {
		connectionFactory.close(connection);
		connectionFactory.close(preparedStatement);
	}
		
		return getFacilityWithProduct;
	}
	public FacilityWithProductOutput associateFacilityWithProduct(FacilityWithProductInput associateFacilityWithProductInput) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		String facilityId = null;
		String productId;

		FacilityWithProductOutput associateFacilityWithProductOutput = new FacilityWithProductOutput();

		try {connection = connectionFactory.getConnection();
			connection.setAutoCommit(false);
			productId = getPrdocutIdFromProductName(connection, associateFacilityWithProductInput.productName).get("productId");
			facilityId = generateFacilityId(connection);
			
			preparedStatement = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, productId);
			preparedStatement.setString(2, facilityId);
			preparedStatement.setDouble(3, associateFacilityWithProductInput.minimumStock);
			preparedStatement.setDouble(4, associateFacilityWithProductInput.reorderQuantity);
			preparedStatement.setDouble(5, associateFacilityWithProductInput.daysToShip);
			preparedStatement.setDouble(6, associateFacilityWithProductInput.inventoryCount);
			preparedStatement.setString(7, getEntryDate());
			preparedStatement.setString(8, getEntryDate());
			preparedStatement.setString(9, getEntryDate());
			preparedStatement.setString(10, getEntryDate());
			preparedStatement.execute();
			connection.commit();
			associateFacilityWithProductOutput.setFacilityId(facilityId);
			return associateFacilityWithProductOutput;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connectionFactory.close(connection);
			connectionFactory.close(preparedStatement);
		}
		return null;
	}
	
	private Map<String, String> getPrdocutIdFromProductName(Connection connection, String productName) {

		final String FIND_BY_ID = "SELECT * FROM PRODUCT WHERE PRODUCT_NAME=?";

		PreparedStatement preparedStatement = null;

		Map<String, String> map = new HashMap<>();

		try {
			preparedStatement = connection.prepareStatement(FIND_BY_ID);
			preparedStatement.setString(1, productName);

			ResultSet result = preparedStatement.executeQuery();

			if (result.next()) {
				map.put("productId", result.getString("PRODUCT_ID"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;
	}
	
	private String generateFacilityId(Connection connection) {

		try {

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("Select * from PRODUCT_FACILITY order by FACILITY_ID desc limit 1");
			if(!resultSet.isBeforeFirst()) return "1";
			while (resultSet.next()) {
				//RODO: how to parse and increment facility_id
				String facilityId = resultSet.getString("FACILITY_ID");
				facilityId = String.valueOf((Integer.parseInt(facilityId) + 1));
				return facilityId;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	private String getEntryDate() {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sdf.format(date);
	}
}
