/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inkwell.internet.productregistration.model.impl;

import com.inkwell.internet.productregistration.model.PRProduct;
import com.inkwell.internet.productregistration.model.PRProductModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PRProduct service. Represents a row in the &quot;PR_PRProduct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.inkwell.internet.productregistration.model.PRProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRProductImpl}.
 * </p>
 *
 * @author
manish

 * @see PRProductImpl
 * @see com.inkwell.internet.productregistration.model.PRProduct
 * @see com.inkwell.internet.productregistration.model.PRProductModel
 * @generated
 */
public class PRProductModelImpl extends BaseModelImpl<PRProduct>
	implements PRProductModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a p r product model instance should use the {@link com.inkwell.internet.productregistration.model.PRProduct} interface instead.
	 */
	public static final String TABLE_NAME = "PR_PRProduct";
	public static final Object[][] TABLE_COLUMNS = {
			{ "productId", Types.BIGINT },
			{ "productName", Types.VARCHAR },
			{ "serialNumber", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table PR_PRProduct (productId LONG not null primary key,productName VARCHAR(75) null,serialNumber VARCHAR(75) null,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table PR_PRProduct";
	public static final String ORDER_BY_JPQL = " ORDER BY prProduct.productName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PR_PRProduct.productName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.inkwell.internet.productregistration.model.PRProduct"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.inkwell.internet.productregistration.model.PRProduct"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.inkwell.internet.productregistration.model.PRProduct"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long PRODUCTNAME_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.inkwell.internet.productregistration.model.PRProduct"));

	public PRProductModelImpl() {
	}

	public long getPrimaryKey() {
		return _productId;
	}

	public void setPrimaryKey(long primaryKey) {
		setProductId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_productId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return PRProduct.class;
	}

	public String getModelClassName() {
		return PRProduct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("productName", getProductName());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public String getProductName() {
		if (_productName == null) {
			return StringPool.BLANK;
		}
		else {
			return _productName;
		}
	}

	public void setProductName(String productName) {
		_columnBitmask = -1L;

		if (_originalProductName == null) {
			_originalProductName = _productName;
		}

		_productName = productName;
	}

	public String getOriginalProductName() {
		return GetterUtil.getString(_originalProductName);
	}

	public String getSerialNumber() {
		if (_serialNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _serialNumber;
		}
	}

	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PRProduct.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PRProduct toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (PRProduct)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		PRProductImpl prProductImpl = new PRProductImpl();

		prProductImpl.setProductId(getProductId());
		prProductImpl.setProductName(getProductName());
		prProductImpl.setSerialNumber(getSerialNumber());
		prProductImpl.setCompanyId(getCompanyId());
		prProductImpl.setGroupId(getGroupId());

		prProductImpl.resetOriginalValues();

		return prProductImpl;
	}

	public int compareTo(PRProduct prProduct) {
		int value = 0;

		value = getProductName().compareTo(prProduct.getProductName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PRProduct prProduct = null;

		try {
			prProduct = (PRProduct)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = prProduct.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		PRProductModelImpl prProductModelImpl = this;

		prProductModelImpl._originalProductName = prProductModelImpl._productName;

		prProductModelImpl._originalCompanyId = prProductModelImpl._companyId;

		prProductModelImpl._setOriginalCompanyId = false;

		prProductModelImpl._originalGroupId = prProductModelImpl._groupId;

		prProductModelImpl._setOriginalGroupId = false;

		prProductModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PRProduct> toCacheModel() {
		PRProductCacheModel prProductCacheModel = new PRProductCacheModel();

		prProductCacheModel.productId = getProductId();

		prProductCacheModel.productName = getProductName();

		String productName = prProductCacheModel.productName;

		if ((productName != null) && (productName.length() == 0)) {
			prProductCacheModel.productName = null;
		}

		prProductCacheModel.serialNumber = getSerialNumber();

		String serialNumber = prProductCacheModel.serialNumber;

		if ((serialNumber != null) && (serialNumber.length() == 0)) {
			prProductCacheModel.serialNumber = null;
		}

		prProductCacheModel.companyId = getCompanyId();

		prProductCacheModel.groupId = getGroupId();

		return prProductCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{productId=");
		sb.append(getProductId());
		sb.append(", productName=");
		sb.append(getProductName());
		sb.append(", serialNumber=");
		sb.append(getSerialNumber());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.inkwell.internet.productregistration.model.PRProduct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productName</column-name><column-value><![CDATA[");
		sb.append(getProductName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serialNumber</column-name><column-value><![CDATA[");
		sb.append(getSerialNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PRProduct.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			PRProduct.class
		};
	private long _productId;
	private String _productName;
	private String _originalProductName;
	private String _serialNumber;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _columnBitmask;
	private PRProduct _escapedModelProxy;
}