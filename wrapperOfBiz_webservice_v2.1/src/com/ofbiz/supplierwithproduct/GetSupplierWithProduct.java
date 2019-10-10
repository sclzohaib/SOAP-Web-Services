package com.ofbiz.supplierwithproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ofbiz.connection.ConnectionFactory;

public class GetSupplierWithProduct {
	private static final String GET = "select p.product_name, sp.* from supplier_product sp join product p on sp.product_id = p.product_id;";

	public List<SupplierWithProductInput> getSupplierWithProduct(){
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		ResultSet rs = null;

		List<SupplierWithProductInput> getSupplierWithProduct = new ArrayList<>();
		try {
			connection = connectionFactory.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(GET);
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				SupplierWithProductInput createSupplierWithProductInput = new SupplierWithProductInput();
				createSupplierWithProductInput.setProductName(rs.getString("PRODUCT_NAME"));
				createSupplierWithProductInput.setAvailableFromDate(rs.getDate("AVAILABLE_FROM_DATE"));
				createSupplierWithProductInput.setAvailableThruDate(rs.getDate("AVAILABLE_THRU_DATE"));
				createSupplierWithProductInput.setSupplierPerfOrderId(rs.getString("SUPPLIER_PREF_ORDER_ID"));
				createSupplierWithProductInput.setSupplierRatingTypeId(rs.getString("SUPPLIER_RATING_TYPE_ID"));
				createSupplierWithProductInput.setStandardLeadTimeDays(rs.getDouble("STANDARD_LEAD_TIME_DAYS"));
				createSupplierWithProductInput.setMinimumOrderQuantity(rs.getDouble("MINIMUM_ORDER_QUANTITY"));
				createSupplierWithProductInput.setOrderQtyIncrements(rs.getDouble("ORDER_QTY_INCREMENTS"));
				createSupplierWithProductInput.setUnitsIncluded(rs.getString("UNITS_INCLUDED"));
				createSupplierWithProductInput.setQuantityUomId(rs.getString("QUANTITY_UOM_ID"));
				createSupplierWithProductInput.setAgreementId(rs.getString("AGREEMENT_ID"));
				createSupplierWithProductInput.setAgreementItemSeqId(rs.getString("AGREEMENT_ITEM_SEQ_ID"));
				createSupplierWithProductInput.setLastPrice(rs.getDouble("LAST_PRICE"));
				createSupplierWithProductInput.setShippingPrice(rs.getDouble("SHIPPING_PRICE"));
				createSupplierWithProductInput.setCurrencyUomId(rs.getString("CURRENCY_UOM_ID"));
				createSupplierWithProductInput.setSupplierProductName(rs.getString("SUPPLIER_PRODUCT_NAME"));
				createSupplierWithProductInput.setSupplierProductId(rs.getString("SUPPLIER_PRODUCT_ID"));
				createSupplierWithProductInput.setComments(rs.getString("COMMENTS"));
				createSupplierWithProductInput.setCanDropShip(rs.getBoolean("CAN_DROP_SHIP"));			
				
	//System.out.println(createProductInput.getProductName());
				getSupplierWithProduct.add(createSupplierWithProductInput);
			
			}
		
		}
		catch(Exception e) {
			
		}
	finally {
		connectionFactory.close(connection);
		connectionFactory.close(preparedStatement);
	}
		
		return getSupplierWithProduct;
	}

}
