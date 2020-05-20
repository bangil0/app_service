package com.micro.msb.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.micro.msb.beans.*;

/**
 * Package : com.micro.msb.dao for myBatis
 * Class   : DaoManager
 * @author : Yan Yan Purdiansah
 */

@Component 
public class DaoManager {

	private final SqlSession sqlSession;

	public DaoManager(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public Integer countAppAuthoritiesSearch(AppAuthoritiesSearchBean input){
		return sqlSession.selectOne("countAppAuthoritiesSearch",input);
	}
	
	public AppAuthoritiesSearchBean searchAppAuthorities(AppAuthoritiesSearchBean input){
       List<AppAuthoritiesBean> output = new ArrayList<AppAuthoritiesBean>();       
       output = sqlSession.selectList("searchAppAuthorities", input);
       input.setAppAuthorities(output);
       return input;	
	}
	
	public Integer countAppCategorySearch(AppCategorySearchBean input){
		return sqlSession.selectOne("countAppCategorySearch",input);
	}
	
	public AppCategorySearchBean searchAppCategory(AppCategorySearchBean input){
       List<AppCategoryBean> output = new ArrayList<AppCategoryBean>();       
       output = sqlSession.selectList("searchAppCategory", input);
       input.setAppCategory(output);
       return input;	
	}
	
	public Integer countAppContactSearch(AppContactSearchBean input){
		return sqlSession.selectOne("countAppContactSearch",input);
	}
	
	public AppContactSearchBean searchAppContact(AppContactSearchBean input){
       List<AppContactBean> output = new ArrayList<AppContactBean>();       
       output = sqlSession.selectList("searchAppContact", input);
       input.setAppContact(output);
       return input;	
	}
	
	public Integer countAppContractSearch(AppContractSearchBean input){
		return sqlSession.selectOne("countAppContractSearch",input);
	}
	
	public AppContractSearchBean searchAppContract(AppContractSearchBean input){
       List<AppContractBean> output = new ArrayList<AppContractBean>();       
       output = sqlSession.selectList("searchAppContract", input);
       input.setAppContract(output);
       return input;	
	}
	
	public Integer countAppContractDeviceSearch(AppContractDeviceSearchBean input){
		return sqlSession.selectOne("countAppContractDeviceSearch",input);
	}
	
	public AppContractDeviceSearchBean searchAppContractDevice(AppContractDeviceSearchBean input){
       List<AppContractDeviceBean> output = new ArrayList<AppContractDeviceBean>();       
       output = sqlSession.selectList("searchAppContractDevice", input);
       input.setAppContractDevice(output);
       return input;	
	}
	
	public Integer countAppContractProductSearch(AppContractProductSearchBean input){
		return sqlSession.selectOne("countAppContractProductSearch",input);
	}
	
	public AppContractProductSearchBean searchAppContractProduct(AppContractProductSearchBean input){
       List<AppContractProductBean> output = new ArrayList<AppContractProductBean>();       
       output = sqlSession.selectList("searchAppContractProduct", input);
       input.setAppContractProduct(output);
       return input;	
	}
	
	public Integer countAppContractServiceSearch(AppContractServiceSearchBean input){
		return sqlSession.selectOne("countAppContractServiceSearch",input);
	}
	
	public AppContractServiceSearchBean searchAppContractService(AppContractServiceSearchBean input){
       List<AppContractServiceBean> output = new ArrayList<AppContractServiceBean>();       
       output = sqlSession.selectList("searchAppContractService", input);
       input.setAppContractService(output);
       return input;	
	}
	
	public Integer countAppDeviceSearch(AppDeviceSearchBean input){
		return sqlSession.selectOne("countAppDeviceSearch",input);
	}
	
	public AppDeviceSearchBean searchAppDevice(AppDeviceSearchBean input){
       List<AppDeviceBean> output = new ArrayList<AppDeviceBean>();       
       output = sqlSession.selectList("searchAppDevice", input);
       input.setAppDevice(output);
       return input;	
	}
	
	public Integer countAppDeviceAttributeSearch(AppDeviceAttributeSearchBean input){
		return sqlSession.selectOne("countAppDeviceAttributeSearch",input);
	}
	
	public AppDeviceAttributeSearchBean searchAppDeviceAttribute(AppDeviceAttributeSearchBean input){
       List<AppDeviceAttributeBean> output = new ArrayList<AppDeviceAttributeBean>();       
       output = sqlSession.selectList("searchAppDeviceAttribute", input);
       input.setAppDeviceAttribute(output);
       return input;	
	}
	
	public Integer countAppDeviceRecordsSearch(AppDeviceRecordsSearchBean input){
		return sqlSession.selectOne("countAppDeviceRecordsSearch",input);
	}
	
	public AppDeviceRecordsSearchBean searchAppDeviceRecords(AppDeviceRecordsSearchBean input){
       List<AppDeviceRecordsBean> output = new ArrayList<AppDeviceRecordsBean>();       
       output = sqlSession.selectList("searchAppDeviceRecords", input);
       input.setAppDeviceRecords(output);
       return input;	
	}
	
	public Integer countAppGroupAuthoritiesSearch(AppGroupAuthoritiesSearchBean input){
		return sqlSession.selectOne("countAppGroupAuthoritiesSearch",input);
	}
	
	public AppGroupAuthoritiesSearchBean searchAppGroupAuthorities(AppGroupAuthoritiesSearchBean input){
       List<AppGroupAuthoritiesBean> output = new ArrayList<AppGroupAuthoritiesBean>();       
       output = sqlSession.selectList("searchAppGroupAuthorities", input);
       input.setAppGroupAuthorities(output);
       return input;	
	}
	
	public Integer countAppGroupMembersSearch(AppGroupMembersSearchBean input){
		return sqlSession.selectOne("countAppGroupMembersSearch",input);
	}
	
	public AppGroupMembersSearchBean searchAppGroupMembers(AppGroupMembersSearchBean input){
       List<AppGroupMembersBean> output = new ArrayList<AppGroupMembersBean>();       
       output = sqlSession.selectList("searchAppGroupMembers", input);
       input.setAppGroupMembers(output);
       return input;	
	}
	
	public Integer countAppGroupsSearch(AppGroupsSearchBean input){
		return sqlSession.selectOne("countAppGroupsSearch",input);
	}
	
	public AppGroupsSearchBean searchAppGroups(AppGroupsSearchBean input){
       List<AppGroupsBean> output = new ArrayList<AppGroupsBean>();       
       output = sqlSession.selectList("searchAppGroups", input);
       input.setAppGroups(output);
       return input;	
	}
	
	public Integer countAppMenusSearch(AppMenusSearchBean input){
		return sqlSession.selectOne("countAppMenusSearch",input);
	}
	
	public AppMenusSearchBean searchAppMenus(AppMenusSearchBean input){
       List<AppMenusBean> output = new ArrayList<AppMenusBean>();       
       output = sqlSession.selectList("searchAppMenus", input);
       input.setAppMenus(output);
       return input;	
	}
	
	public Integer countAppMessageSearch(AppMessageSearchBean input){
		return sqlSession.selectOne("countAppMessageSearch",input);
	}
	
	public AppMessageSearchBean searchAppMessage(AppMessageSearchBean input){
       List<AppMessageBean> output = new ArrayList<AppMessageBean>();       
       output = sqlSession.selectList("searchAppMessage", input);
       input.setAppMessage(output);
       return input;	
	}
	
	public Integer countAppPersistentLoginsSearch(AppPersistentLoginsSearchBean input){
		return sqlSession.selectOne("countAppPersistentLoginsSearch",input);
	}
	
	public AppPersistentLoginsSearchBean searchAppPersistentLogins(AppPersistentLoginsSearchBean input){
       List<AppPersistentLoginsBean> output = new ArrayList<AppPersistentLoginsBean>();       
       output = sqlSession.selectList("searchAppPersistentLogins", input);
       input.setAppPersistentLogins(output);
       return input;	
	}
	
	public Integer countAppProductSearch(AppProductSearchBean input){
		return sqlSession.selectOne("countAppProductSearch",input);
	}
	
	public AppProductSearchBean searchAppProduct(AppProductSearchBean input){
       List<AppProductBean> output = new ArrayList<AppProductBean>();       
       output = sqlSession.selectList("searchAppProduct", input);
       input.setAppProduct(output);
       return input;	
	}
	
	public Integer countAppProductAttributeSearch(AppProductAttributeSearchBean input){
		return sqlSession.selectOne("countAppProductAttributeSearch",input);
	}
	
	public AppProductAttributeSearchBean searchAppProductAttribute(AppProductAttributeSearchBean input){
       List<AppProductAttributeBean> output = new ArrayList<AppProductAttributeBean>();       
       output = sqlSession.selectList("searchAppProductAttribute", input);
       input.setAppProductAttribute(output);
       return input;	
	}
	
	public Integer countAppProductRecordsSearch(AppProductRecordsSearchBean input){
		return sqlSession.selectOne("countAppProductRecordsSearch",input);
	}
	
	public AppProductRecordsSearchBean searchAppProductRecords(AppProductRecordsSearchBean input){
       List<AppProductRecordsBean> output = new ArrayList<AppProductRecordsBean>();       
       output = sqlSession.selectList("searchAppProductRecords", input);
       input.setAppProductRecords(output);
       return input;	
	}
	
	public Integer countAppRoomSearch(AppRoomSearchBean input){
		return sqlSession.selectOne("countAppRoomSearch",input);
	}
	
	public AppRoomSearchBean searchAppRoom(AppRoomSearchBean input){
       List<AppRoomBean> output = new ArrayList<AppRoomBean>();       
       output = sqlSession.selectList("searchAppRoom", input);
       input.setAppRoom(output);
       return input;	
	}
	
	public Integer countAppServiceSearch(AppServiceSearchBean input){
		return sqlSession.selectOne("countAppServiceSearch",input);
	}
	
	public AppServiceSearchBean searchAppService(AppServiceSearchBean input){
       List<AppServiceBean> output = new ArrayList<AppServiceBean>();       
       output = sqlSession.selectList("searchAppService", input);
       input.setAppService(output);
       return input;	
	}
	
	public Integer countAppServiceAttributeSearch(AppServiceAttributeSearchBean input){
		return sqlSession.selectOne("countAppServiceAttributeSearch",input);
	}
	
	public AppServiceAttributeSearchBean searchAppServiceAttribute(AppServiceAttributeSearchBean input){
       List<AppServiceAttributeBean> output = new ArrayList<AppServiceAttributeBean>();       
       output = sqlSession.selectList("searchAppServiceAttribute", input);
       input.setAppServiceAttribute(output);
       return input;	
	}
	
	public Integer countAppServiceRecordsSearch(AppServiceRecordsSearchBean input){
		return sqlSession.selectOne("countAppServiceRecordsSearch",input);
	}
	
	public AppServiceRecordsSearchBean searchAppServiceRecords(AppServiceRecordsSearchBean input){
       List<AppServiceRecordsBean> output = new ArrayList<AppServiceRecordsBean>();       
       output = sqlSession.selectList("searchAppServiceRecords", input);
       input.setAppServiceRecords(output);
       return input;	
	}
	
	public Integer countAppUsersSearch(AppUsersSearchBean input){
		return sqlSession.selectOne("countAppUsersSearch",input);
	}
	
	public AppUsersSearchBean searchAppUsers(AppUsersSearchBean input){
       List<AppUsersBean> output = new ArrayList<AppUsersBean>();       
       output = sqlSession.selectList("searchAppUsers", input);
       input.setAppUsers(output);
       return input;	
	}
	
	public AppAuthoritiesReadBean readAppAuthorities(AppAuthoritiesReadBean input){
       return sqlSession.selectOne("readAppAuthorities", input);
	}	
	
	public AppCategoryReadBean readAppCategory(AppCategoryReadBean input){
       return sqlSession.selectOne("readAppCategory", input);
	}	
	
	public AppContactReadBean readAppContact(AppContactReadBean input){
       return sqlSession.selectOne("readAppContact", input);
	}	
	
	public AppContractReadBean readAppContract(AppContractReadBean input){
       return sqlSession.selectOne("readAppContract", input);
	}	
	
	public AppContractDeviceReadBean readAppContractDevice(AppContractDeviceReadBean input){
       return sqlSession.selectOne("readAppContractDevice", input);
	}	
	
	public AppContractProductReadBean readAppContractProduct(AppContractProductReadBean input){
       return sqlSession.selectOne("readAppContractProduct", input);
	}	
	
	public AppContractServiceReadBean readAppContractService(AppContractServiceReadBean input){
       return sqlSession.selectOne("readAppContractService", input);
	}	
	
	public AppDeviceReadBean readAppDevice(AppDeviceReadBean input){
       return sqlSession.selectOne("readAppDevice", input);
	}	
	
	public AppDeviceAttributeReadBean readAppDeviceAttribute(AppDeviceAttributeReadBean input){
       return sqlSession.selectOne("readAppDeviceAttribute", input);
	}	
	
	public AppDeviceRecordsReadBean readAppDeviceRecords(AppDeviceRecordsReadBean input){
       return sqlSession.selectOne("readAppDeviceRecords", input);
	}	
	
	public AppGroupAuthoritiesReadBean readAppGroupAuthorities(AppGroupAuthoritiesReadBean input){
       return sqlSession.selectOne("readAppGroupAuthorities", input);
	}	
	
	public AppGroupMembersReadBean readAppGroupMembers(AppGroupMembersReadBean input){
       return sqlSession.selectOne("readAppGroupMembers", input);
	}	
	
	public AppGroupsReadBean readAppGroups(AppGroupsReadBean input){
       return sqlSession.selectOne("readAppGroups", input);
	}	
	
	public AppMenusReadBean readAppMenus(AppMenusReadBean input){
       return sqlSession.selectOne("readAppMenus", input);
	}	
	
	public AppMessageReadBean readAppMessage(AppMessageReadBean input){
       return sqlSession.selectOne("readAppMessage", input);
	}	
	
	public AppPersistentLoginsReadBean readAppPersistentLogins(AppPersistentLoginsReadBean input){
       return sqlSession.selectOne("readAppPersistentLogins", input);
	}	
	
	public AppProductReadBean readAppProduct(AppProductReadBean input){
       return sqlSession.selectOne("readAppProduct", input);
	}	
	
	public AppProductAttributeReadBean readAppProductAttribute(AppProductAttributeReadBean input){
       return sqlSession.selectOne("readAppProductAttribute", input);
	}	
	
	public AppProductRecordsReadBean readAppProductRecords(AppProductRecordsReadBean input){
       return sqlSession.selectOne("readAppProductRecords", input);
	}	
	
	public AppRoomReadBean readAppRoom(AppRoomReadBean input){
       return sqlSession.selectOne("readAppRoom", input);
	}	
	
	public AppServiceReadBean readAppService(AppServiceReadBean input){
       return sqlSession.selectOne("readAppService", input);
	}	
	
	public AppServiceAttributeReadBean readAppServiceAttribute(AppServiceAttributeReadBean input){
       return sqlSession.selectOne("readAppServiceAttribute", input);
	}	
	
	public AppServiceRecordsReadBean readAppServiceRecords(AppServiceRecordsReadBean input){
       return sqlSession.selectOne("readAppServiceRecords", input);
	}	
	
	public AppUsersReadBean readAppUsers(AppUsersReadBean input){
       return sqlSession.selectOne("readAppUsers", input);
	}	
	
	public AppAuthoritiesNewBean newAppAuthorities(AppAuthoritiesNewBean input){
       AppAuthoritiesNewBean output = new AppAuthoritiesNewBean();       
       int ret = sqlSession.insert("newAppAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppCategoryNewBean newAppCategory(AppCategoryNewBean input){
       AppCategoryNewBean output = new AppCategoryNewBean();       
       int ret = sqlSession.insert("newAppCategory", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContactNewBean newAppContact(AppContactNewBean input){
       AppContactNewBean output = new AppContactNewBean();       
       int ret = sqlSession.insert("newAppContact", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractNewBean newAppContract(AppContractNewBean input){
       AppContractNewBean output = new AppContractNewBean();       
       int ret = sqlSession.insert("newAppContract", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractDeviceNewBean newAppContractDevice(AppContractDeviceNewBean input){
       AppContractDeviceNewBean output = new AppContractDeviceNewBean();       
       int ret = sqlSession.insert("newAppContractDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractProductNewBean newAppContractProduct(AppContractProductNewBean input){
       AppContractProductNewBean output = new AppContractProductNewBean();       
       int ret = sqlSession.insert("newAppContractProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractServiceNewBean newAppContractService(AppContractServiceNewBean input){
       AppContractServiceNewBean output = new AppContractServiceNewBean();       
       int ret = sqlSession.insert("newAppContractService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceNewBean newAppDevice(AppDeviceNewBean input){
       AppDeviceNewBean output = new AppDeviceNewBean();       
       int ret = sqlSession.insert("newAppDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceAttributeNewBean newAppDeviceAttribute(AppDeviceAttributeNewBean input){
       AppDeviceAttributeNewBean output = new AppDeviceAttributeNewBean();       
       int ret = sqlSession.insert("newAppDeviceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceRecordsNewBean newAppDeviceRecords(AppDeviceRecordsNewBean input){
       AppDeviceRecordsNewBean output = new AppDeviceRecordsNewBean();       
       int ret = sqlSession.insert("newAppDeviceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupAuthoritiesNewBean newAppGroupAuthorities(AppGroupAuthoritiesNewBean input){
       AppGroupAuthoritiesNewBean output = new AppGroupAuthoritiesNewBean();       
       int ret = sqlSession.insert("newAppGroupAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupMembersNewBean newAppGroupMembers(AppGroupMembersNewBean input){
       AppGroupMembersNewBean output = new AppGroupMembersNewBean();       
       int ret = sqlSession.insert("newAppGroupMembers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupsNewBean newAppGroups(AppGroupsNewBean input){
       AppGroupsNewBean output = new AppGroupsNewBean();       
       int ret = sqlSession.insert("newAppGroups", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMenusNewBean newAppMenus(AppMenusNewBean input){
       AppMenusNewBean output = new AppMenusNewBean();       
       int ret = sqlSession.insert("newAppMenus", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMessageNewBean newAppMessage(AppMessageNewBean input){
       AppMessageNewBean output = new AppMessageNewBean();       
       int ret = sqlSession.insert("newAppMessage", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppPersistentLoginsNewBean newAppPersistentLogins(AppPersistentLoginsNewBean input){
       AppPersistentLoginsNewBean output = new AppPersistentLoginsNewBean();       
       int ret = sqlSession.insert("newAppPersistentLogins", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductNewBean newAppProduct(AppProductNewBean input){
       AppProductNewBean output = new AppProductNewBean();       
       int ret = sqlSession.insert("newAppProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductAttributeNewBean newAppProductAttribute(AppProductAttributeNewBean input){
       AppProductAttributeNewBean output = new AppProductAttributeNewBean();       
       int ret = sqlSession.insert("newAppProductAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductRecordsNewBean newAppProductRecords(AppProductRecordsNewBean input){
       AppProductRecordsNewBean output = new AppProductRecordsNewBean();       
       int ret = sqlSession.insert("newAppProductRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppRoomNewBean newAppRoom(AppRoomNewBean input){
       AppRoomNewBean output = new AppRoomNewBean();       
       int ret = sqlSession.insert("newAppRoom", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceNewBean newAppService(AppServiceNewBean input){
       AppServiceNewBean output = new AppServiceNewBean();       
       int ret = sqlSession.insert("newAppService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceAttributeNewBean newAppServiceAttribute(AppServiceAttributeNewBean input){
       AppServiceAttributeNewBean output = new AppServiceAttributeNewBean();       
       int ret = sqlSession.insert("newAppServiceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceRecordsNewBean newAppServiceRecords(AppServiceRecordsNewBean input){
       AppServiceRecordsNewBean output = new AppServiceRecordsNewBean();       
       int ret = sqlSession.insert("newAppServiceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppUsersNewBean newAppUsers(AppUsersNewBean input){
       AppUsersNewBean output = new AppUsersNewBean();       
       int ret = sqlSession.insert("newAppUsers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppAuthoritiesWriteBean writeAppAuthorities(AppAuthoritiesWriteBean input){
       AppAuthoritiesWriteBean output = new AppAuthoritiesWriteBean();       
       int ret = sqlSession.update("writeAppAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppCategoryWriteBean writeAppCategory(AppCategoryWriteBean input){
       AppCategoryWriteBean output = new AppCategoryWriteBean();       
       int ret = sqlSession.update("writeAppCategory", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContactWriteBean writeAppContact(AppContactWriteBean input){
       AppContactWriteBean output = new AppContactWriteBean();       
       int ret = sqlSession.update("writeAppContact", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractWriteBean writeAppContract(AppContractWriteBean input){
       AppContractWriteBean output = new AppContractWriteBean();       
       int ret = sqlSession.update("writeAppContract", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractDeviceWriteBean writeAppContractDevice(AppContractDeviceWriteBean input){
       AppContractDeviceWriteBean output = new AppContractDeviceWriteBean();       
       int ret = sqlSession.update("writeAppContractDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractProductWriteBean writeAppContractProduct(AppContractProductWriteBean input){
       AppContractProductWriteBean output = new AppContractProductWriteBean();       
       int ret = sqlSession.update("writeAppContractProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractServiceWriteBean writeAppContractService(AppContractServiceWriteBean input){
       AppContractServiceWriteBean output = new AppContractServiceWriteBean();       
       int ret = sqlSession.update("writeAppContractService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceWriteBean writeAppDevice(AppDeviceWriteBean input){
       AppDeviceWriteBean output = new AppDeviceWriteBean();       
       int ret = sqlSession.update("writeAppDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceAttributeWriteBean writeAppDeviceAttribute(AppDeviceAttributeWriteBean input){
       AppDeviceAttributeWriteBean output = new AppDeviceAttributeWriteBean();       
       int ret = sqlSession.update("writeAppDeviceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceRecordsWriteBean writeAppDeviceRecords(AppDeviceRecordsWriteBean input){
       AppDeviceRecordsWriteBean output = new AppDeviceRecordsWriteBean();       
       int ret = sqlSession.update("writeAppDeviceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupAuthoritiesWriteBean writeAppGroupAuthorities(AppGroupAuthoritiesWriteBean input){
       AppGroupAuthoritiesWriteBean output = new AppGroupAuthoritiesWriteBean();       
       int ret = sqlSession.update("writeAppGroupAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupMembersWriteBean writeAppGroupMembers(AppGroupMembersWriteBean input){
       AppGroupMembersWriteBean output = new AppGroupMembersWriteBean();       
       int ret = sqlSession.update("writeAppGroupMembers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupsWriteBean writeAppGroups(AppGroupsWriteBean input){
       AppGroupsWriteBean output = new AppGroupsWriteBean();       
       int ret = sqlSession.update("writeAppGroups", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMenusWriteBean writeAppMenus(AppMenusWriteBean input){
       AppMenusWriteBean output = new AppMenusWriteBean();       
       int ret = sqlSession.update("writeAppMenus", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMessageWriteBean writeAppMessage(AppMessageWriteBean input){
       AppMessageWriteBean output = new AppMessageWriteBean();       
       int ret = sqlSession.update("writeAppMessage", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppPersistentLoginsWriteBean writeAppPersistentLogins(AppPersistentLoginsWriteBean input){
       AppPersistentLoginsWriteBean output = new AppPersistentLoginsWriteBean();       
       int ret = sqlSession.update("writeAppPersistentLogins", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductWriteBean writeAppProduct(AppProductWriteBean input){
       AppProductWriteBean output = new AppProductWriteBean();       
       int ret = sqlSession.update("writeAppProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductAttributeWriteBean writeAppProductAttribute(AppProductAttributeWriteBean input){
       AppProductAttributeWriteBean output = new AppProductAttributeWriteBean();       
       int ret = sqlSession.update("writeAppProductAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductRecordsWriteBean writeAppProductRecords(AppProductRecordsWriteBean input){
       AppProductRecordsWriteBean output = new AppProductRecordsWriteBean();       
       int ret = sqlSession.update("writeAppProductRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppRoomWriteBean writeAppRoom(AppRoomWriteBean input){
       AppRoomWriteBean output = new AppRoomWriteBean();       
       int ret = sqlSession.update("writeAppRoom", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceWriteBean writeAppService(AppServiceWriteBean input){
       AppServiceWriteBean output = new AppServiceWriteBean();       
       int ret = sqlSession.update("writeAppService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceAttributeWriteBean writeAppServiceAttribute(AppServiceAttributeWriteBean input){
       AppServiceAttributeWriteBean output = new AppServiceAttributeWriteBean();       
       int ret = sqlSession.update("writeAppServiceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceRecordsWriteBean writeAppServiceRecords(AppServiceRecordsWriteBean input){
       AppServiceRecordsWriteBean output = new AppServiceRecordsWriteBean();       
       int ret = sqlSession.update("writeAppServiceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppUsersWriteBean writeAppUsers(AppUsersWriteBean input){
       AppUsersWriteBean output = new AppUsersWriteBean();       
       int ret = sqlSession.update("writeAppUsers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppAuthoritiesDeleteBean deleteAppAuthorities(AppAuthoritiesDeleteBean input){
       AppAuthoritiesDeleteBean output = new AppAuthoritiesDeleteBean();       
       int ret = sqlSession.delete("deleteAppAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppCategoryDeleteBean deleteAppCategory(AppCategoryDeleteBean input){
       AppCategoryDeleteBean output = new AppCategoryDeleteBean();       
       int ret = sqlSession.delete("deleteAppCategory", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContactDeleteBean deleteAppContact(AppContactDeleteBean input){
       AppContactDeleteBean output = new AppContactDeleteBean();       
       int ret = sqlSession.delete("deleteAppContact", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractDeleteBean deleteAppContract(AppContractDeleteBean input){
       AppContractDeleteBean output = new AppContractDeleteBean();       
       int ret = sqlSession.delete("deleteAppContract", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractDeviceDeleteBean deleteAppContractDevice(AppContractDeviceDeleteBean input){
       AppContractDeviceDeleteBean output = new AppContractDeviceDeleteBean();       
       int ret = sqlSession.delete("deleteAppContractDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractProductDeleteBean deleteAppContractProduct(AppContractProductDeleteBean input){
       AppContractProductDeleteBean output = new AppContractProductDeleteBean();       
       int ret = sqlSession.delete("deleteAppContractProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppContractServiceDeleteBean deleteAppContractService(AppContractServiceDeleteBean input){
       AppContractServiceDeleteBean output = new AppContractServiceDeleteBean();       
       int ret = sqlSession.delete("deleteAppContractService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceDeleteBean deleteAppDevice(AppDeviceDeleteBean input){
       AppDeviceDeleteBean output = new AppDeviceDeleteBean();       
       int ret = sqlSession.delete("deleteAppDevice", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceAttributeDeleteBean deleteAppDeviceAttribute(AppDeviceAttributeDeleteBean input){
       AppDeviceAttributeDeleteBean output = new AppDeviceAttributeDeleteBean();       
       int ret = sqlSession.delete("deleteAppDeviceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppDeviceRecordsDeleteBean deleteAppDeviceRecords(AppDeviceRecordsDeleteBean input){
       AppDeviceRecordsDeleteBean output = new AppDeviceRecordsDeleteBean();       
       int ret = sqlSession.delete("deleteAppDeviceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupAuthoritiesDeleteBean deleteAppGroupAuthorities(AppGroupAuthoritiesDeleteBean input){
       AppGroupAuthoritiesDeleteBean output = new AppGroupAuthoritiesDeleteBean();       
       int ret = sqlSession.delete("deleteAppGroupAuthorities", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupMembersDeleteBean deleteAppGroupMembers(AppGroupMembersDeleteBean input){
       AppGroupMembersDeleteBean output = new AppGroupMembersDeleteBean();       
       int ret = sqlSession.delete("deleteAppGroupMembers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppGroupsDeleteBean deleteAppGroups(AppGroupsDeleteBean input){
       AppGroupsDeleteBean output = new AppGroupsDeleteBean();       
       int ret = sqlSession.delete("deleteAppGroups", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMenusDeleteBean deleteAppMenus(AppMenusDeleteBean input){
       AppMenusDeleteBean output = new AppMenusDeleteBean();       
       int ret = sqlSession.delete("deleteAppMenus", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppMessageDeleteBean deleteAppMessage(AppMessageDeleteBean input){
       AppMessageDeleteBean output = new AppMessageDeleteBean();       
       int ret = sqlSession.delete("deleteAppMessage", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppPersistentLoginsDeleteBean deleteAppPersistentLogins(AppPersistentLoginsDeleteBean input){
       AppPersistentLoginsDeleteBean output = new AppPersistentLoginsDeleteBean();       
       int ret = sqlSession.delete("deleteAppPersistentLogins", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductDeleteBean deleteAppProduct(AppProductDeleteBean input){
       AppProductDeleteBean output = new AppProductDeleteBean();       
       int ret = sqlSession.delete("deleteAppProduct", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductAttributeDeleteBean deleteAppProductAttribute(AppProductAttributeDeleteBean input){
       AppProductAttributeDeleteBean output = new AppProductAttributeDeleteBean();       
       int ret = sqlSession.delete("deleteAppProductAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppProductRecordsDeleteBean deleteAppProductRecords(AppProductRecordsDeleteBean input){
       AppProductRecordsDeleteBean output = new AppProductRecordsDeleteBean();       
       int ret = sqlSession.delete("deleteAppProductRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppRoomDeleteBean deleteAppRoom(AppRoomDeleteBean input){
       AppRoomDeleteBean output = new AppRoomDeleteBean();       
       int ret = sqlSession.delete("deleteAppRoom", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceDeleteBean deleteAppService(AppServiceDeleteBean input){
       AppServiceDeleteBean output = new AppServiceDeleteBean();       
       int ret = sqlSession.delete("deleteAppService", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceAttributeDeleteBean deleteAppServiceAttribute(AppServiceAttributeDeleteBean input){
       AppServiceAttributeDeleteBean output = new AppServiceAttributeDeleteBean();       
       int ret = sqlSession.delete("deleteAppServiceAttribute", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppServiceRecordsDeleteBean deleteAppServiceRecords(AppServiceRecordsDeleteBean input){
       AppServiceRecordsDeleteBean output = new AppServiceRecordsDeleteBean();       
       int ret = sqlSession.delete("deleteAppServiceRecords", input);
       if (ret == 0) return output;
       else return input;
	}	
	
	public AppUsersDeleteBean deleteAppUsers(AppUsersDeleteBean input){
       AppUsersDeleteBean output = new AppUsersDeleteBean();       
       int ret = sqlSession.delete("deleteAppUsers", input);
       if (ret == 0) return output;
       else return input;
	}	
	
}
