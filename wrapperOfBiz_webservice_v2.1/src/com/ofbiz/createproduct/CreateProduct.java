package com.ofbiz.createproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ofbiz.connection.ConnectionFactory;

public class CreateProduct {
	private static final String INSERT_PRODUCT = "INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_TYPE_ID, PRIMARY_PRODUCT_CATEGORY_ID, MANUFACTURER_PARTY_ID, FACILITY_ID, INTRODUCTION_DATE,"
			+ " RELEASE_DATE, SUPPORT_DISCONTINUATION_DATE, SALES_DISCONTINUATION_DATE, SALES_DISC_WHEN_NOT_AVAIL, INTERNAL_NAME, BRAND_NAME, COMMENTS, PRODUCT_NAME, DESCRIPTION, "
			+ "LONG_DESCRIPTION, PRICE_DETAIL_TEXT, SMALL_IMAGE_URL, MEDIUM_IMAGE_URL, LARGE_IMAGE_URL, DETAIL_IMAGE_URL, ORIGINAL_IMAGE_URL, DETAIL_SCREEN, INVENTORY_MESSAGE, "
			+ "INVENTORY_ITEM_TYPE_ID, REQUIRE_INVENTORY, QUANTITY_UOM_ID, QUANTITY_INCLUDED, PIECES_INCLUDED, REQUIRE_AMOUNT, FIXED_AMOUNT, AMOUNT_UOM_TYPE_ID, WEIGHT_UOM_ID, "
			+ "SHIPPING_WEIGHT, PRODUCT_WEIGHT, HEIGHT_UOM_ID, PRODUCT_HEIGHT, SHIPPING_HEIGHT, WIDTH_UOM_ID, PRODUCT_WIDTH, SHIPPING_WIDTH, DEPTH_UOM_ID, PRODUCT_DEPTH, SHIPPING_DEPTH, "
			+ "DIAMETER_UOM_ID, PRODUCT_DIAMETER, PRODUCT_RATING, RATING_TYPE_ENUM, RETURNABLE, TAXABLE, CHARGE_SHIPPING, AUTO_CREATE_KEYWORDS, INCLUDE_IN_PROMOTIONS, IS_VIRTUAL, "
			+ "IS_VARIANT, VIRTUAL_VARIANT_METHOD_ENUM, ORIGIN_GEO_ID, REQUIREMENT_METHOD_ENUM_ID, BILL_OF_MATERIAL_LEVEL, RESERV_MAX_PERSONS, RESERV2ND_P_P_PERC, "
			+ "RESERV_NTH_P_P_PERC, CONFIG_ID, CREATED_DATE, CREATED_BY_USER_LOGIN, LAST_MODIFIED_DATE, LAST_MODIFIED_BY_USER_LOGIN, IN_SHIPPING_BOX, DEFAULT_SHIPMENT_BOX_TYPE_ID, "
			+ "LOT_ID_FILLED_IN, ORDER_DECIMAL_QUANTITY, LAST_UPDATED_STAMP, LAST_UPDATED_TX_STAMP, CREATED_STAMP, CREATED_TX_STAMP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String INSERT_PRODUCT_KEYWORD = "INSERT INTO PRODUCT_KEYWORD_NEW (PRODUCT_ID, KEYWORD, KEYWORD_TYPE_ID, RELEVANCY_WEIGHT, STATUS_ID, LAST_UPDATED_STAMP, LAST_UPDATED_TX_STAMP, CREATED_STAMP, CREATED_TX_STAMP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String INSERT_PRODUCT_DIMENSION = "INSERT INTO PRODUCT_DIMENSION (DIMENSION_ID, PRODUCT_ID, PRODUCT_TYPE, BRAND_NAME, INTERNAL_NAME, LAST_UPDATED_STAMP, LAST_UPDATED_TX_STAMP, CREATED_STAMP, CREATED_TX_STAMP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String GET_PRODUCT = "SELECT * FROM PRODUCT";
	//private static final String GET_PRODUCT_TYPE = "SELECT PRODUCT_TYPE_ID FROM product_type";
	
	
	
	
	public List<CreateProductInput> getProduct(){
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		ResultSet rs = null;
	
		List<CreateProductInput> getProduct = new ArrayList<>();
		try {
			connection = connectionFactory.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(GET_PRODUCT);
			rs = preparedStatement.executeQuery();
			while(rs.next()) {
				CreateProductInput createProductInput = new CreateProductInput();
				createProductInput.setProductTypeId(rs.getString("PRODUCT_TYPE_ID"));
				createProductInput.setProductName(rs.getString("PRODUCT_NAME"));
				createProductInput.setReleaseDate(rs.getDate("RELEASE_DATE"));
				createProductInput.setInternalName(rs.getString("INTERNAL_NAME"));
				createProductInput.setBrandName(rs.getString("BRAND_NAME"));
//				createProductInput.setRequireAmount(if(rs.getString("REQUIRE_AMOUNT").equalsIgnoreCase(null) || rs.getString("REQUIRE_AMOUNT").charAt(0) == 0 ) { return 'E'});
//				createProductInput.setRequireAmount(
//						(rs.getString("REQUIRE_AMOUNT").charAt(0) == 0) || (rs.getString("REQUIRE_AMOUNT") == null) ? 'E' : rs.getString("REQUIRE_AMOUNT").charAt(0)
//						);
//				createProductInput.setChargeShipping(rs.getString("CHARGE_SHIPPING").charAt(0));
				createProductInput.setCreatedDate(rs.getDate("CREATED_DATE"));
				createProductInput.setRequireAmount(rs.getString("REQUIRE_AMOUNT"));
	//System.out.println(createProductInput.getProductName());
				
				/*String abc = rs.getString("REQUIRE_AMOUNT");
				char xyz;				
				if(abc!=null) {
					char c = abc.charAt(0);
					//Can use ASCII condition to allow all alphabets (upper and lower case both)
					if(c == 'Y' || c == 'N') {
						xyz = abc.charAt(0);
						createProductInput.setRequireAmount(xyz);
					}
					else {
					xyz = '-';
					createProductInput.setRequireAmount(xyz);
					}
				}
				else {
					
					xyz = '-';
					createProductInput.setRequireAmount(xyz);
				}*/
				
				
				//System.out.println(xyz + " " + abc);
				getProduct.add(createProductInput);
			
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	finally {
		connectionFactory.close(connection);
		connectionFactory.close(preparedStatement);
	}
		
		return getProduct;
	}
	
	public CreateProductOutput createProduct(CreateProductInput createProductInput) {
		
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		Connection connectionOlap = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		CreateProductOutput createProductOutput = new CreateProductOutput();
		try {
			connection = connectionFactory.getConnection();
			connectionOlap = connectionFactory.getConnectionOlap();
			connection.setAutoCommit(false);
			connectionOlap.setAutoCommit(false);
//			String productId = generateProductId(connection);
//			Long productId = generateProductId(connection);
//			System.out.println(createProductInput.productTypeId);
			preparedStatement = connection.prepareStatement(INSERT_PRODUCT, Statement.RETURN_GENERATED_KEYS);
//			preparedStatement.setString(1, productId);
			preparedStatement.setString(1, createProductInput.productId);
			preparedStatement.setString(2, createProductInput.productTypeId);
			preparedStatement.setString(3, createProductInput.primaryProductCategoryId);
			preparedStatement.setString(4, createProductInput.manufacturerPartyId);
			preparedStatement.setString(5, createProductInput.facilityId);
			preparedStatement.setString(6, formatDate(createProductInput.introductionDate));
			preparedStatement.setString(7, formatDate(createProductInput.releaseDate));
			preparedStatement.setString(8, formatDate(createProductInput.supportDiscontinuationDate));
			preparedStatement.setString(9, formatDate(createProductInput.salesDiscontinuationDate));
			preparedStatement.setString(10, createProductInput.salesDiscWhenNotAvail);
			preparedStatement.setString(11, createProductInput.internalName);
			preparedStatement.setString(12, createProductInput.brandName);
			preparedStatement.setString(13, createProductInput.comments);
			preparedStatement.setString(14, createProductInput.productName);
			preparedStatement.setString(15, createProductInput.description);
			preparedStatement.setString(16, createProductInput.longDescription);
			preparedStatement.setString(17, createProductInput.priceDetailText);
			preparedStatement.setString(18, createProductInput.smallImageUrl);
			preparedStatement.setString(19, createProductInput.mediumImageUrl);
			preparedStatement.setString(20, createProductInput.largeImageUrl);
			preparedStatement.setString(21, createProductInput.detailImageUrl);
			preparedStatement.setString(22, createProductInput.originalImageUrl);
			preparedStatement.setString(23, createProductInput.detailScreen);
			preparedStatement.setString(24, createProductInput.inventoryMessage);
			preparedStatement.setString(25, createProductInput.inventoryItemTypeId);
			preparedStatement.setString(26, createProductInput.requireInventory);
			preparedStatement.setString(27, createProductInput.quantityUomId);
			preparedStatement.setDouble(28, createProductInput.qunatityIncluded);
			preparedStatement.setDouble(29, createProductInput.piecesIncluded);
//			preparedStatement.setString(30, String.valueOf(createProductInput.requireAmount));
			//preparedStatement.setString(30,(String.valueOf(createProductInput.requireAmount)==null) ? "-" : String.valueOf(createProductInput.requireAmount));
			preparedStatement.setString(30,(createProductInput.requireAmount)==null ? "-" : createProductInput.requireAmount);
			preparedStatement.setDouble(31, createProductInput.fixedAmount);
			preparedStatement.setString(32, createProductInput.amountUomTypeId);
			preparedStatement.setString(33, createProductInput.weightUom);
			preparedStatement.setString(34, createProductInput.shippingWeight);
			preparedStatement.setString(35, createProductInput.productWeight);
			preparedStatement.setString(36, createProductInput.heightUomId);
			preparedStatement.setString(37, createProductInput.productHeight);
			preparedStatement.setString(38, createProductInput.shippingHeight);
			preparedStatement.setString(39, createProductInput.widthUomId);
			preparedStatement.setString(40, createProductInput.productWidth);
			preparedStatement.setString(41, createProductInput.shippingWidth);
			preparedStatement.setString(42, createProductInput.depthUomId);
			preparedStatement.setString(43, createProductInput.productDepth);
			preparedStatement.setString(44, createProductInput.shippingDepth);
			preparedStatement.setString(45, createProductInput.diameterUomId);
			preparedStatement.setString(46, createProductInput.productDiameter);
			preparedStatement.setString(47, createProductInput.productRating);
			preparedStatement.setString(48, createProductInput.ratingTypeEnum);
			preparedStatement.setBoolean(49, createProductInput.returnable);
			preparedStatement.setBoolean(50, createProductInput.taxable);
//			preparedStatement.setString(51, (String.valueOf(createProductInput.chargeShipping)==null) ? "-" : String.valueOf(createProductInput.chargeShipping));
			preparedStatement.setString(51, (createProductInput.chargeShipping)==null ? "-" : createProductInput.chargeShipping);
			preparedStatement.setString(52, createProductInput.autoCreateKeywords);
			preparedStatement.setBoolean(53, createProductInput.includeInPromotions);
			preparedStatement.setBoolean(54, createProductInput.isVirtual);
			preparedStatement.setBoolean(55, createProductInput.isVariant);
			preparedStatement.setString(56, createProductInput.originGeoId);
			preparedStatement.setString(57, createProductInput.virtualVariantMethodEnum);
			preparedStatement.setString(58, createProductInput.requirementMethodEnumId);
			preparedStatement.setString(59, createProductInput.billOfMaterialLevel);
			preparedStatement.setString(60, createProductInput.reserveMaxPersons);
			preparedStatement.setString(61, createProductInput.reserv2nsPPPerc);
			preparedStatement.setString(62, createProductInput.reservNthPPPerc);
			preparedStatement.setString(63, createProductInput.configId);
			preparedStatement.setString(64, getEntryDate());
			preparedStatement.setString(65,  createProductInput.createdByUserLogin);
			preparedStatement.setString(66, getEntryDate());
			preparedStatement.setString(67, createProductInput.lastModifiedByUserLogin);
			preparedStatement.setString(68, createProductInput.inShippingBox);
			preparedStatement.setString(69, createProductInput.defaultShipmentBoxTypeId);
			preparedStatement.setString(70, createProductInput.lotIdFiledIn);
//			preparedStatement.setString(71, (String.valueOf(createProductInput.orderDecimalQuantity)==null) ? "-" : String.valueOf(createProductInput.orderDecimalQuantity));
			preparedStatement.setString(71, (createProductInput.orderDecimalQuantity)==null ? "-" : createProductInput.orderDecimalQuantity);
			preparedStatement.setString(72, createProductInput.lastUpdatedStamp);
			preparedStatement.setString(73, createProductInput.lastUpdatedTxStamp);
			preparedStatement.setString(74, formatDate(createProductInput.createdStamp));
			preparedStatement.setString(75, formatDate(createProductInput.createdTxStamp));
			preparedStatement.execute();
			connection.commit();
			createProductOutput.supplierId = createProductInput.productId;
			insertProductKeyword(connection, createProductInput, createProductInput.productId);
			insertProductDimmension(connectionOlap, createProductInput, createProductInput.productId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			connectionFactory.close(connection);
			connectionFactory.close(connectionOlap);
			connectionFactory.close(preparedStatement);
		}
		return createProductOutput;	
	}
	
	private String getEntryDate() {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sdf.format(date);
	}
	
	private String formatDate(Date date) {
		if(date == null) return getEntryDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	private void insertProductKeyword(Connection connection, CreateProductInput createProductInput, String productId) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_KEYWORD, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, productId);
//			preparedStatement.setString(2, createProductInput.keyword);
			preparedStatement.setString(2, productId);
//			preparedStatement.setString(3, createProductInput.keywordTypeId);
			preparedStatement.setString(3, "KWT_KEYWORD");
			preparedStatement.setString(4, createProductInput.keywordRelevancyWeight);
			preparedStatement.setString(5, createProductInput.keywordStatusId);
			preparedStatement.setString(6, getEntryDate());
			preparedStatement.setString(7, getEntryDate());
			preparedStatement.setString(8, getEntryDate());
			preparedStatement.setString(9, getEntryDate());
			preparedStatement.execute();
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void insertProductDimmension(Connection connectionOlap, CreateProductInput createProductInput, String productId) {
		try {
			PreparedStatement preparedStatement = connectionOlap.prepareStatement(INSERT_PRODUCT_DIMENSION, Statement.RETURN_GENERATED_KEYS);
//			preparedStatement.setString(1, generateDimensionId(connection));
			//preparedStatement.setLong(1, generateDimensionId(connectionOlap));
			preparedStatement.setString(1, productId);
			preparedStatement.setString(2, productId);
			preparedStatement.setString(3, createProductInput.productTypeId);
			preparedStatement.setString(4, createProductInput.brandName);
			preparedStatement.setString(5, createProductInput.internalName);
			preparedStatement.setString(6, getEntryDate());
			preparedStatement.setString(7, getEntryDate());
			preparedStatement.setString(8, getEntryDate());
			preparedStatement.setString(9, getEntryDate());
			preparedStatement.execute();
			connectionOlap.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
//	private String generateDimensionId(Connection connection) {
//
//		try {
//
//			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_READ_ONLY);
//			ResultSet resultSet = statement.executeQuery("Select * from PRODUCT_DIMENSION order by DIMENSION_ID desc limit 1");
//			if(!resultSet.isBeforeFirst()) return "1";
//			while (resultSet.next()) {
//				String dimensionId = resultSet.getString("DIMENSION_ID");
//				dimensionId = String.valueOf((Integer.parseInt(dimensionId) + 1));
//				return dimensionId;
//			}
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return null;
//	}
	
//	private String generateProductId(Connection connection) {
//
//		try {
//			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_READ_ONLY);
//			ResultSet resultSet = statement.executeQuery("Select * from PRODUCT order by PRODUCT_ID desc limit 1");	
//			if(!resultSet.isBeforeFirst()) return "1";
//			while (resultSet.next()) {
//				String productId = resultSet.getString("PRODUCT_ID");
//				System.out.println("Product id testing: " + productId);
//				productId = String.valueOf((Integer.parseInt(productId) + 1));
//				return productId;
//			}
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return null;
//	}
	
	private Long generateDimensionId(Connection connection) {

		try {

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("Select * from PRODUCT_DIMENSION order by DIMENSION_ID desc limit 1");
			if(!resultSet.isBeforeFirst()) return 1L;
			while (resultSet.next()) {
				Long dimensionId = resultSet.getLong("DIMENSION_ID");
//				dimensionId = String.valueOf((Integer.parseInt(dimensionId) + 1));
				dimensionId = dimensionId + 1;
				return dimensionId;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	private Long generateProductId(Connection connection) {

		try {
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("Select * from PRODUCT order by PRODUCT_ID desc limit 1");	
			if(!resultSet.isBeforeFirst()) return 1L;
			while (resultSet.next()) {
			
				Long productId = resultSet.getLong("PRODUCT_ID");
//				System.out.println("Product id testing: " + productId);
				//productId = String.valueOf((Integer.parseInt(productId) + 1));
				productId = productId + 1;
				return productId;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
