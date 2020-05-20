package com.micro.msb.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.micro.msb.beans.*;
import com.micro.msb.dao.DaoManager;
import javax.validation.Valid;
import io.swagger.annotations.Api;

/**
 * Package : com.micro.msb.swagger for RestFull API
 * Class   : SwaggerRestController
 * @author : Yan Yan Purdiansah
 */

@RestController
@Api(tags = "Microservice")  
public class SwaggerRestController {

	@Autowired
	private DaoManager dao;
	
	@RequestMapping(value = "/searchAppAuthoritiesRest", method = RequestMethod.GET)
	public AppAuthoritiesSearchBean searchAppAuthorities(AppAuthoritiesSearchBean input){
            AppAuthoritiesSearchBean output = (AppAuthoritiesSearchBean) dao.searchAppAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/searchAppCategoryRest", method = RequestMethod.GET)
	public AppCategorySearchBean searchAppCategory(AppCategorySearchBean input){
            AppCategorySearchBean output = (AppCategorySearchBean) dao.searchAppCategory(input);
            return output;
	}
	@RequestMapping(value = "/searchAppContactRest", method = RequestMethod.GET)
	public AppContactSearchBean searchAppContact(AppContactSearchBean input){
            AppContactSearchBean output = (AppContactSearchBean) dao.searchAppContact(input);
            return output;
	}
	@RequestMapping(value = "/searchAppContractRest", method = RequestMethod.GET)
	public AppContractSearchBean searchAppContract(AppContractSearchBean input){
            AppContractSearchBean output = (AppContractSearchBean) dao.searchAppContract(input);
            return output;
	}
	@RequestMapping(value = "/searchAppContractDeviceRest", method = RequestMethod.GET)
	public AppContractDeviceSearchBean searchAppContractDevice(AppContractDeviceSearchBean input){
            AppContractDeviceSearchBean output = (AppContractDeviceSearchBean) dao.searchAppContractDevice(input);
            return output;
	}
	@RequestMapping(value = "/searchAppContractProductRest", method = RequestMethod.GET)
	public AppContractProductSearchBean searchAppContractProduct(AppContractProductSearchBean input){
            AppContractProductSearchBean output = (AppContractProductSearchBean) dao.searchAppContractProduct(input);
            return output;
	}
	@RequestMapping(value = "/searchAppContractServiceRest", method = RequestMethod.GET)
	public AppContractServiceSearchBean searchAppContractService(AppContractServiceSearchBean input){
            AppContractServiceSearchBean output = (AppContractServiceSearchBean) dao.searchAppContractService(input);
            return output;
	}
	@RequestMapping(value = "/searchAppDeviceRest", method = RequestMethod.GET)
	public AppDeviceSearchBean searchAppDevice(AppDeviceSearchBean input){
            AppDeviceSearchBean output = (AppDeviceSearchBean) dao.searchAppDevice(input);
            return output;
	}
	@RequestMapping(value = "/searchAppDeviceAttributeRest", method = RequestMethod.GET)
	public AppDeviceAttributeSearchBean searchAppDeviceAttribute(AppDeviceAttributeSearchBean input){
            AppDeviceAttributeSearchBean output = (AppDeviceAttributeSearchBean) dao.searchAppDeviceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/searchAppDeviceRecordsRest", method = RequestMethod.GET)
	public AppDeviceRecordsSearchBean searchAppDeviceRecords(AppDeviceRecordsSearchBean input){
            AppDeviceRecordsSearchBean output = (AppDeviceRecordsSearchBean) dao.searchAppDeviceRecords(input);
            return output;
	}
	@RequestMapping(value = "/searchAppGroupAuthoritiesRest", method = RequestMethod.GET)
	public AppGroupAuthoritiesSearchBean searchAppGroupAuthorities(AppGroupAuthoritiesSearchBean input){
            AppGroupAuthoritiesSearchBean output = (AppGroupAuthoritiesSearchBean) dao.searchAppGroupAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/searchAppGroupMembersRest", method = RequestMethod.GET)
	public AppGroupMembersSearchBean searchAppGroupMembers(AppGroupMembersSearchBean input){
            AppGroupMembersSearchBean output = (AppGroupMembersSearchBean) dao.searchAppGroupMembers(input);
            return output;
	}
	@RequestMapping(value = "/searchAppGroupsRest", method = RequestMethod.GET)
	public AppGroupsSearchBean searchAppGroups(AppGroupsSearchBean input){
            AppGroupsSearchBean output = (AppGroupsSearchBean) dao.searchAppGroups(input);
            return output;
	}
	@RequestMapping(value = "/searchAppMenusRest", method = RequestMethod.GET)
	public AppMenusSearchBean searchAppMenus(AppMenusSearchBean input){
            AppMenusSearchBean output = (AppMenusSearchBean) dao.searchAppMenus(input);
            return output;
	}
	@RequestMapping(value = "/searchAppMessageRest", method = RequestMethod.GET)
	public AppMessageSearchBean searchAppMessage(AppMessageSearchBean input){
            AppMessageSearchBean output = (AppMessageSearchBean) dao.searchAppMessage(input);
            return output;
	}
	@RequestMapping(value = "/searchAppPersistentLoginsRest", method = RequestMethod.GET)
	public AppPersistentLoginsSearchBean searchAppPersistentLogins(AppPersistentLoginsSearchBean input){
            AppPersistentLoginsSearchBean output = (AppPersistentLoginsSearchBean) dao.searchAppPersistentLogins(input);
            return output;
	}
	@RequestMapping(value = "/searchAppProductRest", method = RequestMethod.GET)
	public AppProductSearchBean searchAppProduct(AppProductSearchBean input){
            AppProductSearchBean output = (AppProductSearchBean) dao.searchAppProduct(input);
            return output;
	}
	@RequestMapping(value = "/searchAppProductAttributeRest", method = RequestMethod.GET)
	public AppProductAttributeSearchBean searchAppProductAttribute(AppProductAttributeSearchBean input){
            AppProductAttributeSearchBean output = (AppProductAttributeSearchBean) dao.searchAppProductAttribute(input);
            return output;
	}
	@RequestMapping(value = "/searchAppProductRecordsRest", method = RequestMethod.GET)
	public AppProductRecordsSearchBean searchAppProductRecords(AppProductRecordsSearchBean input){
            AppProductRecordsSearchBean output = (AppProductRecordsSearchBean) dao.searchAppProductRecords(input);
            return output;
	}
	@RequestMapping(value = "/searchAppRoomRest", method = RequestMethod.GET)
	public AppRoomSearchBean searchAppRoom(AppRoomSearchBean input){
            AppRoomSearchBean output = (AppRoomSearchBean) dao.searchAppRoom(input);
            return output;
	}
	@RequestMapping(value = "/searchAppServiceRest", method = RequestMethod.GET)
	public AppServiceSearchBean searchAppService(AppServiceSearchBean input){
            AppServiceSearchBean output = (AppServiceSearchBean) dao.searchAppService(input);
            return output;
	}
	@RequestMapping(value = "/searchAppServiceAttributeRest", method = RequestMethod.GET)
	public AppServiceAttributeSearchBean searchAppServiceAttribute(AppServiceAttributeSearchBean input){
            AppServiceAttributeSearchBean output = (AppServiceAttributeSearchBean) dao.searchAppServiceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/searchAppServiceRecordsRest", method = RequestMethod.GET)
	public AppServiceRecordsSearchBean searchAppServiceRecords(AppServiceRecordsSearchBean input){
            AppServiceRecordsSearchBean output = (AppServiceRecordsSearchBean) dao.searchAppServiceRecords(input);
            return output;
	}
	@RequestMapping(value = "/searchAppUsersRest", method = RequestMethod.GET)
	public AppUsersSearchBean searchAppUsers(AppUsersSearchBean input){
            AppUsersSearchBean output = (AppUsersSearchBean) dao.searchAppUsers(input);
            return output;
	}
	@RequestMapping(value = "/readAppAuthoritiesRest", method = RequestMethod.GET)
	public AppAuthoritiesReadBean readAppAuthorities(AppAuthoritiesReadBean input){
            AppAuthoritiesReadBean output = (AppAuthoritiesReadBean) dao.readAppAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/readAppCategoryRest", method = RequestMethod.GET)
	public AppCategoryReadBean readAppCategory(AppCategoryReadBean input){
            AppCategoryReadBean output = (AppCategoryReadBean) dao.readAppCategory(input);
            return output;
	}
	@RequestMapping(value = "/readAppContactRest", method = RequestMethod.GET)
	public AppContactReadBean readAppContact(AppContactReadBean input){
            AppContactReadBean output = (AppContactReadBean) dao.readAppContact(input);
            return output;
	}
	@RequestMapping(value = "/readAppContractRest", method = RequestMethod.GET)
	public AppContractReadBean readAppContract(AppContractReadBean input){
            AppContractReadBean output = (AppContractReadBean) dao.readAppContract(input);
            return output;
	}
	@RequestMapping(value = "/readAppContractDeviceRest", method = RequestMethod.GET)
	public AppContractDeviceReadBean readAppContractDevice(AppContractDeviceReadBean input){
            AppContractDeviceReadBean output = (AppContractDeviceReadBean) dao.readAppContractDevice(input);
            return output;
	}
	@RequestMapping(value = "/readAppContractProductRest", method = RequestMethod.GET)
	public AppContractProductReadBean readAppContractProduct(AppContractProductReadBean input){
            AppContractProductReadBean output = (AppContractProductReadBean) dao.readAppContractProduct(input);
            return output;
	}
	@RequestMapping(value = "/readAppContractServiceRest", method = RequestMethod.GET)
	public AppContractServiceReadBean readAppContractService(AppContractServiceReadBean input){
            AppContractServiceReadBean output = (AppContractServiceReadBean) dao.readAppContractService(input);
            return output;
	}
	@RequestMapping(value = "/readAppDeviceRest", method = RequestMethod.GET)
	public AppDeviceReadBean readAppDevice(AppDeviceReadBean input){
            AppDeviceReadBean output = (AppDeviceReadBean) dao.readAppDevice(input);
            return output;
	}
	@RequestMapping(value = "/readAppDeviceAttributeRest", method = RequestMethod.GET)
	public AppDeviceAttributeReadBean readAppDeviceAttribute(AppDeviceAttributeReadBean input){
            AppDeviceAttributeReadBean output = (AppDeviceAttributeReadBean) dao.readAppDeviceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/readAppDeviceRecordsRest", method = RequestMethod.GET)
	public AppDeviceRecordsReadBean readAppDeviceRecords(AppDeviceRecordsReadBean input){
            AppDeviceRecordsReadBean output = (AppDeviceRecordsReadBean) dao.readAppDeviceRecords(input);
            return output;
	}
	@RequestMapping(value = "/readAppGroupAuthoritiesRest", method = RequestMethod.GET)
	public AppGroupAuthoritiesReadBean readAppGroupAuthorities(AppGroupAuthoritiesReadBean input){
            AppGroupAuthoritiesReadBean output = (AppGroupAuthoritiesReadBean) dao.readAppGroupAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/readAppGroupMembersRest", method = RequestMethod.GET)
	public AppGroupMembersReadBean readAppGroupMembers(AppGroupMembersReadBean input){
            AppGroupMembersReadBean output = (AppGroupMembersReadBean) dao.readAppGroupMembers(input);
            return output;
	}
	@RequestMapping(value = "/readAppGroupsRest", method = RequestMethod.GET)
	public AppGroupsReadBean readAppGroups(AppGroupsReadBean input){
            AppGroupsReadBean output = (AppGroupsReadBean) dao.readAppGroups(input);
            return output;
	}
	@RequestMapping(value = "/readAppMenusRest", method = RequestMethod.GET)
	public AppMenusReadBean readAppMenus(AppMenusReadBean input){
            AppMenusReadBean output = (AppMenusReadBean) dao.readAppMenus(input);
            return output;
	}
	@RequestMapping(value = "/readAppMessageRest", method = RequestMethod.GET)
	public AppMessageReadBean readAppMessage(AppMessageReadBean input){
            AppMessageReadBean output = (AppMessageReadBean) dao.readAppMessage(input);
            return output;
	}
	@RequestMapping(value = "/readAppPersistentLoginsRest", method = RequestMethod.GET)
	public AppPersistentLoginsReadBean readAppPersistentLogins(AppPersistentLoginsReadBean input){
            AppPersistentLoginsReadBean output = (AppPersistentLoginsReadBean) dao.readAppPersistentLogins(input);
            return output;
	}
	@RequestMapping(value = "/readAppProductRest", method = RequestMethod.GET)
	public AppProductReadBean readAppProduct(AppProductReadBean input){
            AppProductReadBean output = (AppProductReadBean) dao.readAppProduct(input);
            return output;
	}
	@RequestMapping(value = "/readAppProductAttributeRest", method = RequestMethod.GET)
	public AppProductAttributeReadBean readAppProductAttribute(AppProductAttributeReadBean input){
            AppProductAttributeReadBean output = (AppProductAttributeReadBean) dao.readAppProductAttribute(input);
            return output;
	}
	@RequestMapping(value = "/readAppProductRecordsRest", method = RequestMethod.GET)
	public AppProductRecordsReadBean readAppProductRecords(AppProductRecordsReadBean input){
            AppProductRecordsReadBean output = (AppProductRecordsReadBean) dao.readAppProductRecords(input);
            return output;
	}
	@RequestMapping(value = "/readAppRoomRest", method = RequestMethod.GET)
	public AppRoomReadBean readAppRoom(AppRoomReadBean input){
            AppRoomReadBean output = (AppRoomReadBean) dao.readAppRoom(input);
            return output;
	}
	@RequestMapping(value = "/readAppServiceRest", method = RequestMethod.GET)
	public AppServiceReadBean readAppService(AppServiceReadBean input){
            AppServiceReadBean output = (AppServiceReadBean) dao.readAppService(input);
            return output;
	}
	@RequestMapping(value = "/readAppServiceAttributeRest", method = RequestMethod.GET)
	public AppServiceAttributeReadBean readAppServiceAttribute(AppServiceAttributeReadBean input){
            AppServiceAttributeReadBean output = (AppServiceAttributeReadBean) dao.readAppServiceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/readAppServiceRecordsRest", method = RequestMethod.GET)
	public AppServiceRecordsReadBean readAppServiceRecords(AppServiceRecordsReadBean input){
            AppServiceRecordsReadBean output = (AppServiceRecordsReadBean) dao.readAppServiceRecords(input);
            return output;
	}
	@RequestMapping(value = "/readAppUsersRest", method = RequestMethod.GET)
	public AppUsersReadBean readAppUsers(AppUsersReadBean input){
            AppUsersReadBean output = (AppUsersReadBean) dao.readAppUsers(input);
            return output;
	}
	@RequestMapping(value = "/newAppAuthoritiesRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppAuthoritiesNewBean newAppAuthorities(@Valid @RequestBody AppAuthoritiesNewBean input){
            return (AppAuthoritiesNewBean) dao.newAppAuthorities(input);
	}
	@RequestMapping(value = "/newAppCategoryRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppCategoryNewBean newAppCategory(@Valid @RequestBody AppCategoryNewBean input){
            return (AppCategoryNewBean) dao.newAppCategory(input);
	}
	@RequestMapping(value = "/newAppContactRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppContactNewBean newAppContact(@Valid @RequestBody AppContactNewBean input){
            return (AppContactNewBean) dao.newAppContact(input);
	}
	@RequestMapping(value = "/newAppContractRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractNewBean newAppContract(@Valid @RequestBody AppContractNewBean input){
            return (AppContractNewBean) dao.newAppContract(input);
	}
	@RequestMapping(value = "/newAppContractDeviceRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractDeviceNewBean newAppContractDevice(@Valid @RequestBody AppContractDeviceNewBean input){
            return (AppContractDeviceNewBean) dao.newAppContractDevice(input);
	}
	@RequestMapping(value = "/newAppContractProductRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractProductNewBean newAppContractProduct(@Valid @RequestBody AppContractProductNewBean input){
            return (AppContractProductNewBean) dao.newAppContractProduct(input);
	}
	@RequestMapping(value = "/newAppContractServiceRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractServiceNewBean newAppContractService(@Valid @RequestBody AppContractServiceNewBean input){
            return (AppContractServiceNewBean) dao.newAppContractService(input);
	}
	@RequestMapping(value = "/newAppDeviceRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceNewBean newAppDevice(@Valid @RequestBody AppDeviceNewBean input){
            return (AppDeviceNewBean) dao.newAppDevice(input);
	}
	@RequestMapping(value = "/newAppDeviceAttributeRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceAttributeNewBean newAppDeviceAttribute(@Valid @RequestBody AppDeviceAttributeNewBean input){
            return (AppDeviceAttributeNewBean) dao.newAppDeviceAttribute(input);
	}
	@RequestMapping(value = "/newAppDeviceRecordsRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceRecordsNewBean newAppDeviceRecords(@Valid @RequestBody AppDeviceRecordsNewBean input){
            return (AppDeviceRecordsNewBean) dao.newAppDeviceRecords(input);
	}
	@RequestMapping(value = "/newAppGroupAuthoritiesRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupAuthoritiesNewBean newAppGroupAuthorities(@Valid @RequestBody AppGroupAuthoritiesNewBean input){
            return (AppGroupAuthoritiesNewBean) dao.newAppGroupAuthorities(input);
	}
	@RequestMapping(value = "/newAppGroupMembersRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupMembersNewBean newAppGroupMembers(@Valid @RequestBody AppGroupMembersNewBean input){
            return (AppGroupMembersNewBean) dao.newAppGroupMembers(input);
	}
	@RequestMapping(value = "/newAppGroupsRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupsNewBean newAppGroups(@Valid @RequestBody AppGroupsNewBean input){
            return (AppGroupsNewBean) dao.newAppGroups(input);
	}
	@RequestMapping(value = "/newAppMenusRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppMenusNewBean newAppMenus(@Valid @RequestBody AppMenusNewBean input){
            return (AppMenusNewBean) dao.newAppMenus(input);
	}
	@RequestMapping(value = "/newAppMessageRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppMessageNewBean newAppMessage(@Valid @RequestBody AppMessageNewBean input){
            return (AppMessageNewBean) dao.newAppMessage(input);
	}
	@RequestMapping(value = "/newAppPersistentLoginsRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppPersistentLoginsNewBean newAppPersistentLogins(@Valid @RequestBody AppPersistentLoginsNewBean input){
            return (AppPersistentLoginsNewBean) dao.newAppPersistentLogins(input);
	}
	@RequestMapping(value = "/newAppProductRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductNewBean newAppProduct(@Valid @RequestBody AppProductNewBean input){
            return (AppProductNewBean) dao.newAppProduct(input);
	}
	@RequestMapping(value = "/newAppProductAttributeRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductAttributeNewBean newAppProductAttribute(@Valid @RequestBody AppProductAttributeNewBean input){
            return (AppProductAttributeNewBean) dao.newAppProductAttribute(input);
	}
	@RequestMapping(value = "/newAppProductRecordsRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductRecordsNewBean newAppProductRecords(@Valid @RequestBody AppProductRecordsNewBean input){
            return (AppProductRecordsNewBean) dao.newAppProductRecords(input);
	}
	@RequestMapping(value = "/newAppRoomRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppRoomNewBean newAppRoom(@Valid @RequestBody AppRoomNewBean input){
            return (AppRoomNewBean) dao.newAppRoom(input);
	}
	@RequestMapping(value = "/newAppServiceRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceNewBean newAppService(@Valid @RequestBody AppServiceNewBean input){
            return (AppServiceNewBean) dao.newAppService(input);
	}
	@RequestMapping(value = "/newAppServiceAttributeRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceAttributeNewBean newAppServiceAttribute(@Valid @RequestBody AppServiceAttributeNewBean input){
            return (AppServiceAttributeNewBean) dao.newAppServiceAttribute(input);
	}
	@RequestMapping(value = "/newAppServiceRecordsRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceRecordsNewBean newAppServiceRecords(@Valid @RequestBody AppServiceRecordsNewBean input){
            return (AppServiceRecordsNewBean) dao.newAppServiceRecords(input);
	}
	@RequestMapping(value = "/newAppUsersRest", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
	public AppUsersNewBean newAppUsers(@Valid @RequestBody AppUsersNewBean input){
            return (AppUsersNewBean) dao.newAppUsers(input);
	}
	@RequestMapping(value = "/writeAppAuthoritiesRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppAuthoritiesWriteBean writeAppAuthorities(@Valid @RequestBody AppAuthoritiesWriteBean input){
            AppAuthoritiesWriteBean output = (AppAuthoritiesWriteBean) dao.writeAppAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/writeAppCategoryRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppCategoryWriteBean writeAppCategory(@Valid @RequestBody AppCategoryWriteBean input){
            AppCategoryWriteBean output = (AppCategoryWriteBean) dao.writeAppCategory(input);
            return output;
	}
	@RequestMapping(value = "/writeAppContactRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppContactWriteBean writeAppContact(@Valid @RequestBody AppContactWriteBean input){
            AppContactWriteBean output = (AppContactWriteBean) dao.writeAppContact(input);
            return output;
	}
	@RequestMapping(value = "/writeAppContractRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractWriteBean writeAppContract(@Valid @RequestBody AppContractWriteBean input){
            AppContractWriteBean output = (AppContractWriteBean) dao.writeAppContract(input);
            return output;
	}
	@RequestMapping(value = "/writeAppContractDeviceRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractDeviceWriteBean writeAppContractDevice(@Valid @RequestBody AppContractDeviceWriteBean input){
            AppContractDeviceWriteBean output = (AppContractDeviceWriteBean) dao.writeAppContractDevice(input);
            return output;
	}
	@RequestMapping(value = "/writeAppContractProductRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractProductWriteBean writeAppContractProduct(@Valid @RequestBody AppContractProductWriteBean input){
            AppContractProductWriteBean output = (AppContractProductWriteBean) dao.writeAppContractProduct(input);
            return output;
	}
	@RequestMapping(value = "/writeAppContractServiceRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppContractServiceWriteBean writeAppContractService(@Valid @RequestBody AppContractServiceWriteBean input){
            AppContractServiceWriteBean output = (AppContractServiceWriteBean) dao.writeAppContractService(input);
            return output;
	}
	@RequestMapping(value = "/writeAppDeviceRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceWriteBean writeAppDevice(@Valid @RequestBody AppDeviceWriteBean input){
            AppDeviceWriteBean output = (AppDeviceWriteBean) dao.writeAppDevice(input);
            return output;
	}
	@RequestMapping(value = "/writeAppDeviceAttributeRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceAttributeWriteBean writeAppDeviceAttribute(@Valid @RequestBody AppDeviceAttributeWriteBean input){
            AppDeviceAttributeWriteBean output = (AppDeviceAttributeWriteBean) dao.writeAppDeviceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/writeAppDeviceRecordsRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppDeviceRecordsWriteBean writeAppDeviceRecords(@Valid @RequestBody AppDeviceRecordsWriteBean input){
            AppDeviceRecordsWriteBean output = (AppDeviceRecordsWriteBean) dao.writeAppDeviceRecords(input);
            return output;
	}
	@RequestMapping(value = "/writeAppGroupAuthoritiesRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupAuthoritiesWriteBean writeAppGroupAuthorities(@Valid @RequestBody AppGroupAuthoritiesWriteBean input){
            AppGroupAuthoritiesWriteBean output = (AppGroupAuthoritiesWriteBean) dao.writeAppGroupAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/writeAppGroupMembersRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupMembersWriteBean writeAppGroupMembers(@Valid @RequestBody AppGroupMembersWriteBean input){
            AppGroupMembersWriteBean output = (AppGroupMembersWriteBean) dao.writeAppGroupMembers(input);
            return output;
	}
	@RequestMapping(value = "/writeAppGroupsRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppGroupsWriteBean writeAppGroups(@Valid @RequestBody AppGroupsWriteBean input){
            AppGroupsWriteBean output = (AppGroupsWriteBean) dao.writeAppGroups(input);
            return output;
	}
	@RequestMapping(value = "/writeAppMenusRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppMenusWriteBean writeAppMenus(@Valid @RequestBody AppMenusWriteBean input){
            AppMenusWriteBean output = (AppMenusWriteBean) dao.writeAppMenus(input);
            return output;
	}
	@RequestMapping(value = "/writeAppMessageRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppMessageWriteBean writeAppMessage(@Valid @RequestBody AppMessageWriteBean input){
            AppMessageWriteBean output = (AppMessageWriteBean) dao.writeAppMessage(input);
            return output;
	}
	@RequestMapping(value = "/writeAppPersistentLoginsRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppPersistentLoginsWriteBean writeAppPersistentLogins(@Valid @RequestBody AppPersistentLoginsWriteBean input){
            AppPersistentLoginsWriteBean output = (AppPersistentLoginsWriteBean) dao.writeAppPersistentLogins(input);
            return output;
	}
	@RequestMapping(value = "/writeAppProductRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductWriteBean writeAppProduct(@Valid @RequestBody AppProductWriteBean input){
            AppProductWriteBean output = (AppProductWriteBean) dao.writeAppProduct(input);
            return output;
	}
	@RequestMapping(value = "/writeAppProductAttributeRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductAttributeWriteBean writeAppProductAttribute(@Valid @RequestBody AppProductAttributeWriteBean input){
            AppProductAttributeWriteBean output = (AppProductAttributeWriteBean) dao.writeAppProductAttribute(input);
            return output;
	}
	@RequestMapping(value = "/writeAppProductRecordsRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppProductRecordsWriteBean writeAppProductRecords(@Valid @RequestBody AppProductRecordsWriteBean input){
            AppProductRecordsWriteBean output = (AppProductRecordsWriteBean) dao.writeAppProductRecords(input);
            return output;
	}
	@RequestMapping(value = "/writeAppRoomRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppRoomWriteBean writeAppRoom(@Valid @RequestBody AppRoomWriteBean input){
            AppRoomWriteBean output = (AppRoomWriteBean) dao.writeAppRoom(input);
            return output;
	}
	@RequestMapping(value = "/writeAppServiceRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceWriteBean writeAppService(@Valid @RequestBody AppServiceWriteBean input){
            AppServiceWriteBean output = (AppServiceWriteBean) dao.writeAppService(input);
            return output;
	}
	@RequestMapping(value = "/writeAppServiceAttributeRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceAttributeWriteBean writeAppServiceAttribute(@Valid @RequestBody AppServiceAttributeWriteBean input){
            AppServiceAttributeWriteBean output = (AppServiceAttributeWriteBean) dao.writeAppServiceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/writeAppServiceRecordsRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppServiceRecordsWriteBean writeAppServiceRecords(@Valid @RequestBody AppServiceRecordsWriteBean input){
            AppServiceRecordsWriteBean output = (AppServiceRecordsWriteBean) dao.writeAppServiceRecords(input);
            return output;
	}
	@RequestMapping(value = "/writeAppUsersRest", method = RequestMethod.PUT, produces = {"application/json"}, consumes = {"application/json"})
	public AppUsersWriteBean writeAppUsers(@Valid @RequestBody AppUsersWriteBean input){
            AppUsersWriteBean output = (AppUsersWriteBean) dao.writeAppUsers(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppAuthoritiesRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppAuthoritiesDeleteBean deleteAppAuthorities(@Valid @RequestBody AppAuthoritiesDeleteBean input){
            AppAuthoritiesDeleteBean output = (AppAuthoritiesDeleteBean) dao.deleteAppAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppCategoryRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppCategoryDeleteBean deleteAppCategory(@Valid @RequestBody AppCategoryDeleteBean input){
            AppCategoryDeleteBean output = (AppCategoryDeleteBean) dao.deleteAppCategory(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppContactRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppContactDeleteBean deleteAppContact(@Valid @RequestBody AppContactDeleteBean input){
            AppContactDeleteBean output = (AppContactDeleteBean) dao.deleteAppContact(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppContractRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppContractDeleteBean deleteAppContract(@Valid @RequestBody AppContractDeleteBean input){
            AppContractDeleteBean output = (AppContractDeleteBean) dao.deleteAppContract(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppContractDeviceRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppContractDeviceDeleteBean deleteAppContractDevice(@Valid @RequestBody AppContractDeviceDeleteBean input){
            AppContractDeviceDeleteBean output = (AppContractDeviceDeleteBean) dao.deleteAppContractDevice(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppContractProductRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppContractProductDeleteBean deleteAppContractProduct(@Valid @RequestBody AppContractProductDeleteBean input){
            AppContractProductDeleteBean output = (AppContractProductDeleteBean) dao.deleteAppContractProduct(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppContractServiceRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppContractServiceDeleteBean deleteAppContractService(@Valid @RequestBody AppContractServiceDeleteBean input){
            AppContractServiceDeleteBean output = (AppContractServiceDeleteBean) dao.deleteAppContractService(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppDeviceRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppDeviceDeleteBean deleteAppDevice(@Valid @RequestBody AppDeviceDeleteBean input){
            AppDeviceDeleteBean output = (AppDeviceDeleteBean) dao.deleteAppDevice(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppDeviceAttributeRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppDeviceAttributeDeleteBean deleteAppDeviceAttribute(@Valid @RequestBody AppDeviceAttributeDeleteBean input){
            AppDeviceAttributeDeleteBean output = (AppDeviceAttributeDeleteBean) dao.deleteAppDeviceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppDeviceRecordsRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppDeviceRecordsDeleteBean deleteAppDeviceRecords(@Valid @RequestBody AppDeviceRecordsDeleteBean input){
            AppDeviceRecordsDeleteBean output = (AppDeviceRecordsDeleteBean) dao.deleteAppDeviceRecords(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppGroupAuthoritiesRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppGroupAuthoritiesDeleteBean deleteAppGroupAuthorities(@Valid @RequestBody AppGroupAuthoritiesDeleteBean input){
            AppGroupAuthoritiesDeleteBean output = (AppGroupAuthoritiesDeleteBean) dao.deleteAppGroupAuthorities(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppGroupMembersRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppGroupMembersDeleteBean deleteAppGroupMembers(@Valid @RequestBody AppGroupMembersDeleteBean input){
            AppGroupMembersDeleteBean output = (AppGroupMembersDeleteBean) dao.deleteAppGroupMembers(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppGroupsRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppGroupsDeleteBean deleteAppGroups(@Valid @RequestBody AppGroupsDeleteBean input){
            AppGroupsDeleteBean output = (AppGroupsDeleteBean) dao.deleteAppGroups(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppMenusRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppMenusDeleteBean deleteAppMenus(@Valid @RequestBody AppMenusDeleteBean input){
            AppMenusDeleteBean output = (AppMenusDeleteBean) dao.deleteAppMenus(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppMessageRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppMessageDeleteBean deleteAppMessage(@Valid @RequestBody AppMessageDeleteBean input){
            AppMessageDeleteBean output = (AppMessageDeleteBean) dao.deleteAppMessage(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppPersistentLoginsRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppPersistentLoginsDeleteBean deleteAppPersistentLogins(@Valid @RequestBody AppPersistentLoginsDeleteBean input){
            AppPersistentLoginsDeleteBean output = (AppPersistentLoginsDeleteBean) dao.deleteAppPersistentLogins(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppProductRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppProductDeleteBean deleteAppProduct(@Valid @RequestBody AppProductDeleteBean input){
            AppProductDeleteBean output = (AppProductDeleteBean) dao.deleteAppProduct(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppProductAttributeRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppProductAttributeDeleteBean deleteAppProductAttribute(@Valid @RequestBody AppProductAttributeDeleteBean input){
            AppProductAttributeDeleteBean output = (AppProductAttributeDeleteBean) dao.deleteAppProductAttribute(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppProductRecordsRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppProductRecordsDeleteBean deleteAppProductRecords(@Valid @RequestBody AppProductRecordsDeleteBean input){
            AppProductRecordsDeleteBean output = (AppProductRecordsDeleteBean) dao.deleteAppProductRecords(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppRoomRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppRoomDeleteBean deleteAppRoom(@Valid @RequestBody AppRoomDeleteBean input){
            AppRoomDeleteBean output = (AppRoomDeleteBean) dao.deleteAppRoom(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppServiceRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppServiceDeleteBean deleteAppService(@Valid @RequestBody AppServiceDeleteBean input){
            AppServiceDeleteBean output = (AppServiceDeleteBean) dao.deleteAppService(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppServiceAttributeRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppServiceAttributeDeleteBean deleteAppServiceAttribute(@Valid @RequestBody AppServiceAttributeDeleteBean input){
            AppServiceAttributeDeleteBean output = (AppServiceAttributeDeleteBean) dao.deleteAppServiceAttribute(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppServiceRecordsRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppServiceRecordsDeleteBean deleteAppServiceRecords(@Valid @RequestBody AppServiceRecordsDeleteBean input){
            AppServiceRecordsDeleteBean output = (AppServiceRecordsDeleteBean) dao.deleteAppServiceRecords(input);
            return output;
	}
	@RequestMapping(value = "/deleteAppUsersRest", method = RequestMethod.DELETE, produces = {"application/json"}, consumes = {"application/json"})		
	public AppUsersDeleteBean deleteAppUsers(@Valid @RequestBody AppUsersDeleteBean input){
            AppUsersDeleteBean output = (AppUsersDeleteBean) dao.deleteAppUsers(input);
            return output;
	}
}
