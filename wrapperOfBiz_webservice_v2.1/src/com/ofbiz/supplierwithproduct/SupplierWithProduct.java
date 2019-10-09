package com.ofbiz.supplierwithproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ofbiz.connection.ConnectionFactory;

public class SupplierWithProduct {
private static final String INSERT = "INSERT INTO SUPPLIER_PRODUCT (PRODUCT_ID, PARTY_ID, AVAILABLE_FROM_DATE, AVAILABLE_THRU_DATE, SUPPLIER_PREF_ORDER_ID, "
		+ "SUPPLIER_RATING_TYPE_ID, STANDARD_LEAD_TIME_DAYS, MINIMUM_ORDER_QUANTITY, ORDER_QTY_INCREMENTS, UNITS_INCLUDED, QUANTITY_UOM_ID, AGREEMENT_ID, "
		+ "AGREEMENT_ITEM_SEQ_ID, LAST_PRICE, SHIPPING_PRICE, CURRENCY_UOM_ID, SUPPLIER_PRODUCT_NAME, SUPPLIER_PRODUCT_ID, CAN_DROP_SHIP, COMMENTS, LAST_UPDATED_STAMP,"
		+ " LAST_UPDATED_TX_STAMP, CREATED_STAMP, CREATED_TX_STAMP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public SupplierWithProductOutput associateSupplierWithProduct(SupplierWithProductInput associateSupplierWithProductInput) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		String supplierId = null;
		String productId;

		SupplierWithProductOutput associateSupplierWithProductOutput = new SupplierWithProductOutput();

		try {connection = connectionFactory.getConnection();
			connection.setAutoCommit(false);
			productId = getPrdocutIdFromProductName(connection, associateSupplierWithProductInput.productName).get("productId");
			supplierId = generateFacilityId(connection);
			System.out.println(productId);
			preparedStatement = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, productId);
			preparedStatement.setString(2, supplierId);
			preparedStatement.setString(3, formatDate(associateSupplierWithProductInput.availableFromDate));
			preparedStatement.setString(4, formatDate(associateSupplierWithProductInput.availableThruDate));
			preparedStatement.setString(5, associateSupplierWithProductInput.supplierPerfOrderId);
			preparedStatement.setString(6, associateSupplierWithProductInput.supplierRatingTypeId);
			preparedStatement.setDouble(7, associateSupplierWithProductInput.standardLeadTimeDays);
			preparedStatement.setDouble(8, associateSupplierWithProductInput.minimumOrderQuantity);
			preparedStatement.setDouble(9, associateSupplierWithProductInput.orderQtyIncrements);
			preparedStatement.setString(10, associateSupplierWithProductInput.unitsIncluded);
			preparedStatement.setString(11, associateSupplierWithProductInput.quantityUomId);
			preparedStatement.setString(12, associateSupplierWithProductInput.agreementId);
			preparedStatement.setString(13, associateSupplierWithProductInput.agreementItemSeqId);
			preparedStatement.setDouble(14, associateSupplierWithProductInput.lastPrice);
			preparedStatement.setDouble(15, associateSupplierWithProductInput.shippingPrice);
			preparedStatement.setString(16, associateSupplierWithProductInput.currencyUomId);
			preparedStatement.setString(17, associateSupplierWithProductInput.supplierProductName);
			preparedStatement.setString(18, associateSupplierWithProductInput.supplierProductId);
			preparedStatement.setBoolean(19, associateSupplierWithProductInput.canDropShip);
			preparedStatement.setString(20, associateSupplierWithProductInput.comments);
			preparedStatement.setString(21, getEntryDate());
			preparedStatement.setString(22, getEntryDate());
			preparedStatement.setString(23, getEntryDate());
			preparedStatement.setString(24, getEntryDate());
			preparedStatement.execute();
			
			connection.commit();
			associateSupplierWithProductOutput.setSupplierId(supplierId);
			return associateSupplierWithProductOutput;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connectionFactory.close(connection);
			connectionFactory.close(preparedStatement);
		}
		return null;
	}
	
	private String formatDate(Date date) {
		if(date == null) return getEntryDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	private Map<String, String> getPrdocutIdFromProductName(Connection connection, String productName) {

		final String FIND_BY_ID = "SELECT * FROM PRODUCT WHERE PRODUCT_NAME= ?";

		PreparedStatement preparedStatement = null;

		Map<String, String> map = new HashMap<>();

		try {
			preparedStatement = connection.prepareStatement(FIND_BY_ID);
			preparedStatement.setString(1, productName);

			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
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
			ResultSet resultSet = statement.executeQuery("Select * from SUPPLIER_PRODUCT order by PARTY_ID desc limit 1");
			if(!resultSet.isBeforeFirst()) return "1";
			while (resultSet.next()) {
				return String.valueOf(Integer.parseInt(resultSet.getString("PARTY_ID")) + 1 );
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
