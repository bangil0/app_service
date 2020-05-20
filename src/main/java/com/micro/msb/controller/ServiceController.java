package com.micro.msb.controller;

import com.google.gson.Gson;
import com.micro.msb.annotations.MqttController;
import com.micro.msb.annotations.MqttMethod;
import org.springframework.beans.factory.annotation.Autowired;

import com.micro.msb.beans.*;
import com.micro.msb.dao.DaoManager;
import com.micro.msb.annotations.MqttMapping;
import org.springframework.stereotype.Controller;

/**
 * Package : com.micro.msb.controller for RestFull API
 * Class   : ServiceController
 * @author : Yan Yan Purdiansah
 */

@Controller
@MqttController
public class ServiceController {

        private final Gson gson = new Gson();

	@Autowired
	private DaoManager dao;
	
	@MqttMapping(value = "/searchAppAuthorities", method = MqttMethod.GET)
	public String searchAppAuthorities(String json){
            AppAuthoritiesSearchBean input = gson.fromJson(json,AppAuthoritiesSearchBean.class);
            AppAuthoritiesSearchBean output = (AppAuthoritiesSearchBean) dao.searchAppAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppCategory", method = MqttMethod.GET)
	public String searchAppCategory(String json){
            AppCategorySearchBean input = gson.fromJson(json,AppCategorySearchBean.class);
            AppCategorySearchBean output = (AppCategorySearchBean) dao.searchAppCategory(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppContact", method = MqttMethod.GET)
	public String searchAppContact(String json){
            AppContactSearchBean input = gson.fromJson(json,AppContactSearchBean.class);
            AppContactSearchBean output = (AppContactSearchBean) dao.searchAppContact(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppContract", method = MqttMethod.GET)
	public String searchAppContract(String json){
            AppContractSearchBean input = gson.fromJson(json,AppContractSearchBean.class);
            AppContractSearchBean output = (AppContractSearchBean) dao.searchAppContract(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppContractDevice", method = MqttMethod.GET)
	public String searchAppContractDevice(String json){
            AppContractDeviceSearchBean input = gson.fromJson(json,AppContractDeviceSearchBean.class);
            AppContractDeviceSearchBean output = (AppContractDeviceSearchBean) dao.searchAppContractDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppContractProduct", method = MqttMethod.GET)
	public String searchAppContractProduct(String json){
            AppContractProductSearchBean input = gson.fromJson(json,AppContractProductSearchBean.class);
            AppContractProductSearchBean output = (AppContractProductSearchBean) dao.searchAppContractProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppContractService", method = MqttMethod.GET)
	public String searchAppContractService(String json){
            AppContractServiceSearchBean input = gson.fromJson(json,AppContractServiceSearchBean.class);
            AppContractServiceSearchBean output = (AppContractServiceSearchBean) dao.searchAppContractService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppDevice", method = MqttMethod.GET)
	public String searchAppDevice(String json){
            AppDeviceSearchBean input = gson.fromJson(json,AppDeviceSearchBean.class);
            AppDeviceSearchBean output = (AppDeviceSearchBean) dao.searchAppDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppDeviceAttribute", method = MqttMethod.GET)
	public String searchAppDeviceAttribute(String json){
            AppDeviceAttributeSearchBean input = gson.fromJson(json,AppDeviceAttributeSearchBean.class);
            AppDeviceAttributeSearchBean output = (AppDeviceAttributeSearchBean) dao.searchAppDeviceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppDeviceRecords", method = MqttMethod.GET)
	public String searchAppDeviceRecords(String json){
            AppDeviceRecordsSearchBean input = gson.fromJson(json,AppDeviceRecordsSearchBean.class);
            AppDeviceRecordsSearchBean output = (AppDeviceRecordsSearchBean) dao.searchAppDeviceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppGroupAuthorities", method = MqttMethod.GET)
	public String searchAppGroupAuthorities(String json){
            AppGroupAuthoritiesSearchBean input = gson.fromJson(json,AppGroupAuthoritiesSearchBean.class);
            AppGroupAuthoritiesSearchBean output = (AppGroupAuthoritiesSearchBean) dao.searchAppGroupAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppGroupMembers", method = MqttMethod.GET)
	public String searchAppGroupMembers(String json){
            AppGroupMembersSearchBean input = gson.fromJson(json,AppGroupMembersSearchBean.class);
            AppGroupMembersSearchBean output = (AppGroupMembersSearchBean) dao.searchAppGroupMembers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppGroups", method = MqttMethod.GET)
	public String searchAppGroups(String json){
            AppGroupsSearchBean input = gson.fromJson(json,AppGroupsSearchBean.class);
            AppGroupsSearchBean output = (AppGroupsSearchBean) dao.searchAppGroups(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppMenus", method = MqttMethod.GET)
	public String searchAppMenus(String json){
            AppMenusSearchBean input = gson.fromJson(json,AppMenusSearchBean.class);
            AppMenusSearchBean output = (AppMenusSearchBean) dao.searchAppMenus(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppMessage", method = MqttMethod.GET)
	public String searchAppMessage(String json){
            AppMessageSearchBean input = gson.fromJson(json,AppMessageSearchBean.class);
            AppMessageSearchBean output = (AppMessageSearchBean) dao.searchAppMessage(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppPersistentLogins", method = MqttMethod.GET)
	public String searchAppPersistentLogins(String json){
            AppPersistentLoginsSearchBean input = gson.fromJson(json,AppPersistentLoginsSearchBean.class);
            AppPersistentLoginsSearchBean output = (AppPersistentLoginsSearchBean) dao.searchAppPersistentLogins(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppProduct", method = MqttMethod.GET)
	public String searchAppProduct(String json){
            AppProductSearchBean input = gson.fromJson(json,AppProductSearchBean.class);
            AppProductSearchBean output = (AppProductSearchBean) dao.searchAppProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppProductAttribute", method = MqttMethod.GET)
	public String searchAppProductAttribute(String json){
            AppProductAttributeSearchBean input = gson.fromJson(json,AppProductAttributeSearchBean.class);
            AppProductAttributeSearchBean output = (AppProductAttributeSearchBean) dao.searchAppProductAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppProductRecords", method = MqttMethod.GET)
	public String searchAppProductRecords(String json){
            AppProductRecordsSearchBean input = gson.fromJson(json,AppProductRecordsSearchBean.class);
            AppProductRecordsSearchBean output = (AppProductRecordsSearchBean) dao.searchAppProductRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppRoom", method = MqttMethod.GET)
	public String searchAppRoom(String json){
            AppRoomSearchBean input = gson.fromJson(json,AppRoomSearchBean.class);
            AppRoomSearchBean output = (AppRoomSearchBean) dao.searchAppRoom(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppService", method = MqttMethod.GET)
	public String searchAppService(String json){
            AppServiceSearchBean input = gson.fromJson(json,AppServiceSearchBean.class);
            AppServiceSearchBean output = (AppServiceSearchBean) dao.searchAppService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppServiceAttribute", method = MqttMethod.GET)
	public String searchAppServiceAttribute(String json){
            AppServiceAttributeSearchBean input = gson.fromJson(json,AppServiceAttributeSearchBean.class);
            AppServiceAttributeSearchBean output = (AppServiceAttributeSearchBean) dao.searchAppServiceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppServiceRecords", method = MqttMethod.GET)
	public String searchAppServiceRecords(String json){
            AppServiceRecordsSearchBean input = gson.fromJson(json,AppServiceRecordsSearchBean.class);
            AppServiceRecordsSearchBean output = (AppServiceRecordsSearchBean) dao.searchAppServiceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/searchAppUsers", method = MqttMethod.GET)
	public String searchAppUsers(String json){
            AppUsersSearchBean input = gson.fromJson(json,AppUsersSearchBean.class);
            AppUsersSearchBean output = (AppUsersSearchBean) dao.searchAppUsers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppAuthorities", method = MqttMethod.GET)
	public String readAppAuthorities(String json){
            AppAuthoritiesReadBean input = gson.fromJson(json,AppAuthoritiesReadBean.class);
            AppAuthoritiesReadBean output = (AppAuthoritiesReadBean) dao.readAppAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppCategory", method = MqttMethod.GET)
	public String readAppCategory(String json){
            AppCategoryReadBean input = gson.fromJson(json,AppCategoryReadBean.class);
            AppCategoryReadBean output = (AppCategoryReadBean) dao.readAppCategory(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppContact", method = MqttMethod.GET)
	public String readAppContact(String json){
            AppContactReadBean input = gson.fromJson(json,AppContactReadBean.class);
            AppContactReadBean output = (AppContactReadBean) dao.readAppContact(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppContract", method = MqttMethod.GET)
	public String readAppContract(String json){
            AppContractReadBean input = gson.fromJson(json,AppContractReadBean.class);
            AppContractReadBean output = (AppContractReadBean) dao.readAppContract(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppContractDevice", method = MqttMethod.GET)
	public String readAppContractDevice(String json){
            AppContractDeviceReadBean input = gson.fromJson(json,AppContractDeviceReadBean.class);
            AppContractDeviceReadBean output = (AppContractDeviceReadBean) dao.readAppContractDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppContractProduct", method = MqttMethod.GET)
	public String readAppContractProduct(String json){
            AppContractProductReadBean input = gson.fromJson(json,AppContractProductReadBean.class);
            AppContractProductReadBean output = (AppContractProductReadBean) dao.readAppContractProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppContractService", method = MqttMethod.GET)
	public String readAppContractService(String json){
            AppContractServiceReadBean input = gson.fromJson(json,AppContractServiceReadBean.class);
            AppContractServiceReadBean output = (AppContractServiceReadBean) dao.readAppContractService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppDevice", method = MqttMethod.GET)
	public String readAppDevice(String json){
            AppDeviceReadBean input = gson.fromJson(json,AppDeviceReadBean.class);
            AppDeviceReadBean output = (AppDeviceReadBean) dao.readAppDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppDeviceAttribute", method = MqttMethod.GET)
	public String readAppDeviceAttribute(String json){
            AppDeviceAttributeReadBean input = gson.fromJson(json,AppDeviceAttributeReadBean.class);
            AppDeviceAttributeReadBean output = (AppDeviceAttributeReadBean) dao.readAppDeviceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppDeviceRecords", method = MqttMethod.GET)
	public String readAppDeviceRecords(String json){
            AppDeviceRecordsReadBean input = gson.fromJson(json,AppDeviceRecordsReadBean.class);
            AppDeviceRecordsReadBean output = (AppDeviceRecordsReadBean) dao.readAppDeviceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppGroupAuthorities", method = MqttMethod.GET)
	public String readAppGroupAuthorities(String json){
            AppGroupAuthoritiesReadBean input = gson.fromJson(json,AppGroupAuthoritiesReadBean.class);
            AppGroupAuthoritiesReadBean output = (AppGroupAuthoritiesReadBean) dao.readAppGroupAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppGroupMembers", method = MqttMethod.GET)
	public String readAppGroupMembers(String json){
            AppGroupMembersReadBean input = gson.fromJson(json,AppGroupMembersReadBean.class);
            AppGroupMembersReadBean output = (AppGroupMembersReadBean) dao.readAppGroupMembers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppGroups", method = MqttMethod.GET)
	public String readAppGroups(String json){
            AppGroupsReadBean input = gson.fromJson(json,AppGroupsReadBean.class);
            AppGroupsReadBean output = (AppGroupsReadBean) dao.readAppGroups(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppMenus", method = MqttMethod.GET)
	public String readAppMenus(String json){
            AppMenusReadBean input = gson.fromJson(json,AppMenusReadBean.class);
            AppMenusReadBean output = (AppMenusReadBean) dao.readAppMenus(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppMessage", method = MqttMethod.GET)
	public String readAppMessage(String json){
            AppMessageReadBean input = gson.fromJson(json,AppMessageReadBean.class);
            AppMessageReadBean output = (AppMessageReadBean) dao.readAppMessage(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppPersistentLogins", method = MqttMethod.GET)
	public String readAppPersistentLogins(String json){
            AppPersistentLoginsReadBean input = gson.fromJson(json,AppPersistentLoginsReadBean.class);
            AppPersistentLoginsReadBean output = (AppPersistentLoginsReadBean) dao.readAppPersistentLogins(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppProduct", method = MqttMethod.GET)
	public String readAppProduct(String json){
            AppProductReadBean input = gson.fromJson(json,AppProductReadBean.class);
            AppProductReadBean output = (AppProductReadBean) dao.readAppProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppProductAttribute", method = MqttMethod.GET)
	public String readAppProductAttribute(String json){
            AppProductAttributeReadBean input = gson.fromJson(json,AppProductAttributeReadBean.class);
            AppProductAttributeReadBean output = (AppProductAttributeReadBean) dao.readAppProductAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppProductRecords", method = MqttMethod.GET)
	public String readAppProductRecords(String json){
            AppProductRecordsReadBean input = gson.fromJson(json,AppProductRecordsReadBean.class);
            AppProductRecordsReadBean output = (AppProductRecordsReadBean) dao.readAppProductRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppRoom", method = MqttMethod.GET)
	public String readAppRoom(String json){
            AppRoomReadBean input = gson.fromJson(json,AppRoomReadBean.class);
            AppRoomReadBean output = (AppRoomReadBean) dao.readAppRoom(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppService", method = MqttMethod.GET)
	public String readAppService(String json){
            AppServiceReadBean input = gson.fromJson(json,AppServiceReadBean.class);
            AppServiceReadBean output = (AppServiceReadBean) dao.readAppService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppServiceAttribute", method = MqttMethod.GET)
	public String readAppServiceAttribute(String json){
            AppServiceAttributeReadBean input = gson.fromJson(json,AppServiceAttributeReadBean.class);
            AppServiceAttributeReadBean output = (AppServiceAttributeReadBean) dao.readAppServiceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppServiceRecords", method = MqttMethod.GET)
	public String readAppServiceRecords(String json){
            AppServiceRecordsReadBean input = gson.fromJson(json,AppServiceRecordsReadBean.class);
            AppServiceRecordsReadBean output = (AppServiceRecordsReadBean) dao.readAppServiceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/readAppUsers", method = MqttMethod.GET)
	public String readAppUsers(String json){
            AppUsersReadBean input = gson.fromJson(json,AppUsersReadBean.class);
            AppUsersReadBean output = (AppUsersReadBean) dao.readAppUsers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppAuthorities", method = MqttMethod.POST)
	public String newAppAuthorities(String json){
            AppAuthoritiesNewBean input = gson.fromJson(json,AppAuthoritiesNewBean.class);
            AppAuthoritiesNewBean output = dao.newAppAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppCategory", method = MqttMethod.POST)
	public String newAppCategory(String json){
            AppCategoryNewBean input = gson.fromJson(json,AppCategoryNewBean.class);
            AppCategoryNewBean output = dao.newAppCategory(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppContact", method = MqttMethod.POST)
	public String newAppContact(String json){
            AppContactNewBean input = gson.fromJson(json,AppContactNewBean.class);
            AppContactNewBean output = dao.newAppContact(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppContract", method = MqttMethod.POST)
	public String newAppContract(String json){
            AppContractNewBean input = gson.fromJson(json,AppContractNewBean.class);
            AppContractNewBean output = dao.newAppContract(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppContractDevice", method = MqttMethod.POST)
	public String newAppContractDevice(String json){
            AppContractDeviceNewBean input = gson.fromJson(json,AppContractDeviceNewBean.class);
            AppContractDeviceNewBean output = dao.newAppContractDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppContractProduct", method = MqttMethod.POST)
	public String newAppContractProduct(String json){
            AppContractProductNewBean input = gson.fromJson(json,AppContractProductNewBean.class);
            AppContractProductNewBean output = dao.newAppContractProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppContractService", method = MqttMethod.POST)
	public String newAppContractService(String json){
            AppContractServiceNewBean input = gson.fromJson(json,AppContractServiceNewBean.class);
            AppContractServiceNewBean output = dao.newAppContractService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppDevice", method = MqttMethod.POST)
	public String newAppDevice(String json){
            AppDeviceNewBean input = gson.fromJson(json,AppDeviceNewBean.class);
            AppDeviceNewBean output = dao.newAppDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppDeviceAttribute", method = MqttMethod.POST)
	public String newAppDeviceAttribute(String json){
            AppDeviceAttributeNewBean input = gson.fromJson(json,AppDeviceAttributeNewBean.class);
            AppDeviceAttributeNewBean output = dao.newAppDeviceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppDeviceRecords", method = MqttMethod.POST)
	public String newAppDeviceRecords(String json){
            AppDeviceRecordsNewBean input = gson.fromJson(json,AppDeviceRecordsNewBean.class);
            AppDeviceRecordsNewBean output = dao.newAppDeviceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppGroupAuthorities", method = MqttMethod.POST)
	public String newAppGroupAuthorities(String json){
            AppGroupAuthoritiesNewBean input = gson.fromJson(json,AppGroupAuthoritiesNewBean.class);
            AppGroupAuthoritiesNewBean output = dao.newAppGroupAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppGroupMembers", method = MqttMethod.POST)
	public String newAppGroupMembers(String json){
            AppGroupMembersNewBean input = gson.fromJson(json,AppGroupMembersNewBean.class);
            AppGroupMembersNewBean output = dao.newAppGroupMembers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppGroups", method = MqttMethod.POST)
	public String newAppGroups(String json){
            AppGroupsNewBean input = gson.fromJson(json,AppGroupsNewBean.class);
            AppGroupsNewBean output = dao.newAppGroups(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppMenus", method = MqttMethod.POST)
	public String newAppMenus(String json){
            AppMenusNewBean input = gson.fromJson(json,AppMenusNewBean.class);
            AppMenusNewBean output = dao.newAppMenus(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppMessage", method = MqttMethod.POST)
	public String newAppMessage(String json){
            AppMessageNewBean input = gson.fromJson(json,AppMessageNewBean.class);
            AppMessageNewBean output = dao.newAppMessage(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppPersistentLogins", method = MqttMethod.POST)
	public String newAppPersistentLogins(String json){
            AppPersistentLoginsNewBean input = gson.fromJson(json,AppPersistentLoginsNewBean.class);
            AppPersistentLoginsNewBean output = dao.newAppPersistentLogins(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppProduct", method = MqttMethod.POST)
	public String newAppProduct(String json){
            AppProductNewBean input = gson.fromJson(json,AppProductNewBean.class);
            AppProductNewBean output = dao.newAppProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppProductAttribute", method = MqttMethod.POST)
	public String newAppProductAttribute(String json){
            AppProductAttributeNewBean input = gson.fromJson(json,AppProductAttributeNewBean.class);
            AppProductAttributeNewBean output = dao.newAppProductAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppProductRecords", method = MqttMethod.POST)
	public String newAppProductRecords(String json){
            AppProductRecordsNewBean input = gson.fromJson(json,AppProductRecordsNewBean.class);
            AppProductRecordsNewBean output = dao.newAppProductRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppRoom", method = MqttMethod.POST)
	public String newAppRoom(String json){
            AppRoomNewBean input = gson.fromJson(json,AppRoomNewBean.class);
            AppRoomNewBean output = dao.newAppRoom(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppService", method = MqttMethod.POST)
	public String newAppService(String json){
            AppServiceNewBean input = gson.fromJson(json,AppServiceNewBean.class);
            AppServiceNewBean output = dao.newAppService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppServiceAttribute", method = MqttMethod.POST)
	public String newAppServiceAttribute(String json){
            AppServiceAttributeNewBean input = gson.fromJson(json,AppServiceAttributeNewBean.class);
            AppServiceAttributeNewBean output = dao.newAppServiceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppServiceRecords", method = MqttMethod.POST)
	public String newAppServiceRecords(String json){
            AppServiceRecordsNewBean input = gson.fromJson(json,AppServiceRecordsNewBean.class);
            AppServiceRecordsNewBean output = dao.newAppServiceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/newAppUsers", method = MqttMethod.POST)
	public String newAppUsers(String json){
            AppUsersNewBean input = gson.fromJson(json,AppUsersNewBean.class);
            AppUsersNewBean output = dao.newAppUsers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppAuthorities", method = MqttMethod.PUT)
	public String writeAppAuthorities(String json){
            AppAuthoritiesWriteBean input = gson.fromJson(json,AppAuthoritiesWriteBean.class);
            AppAuthoritiesWriteBean output = (AppAuthoritiesWriteBean) dao.writeAppAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppCategory", method = MqttMethod.PUT)
	public String writeAppCategory(String json){
            AppCategoryWriteBean input = gson.fromJson(json,AppCategoryWriteBean.class);
            AppCategoryWriteBean output = (AppCategoryWriteBean) dao.writeAppCategory(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppContact", method = MqttMethod.PUT)
	public String writeAppContact(String json){
            AppContactWriteBean input = gson.fromJson(json,AppContactWriteBean.class);
            AppContactWriteBean output = (AppContactWriteBean) dao.writeAppContact(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppContract", method = MqttMethod.PUT)
	public String writeAppContract(String json){
            AppContractWriteBean input = gson.fromJson(json,AppContractWriteBean.class);
            AppContractWriteBean output = (AppContractWriteBean) dao.writeAppContract(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppContractDevice", method = MqttMethod.PUT)
	public String writeAppContractDevice(String json){
            AppContractDeviceWriteBean input = gson.fromJson(json,AppContractDeviceWriteBean.class);
            AppContractDeviceWriteBean output = (AppContractDeviceWriteBean) dao.writeAppContractDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppContractProduct", method = MqttMethod.PUT)
	public String writeAppContractProduct(String json){
            AppContractProductWriteBean input = gson.fromJson(json,AppContractProductWriteBean.class);
            AppContractProductWriteBean output = (AppContractProductWriteBean) dao.writeAppContractProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppContractService", method = MqttMethod.PUT)
	public String writeAppContractService(String json){
            AppContractServiceWriteBean input = gson.fromJson(json,AppContractServiceWriteBean.class);
            AppContractServiceWriteBean output = (AppContractServiceWriteBean) dao.writeAppContractService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppDevice", method = MqttMethod.PUT)
	public String writeAppDevice(String json){
            AppDeviceWriteBean input = gson.fromJson(json,AppDeviceWriteBean.class);
            AppDeviceWriteBean output = (AppDeviceWriteBean) dao.writeAppDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppDeviceAttribute", method = MqttMethod.PUT)
	public String writeAppDeviceAttribute(String json){
            AppDeviceAttributeWriteBean input = gson.fromJson(json,AppDeviceAttributeWriteBean.class);
            AppDeviceAttributeWriteBean output = (AppDeviceAttributeWriteBean) dao.writeAppDeviceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppDeviceRecords", method = MqttMethod.PUT)
	public String writeAppDeviceRecords(String json){
            AppDeviceRecordsWriteBean input = gson.fromJson(json,AppDeviceRecordsWriteBean.class);
            AppDeviceRecordsWriteBean output = (AppDeviceRecordsWriteBean) dao.writeAppDeviceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppGroupAuthorities", method = MqttMethod.PUT)
	public String writeAppGroupAuthorities(String json){
            AppGroupAuthoritiesWriteBean input = gson.fromJson(json,AppGroupAuthoritiesWriteBean.class);
            AppGroupAuthoritiesWriteBean output = (AppGroupAuthoritiesWriteBean) dao.writeAppGroupAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppGroupMembers", method = MqttMethod.PUT)
	public String writeAppGroupMembers(String json){
            AppGroupMembersWriteBean input = gson.fromJson(json,AppGroupMembersWriteBean.class);
            AppGroupMembersWriteBean output = (AppGroupMembersWriteBean) dao.writeAppGroupMembers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppGroups", method = MqttMethod.PUT)
	public String writeAppGroups(String json){
            AppGroupsWriteBean input = gson.fromJson(json,AppGroupsWriteBean.class);
            AppGroupsWriteBean output = (AppGroupsWriteBean) dao.writeAppGroups(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppMenus", method = MqttMethod.PUT)
	public String writeAppMenus(String json){
            AppMenusWriteBean input = gson.fromJson(json,AppMenusWriteBean.class);
            AppMenusWriteBean output = (AppMenusWriteBean) dao.writeAppMenus(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppMessage", method = MqttMethod.PUT)
	public String writeAppMessage(String json){
            AppMessageWriteBean input = gson.fromJson(json,AppMessageWriteBean.class);
            AppMessageWriteBean output = (AppMessageWriteBean) dao.writeAppMessage(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppPersistentLogins", method = MqttMethod.PUT)
	public String writeAppPersistentLogins(String json){
            AppPersistentLoginsWriteBean input = gson.fromJson(json,AppPersistentLoginsWriteBean.class);
            AppPersistentLoginsWriteBean output = (AppPersistentLoginsWriteBean) dao.writeAppPersistentLogins(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppProduct", method = MqttMethod.PUT)
	public String writeAppProduct(String json){
            AppProductWriteBean input = gson.fromJson(json,AppProductWriteBean.class);
            AppProductWriteBean output = (AppProductWriteBean) dao.writeAppProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppProductAttribute", method = MqttMethod.PUT)
	public String writeAppProductAttribute(String json){
            AppProductAttributeWriteBean input = gson.fromJson(json,AppProductAttributeWriteBean.class);
            AppProductAttributeWriteBean output = (AppProductAttributeWriteBean) dao.writeAppProductAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppProductRecords", method = MqttMethod.PUT)
	public String writeAppProductRecords(String json){
            AppProductRecordsWriteBean input = gson.fromJson(json,AppProductRecordsWriteBean.class);
            AppProductRecordsWriteBean output = (AppProductRecordsWriteBean) dao.writeAppProductRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppRoom", method = MqttMethod.PUT)
	public String writeAppRoom(String json){
            AppRoomWriteBean input = gson.fromJson(json,AppRoomWriteBean.class);
            AppRoomWriteBean output = (AppRoomWriteBean) dao.writeAppRoom(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppService", method = MqttMethod.PUT)
	public String writeAppService(String json){
            AppServiceWriteBean input = gson.fromJson(json,AppServiceWriteBean.class);
            AppServiceWriteBean output = (AppServiceWriteBean) dao.writeAppService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppServiceAttribute", method = MqttMethod.PUT)
	public String writeAppServiceAttribute(String json){
            AppServiceAttributeWriteBean input = gson.fromJson(json,AppServiceAttributeWriteBean.class);
            AppServiceAttributeWriteBean output = (AppServiceAttributeWriteBean) dao.writeAppServiceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppServiceRecords", method = MqttMethod.PUT)
	public String writeAppServiceRecords(String json){
            AppServiceRecordsWriteBean input = gson.fromJson(json,AppServiceRecordsWriteBean.class);
            AppServiceRecordsWriteBean output = (AppServiceRecordsWriteBean) dao.writeAppServiceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/writeAppUsers", method = MqttMethod.PUT)
	public String writeAppUsers(String json){
            AppUsersWriteBean input = gson.fromJson(json,AppUsersWriteBean.class);
            AppUsersWriteBean output = (AppUsersWriteBean) dao.writeAppUsers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppAuthorities", method = MqttMethod.DELETE)		
	public String deleteAppAuthorities(String json){
            AppAuthoritiesDeleteBean input = gson.fromJson(json,AppAuthoritiesDeleteBean.class);
            AppAuthoritiesDeleteBean output = (AppAuthoritiesDeleteBean) dao.deleteAppAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppCategory", method = MqttMethod.DELETE)		
	public String deleteAppCategory(String json){
            AppCategoryDeleteBean input = gson.fromJson(json,AppCategoryDeleteBean.class);
            AppCategoryDeleteBean output = (AppCategoryDeleteBean) dao.deleteAppCategory(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppContact", method = MqttMethod.DELETE)		
	public String deleteAppContact(String json){
            AppContactDeleteBean input = gson.fromJson(json,AppContactDeleteBean.class);
            AppContactDeleteBean output = (AppContactDeleteBean) dao.deleteAppContact(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppContract", method = MqttMethod.DELETE)		
	public String deleteAppContract(String json){
            AppContractDeleteBean input = gson.fromJson(json,AppContractDeleteBean.class);
            AppContractDeleteBean output = (AppContractDeleteBean) dao.deleteAppContract(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppContractDevice", method = MqttMethod.DELETE)		
	public String deleteAppContractDevice(String json){
            AppContractDeviceDeleteBean input = gson.fromJson(json,AppContractDeviceDeleteBean.class);
            AppContractDeviceDeleteBean output = (AppContractDeviceDeleteBean) dao.deleteAppContractDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppContractProduct", method = MqttMethod.DELETE)		
	public String deleteAppContractProduct(String json){
            AppContractProductDeleteBean input = gson.fromJson(json,AppContractProductDeleteBean.class);
            AppContractProductDeleteBean output = (AppContractProductDeleteBean) dao.deleteAppContractProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppContractService", method = MqttMethod.DELETE)		
	public String deleteAppContractService(String json){
            AppContractServiceDeleteBean input = gson.fromJson(json,AppContractServiceDeleteBean.class);
            AppContractServiceDeleteBean output = (AppContractServiceDeleteBean) dao.deleteAppContractService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppDevice", method = MqttMethod.DELETE)		
	public String deleteAppDevice(String json){
            AppDeviceDeleteBean input = gson.fromJson(json,AppDeviceDeleteBean.class);
            AppDeviceDeleteBean output = (AppDeviceDeleteBean) dao.deleteAppDevice(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppDeviceAttribute", method = MqttMethod.DELETE)		
	public String deleteAppDeviceAttribute(String json){
            AppDeviceAttributeDeleteBean input = gson.fromJson(json,AppDeviceAttributeDeleteBean.class);
            AppDeviceAttributeDeleteBean output = (AppDeviceAttributeDeleteBean) dao.deleteAppDeviceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppDeviceRecords", method = MqttMethod.DELETE)		
	public String deleteAppDeviceRecords(String json){
            AppDeviceRecordsDeleteBean input = gson.fromJson(json,AppDeviceRecordsDeleteBean.class);
            AppDeviceRecordsDeleteBean output = (AppDeviceRecordsDeleteBean) dao.deleteAppDeviceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppGroupAuthorities", method = MqttMethod.DELETE)		
	public String deleteAppGroupAuthorities(String json){
            AppGroupAuthoritiesDeleteBean input = gson.fromJson(json,AppGroupAuthoritiesDeleteBean.class);
            AppGroupAuthoritiesDeleteBean output = (AppGroupAuthoritiesDeleteBean) dao.deleteAppGroupAuthorities(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppGroupMembers", method = MqttMethod.DELETE)		
	public String deleteAppGroupMembers(String json){
            AppGroupMembersDeleteBean input = gson.fromJson(json,AppGroupMembersDeleteBean.class);
            AppGroupMembersDeleteBean output = (AppGroupMembersDeleteBean) dao.deleteAppGroupMembers(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppGroups", method = MqttMethod.DELETE)		
	public String deleteAppGroups(String json){
            AppGroupsDeleteBean input = gson.fromJson(json,AppGroupsDeleteBean.class);
            AppGroupsDeleteBean output = (AppGroupsDeleteBean) dao.deleteAppGroups(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppMenus", method = MqttMethod.DELETE)		
	public String deleteAppMenus(String json){
            AppMenusDeleteBean input = gson.fromJson(json,AppMenusDeleteBean.class);
            AppMenusDeleteBean output = (AppMenusDeleteBean) dao.deleteAppMenus(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppMessage", method = MqttMethod.DELETE)		
	public String deleteAppMessage(String json){
            AppMessageDeleteBean input = gson.fromJson(json,AppMessageDeleteBean.class);
            AppMessageDeleteBean output = (AppMessageDeleteBean) dao.deleteAppMessage(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppPersistentLogins", method = MqttMethod.DELETE)		
	public String deleteAppPersistentLogins(String json){
            AppPersistentLoginsDeleteBean input = gson.fromJson(json,AppPersistentLoginsDeleteBean.class);
            AppPersistentLoginsDeleteBean output = (AppPersistentLoginsDeleteBean) dao.deleteAppPersistentLogins(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppProduct", method = MqttMethod.DELETE)		
	public String deleteAppProduct(String json){
            AppProductDeleteBean input = gson.fromJson(json,AppProductDeleteBean.class);
            AppProductDeleteBean output = (AppProductDeleteBean) dao.deleteAppProduct(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppProductAttribute", method = MqttMethod.DELETE)		
	public String deleteAppProductAttribute(String json){
            AppProductAttributeDeleteBean input = gson.fromJson(json,AppProductAttributeDeleteBean.class);
            AppProductAttributeDeleteBean output = (AppProductAttributeDeleteBean) dao.deleteAppProductAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppProductRecords", method = MqttMethod.DELETE)		
	public String deleteAppProductRecords(String json){
            AppProductRecordsDeleteBean input = gson.fromJson(json,AppProductRecordsDeleteBean.class);
            AppProductRecordsDeleteBean output = (AppProductRecordsDeleteBean) dao.deleteAppProductRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppRoom", method = MqttMethod.DELETE)		
	public String deleteAppRoom(String json){
            AppRoomDeleteBean input = gson.fromJson(json,AppRoomDeleteBean.class);
            AppRoomDeleteBean output = (AppRoomDeleteBean) dao.deleteAppRoom(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppService", method = MqttMethod.DELETE)		
	public String deleteAppService(String json){
            AppServiceDeleteBean input = gson.fromJson(json,AppServiceDeleteBean.class);
            AppServiceDeleteBean output = (AppServiceDeleteBean) dao.deleteAppService(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppServiceAttribute", method = MqttMethod.DELETE)		
	public String deleteAppServiceAttribute(String json){
            AppServiceAttributeDeleteBean input = gson.fromJson(json,AppServiceAttributeDeleteBean.class);
            AppServiceAttributeDeleteBean output = (AppServiceAttributeDeleteBean) dao.deleteAppServiceAttribute(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppServiceRecords", method = MqttMethod.DELETE)		
	public String deleteAppServiceRecords(String json){
            AppServiceRecordsDeleteBean input = gson.fromJson(json,AppServiceRecordsDeleteBean.class);
            AppServiceRecordsDeleteBean output = (AppServiceRecordsDeleteBean) dao.deleteAppServiceRecords(input);
            return gson.toJson(output);
	}
	@MqttMapping(value = "/deleteAppUsers", method = MqttMethod.DELETE)		
	public String deleteAppUsers(String json){
            AppUsersDeleteBean input = gson.fromJson(json,AppUsersDeleteBean.class);
            AppUsersDeleteBean output = (AppUsersDeleteBean) dao.deleteAppUsers(input);
            return gson.toJson(output);
	}
}
