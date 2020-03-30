package com.test.mvp.launcher.model;

import java.util.List;

public class LauncherBean {

    /**
     * searchValue : null
     * createBy : null
     * createTime : null
     * updateBy : null
     * updateTime : null
     * remark : null
     * dataScope : null
     * beginTime : null
     * endTime : null
     * params : {}
     * id : 199
     * pic : /attachment/2020/03/21/5c9681da175aa1f0f9a6cac621caf648.png
     * url : https://huaykeji.com
     * company : 9
     * defaultFlag : 1
     * sort : 1
     * type : 1
     * appType : 2
     * lastUpdate : 2019-11-22 11:55:46
     * companyInfo : {"searchValue":null,"createBy":"admin","createTime":"2020-01-18 10:37:03","updateBy":null,"updateTime":null,"remark":null,"dataScope":null,"beginTime":null,"endTime":null,"params":{},"deptId":9,"parentId":100,"ancestors":"0,100","deptName":"山西榆次分公司","orderNum":"2","leader":"嘻嘻嘻","phone":"19935320152","email":"sss@qq.com","status":"0","delFlag":"0","parentName":null,"province":"140000","county":"140702","city":"140700","longitude":"112.736614","latitude":"37.719148","picture":"","website":"https://www.huaykeji.com/","qq":"450522795","address":"山西省晋中市榆次区安宁街道新建北路晋园","description":"城际专线测试使用","isTest":false,"hotFlag":true,"establishTime":null,"companyAccount":null,"children":[]}
     */


    private int id;
    private String pic;
    private String url;

    private CompanyInfoBean companyInfo;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }






    public CompanyInfoBean getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfoBean companyInfo) {
        this.companyInfo = companyInfo;
    }

    public static class ParamsBean {
    }

    public static class CompanyInfoBean {
        /**
         * searchValue : null
         * createBy : admin
         * createTime : 2020-01-18 10:37:03
         * updateBy : null
         * updateTime : null
         * remark : null
         * dataScope : null
         * beginTime : null
         * endTime : null
         * params : {}
         * deptId : 9
         * parentId : 100
         * ancestors : 0,100
         * deptName : 山西榆次分公司
         * orderNum : 2
         * leader : 嘻嘻嘻
         * phone : 19935320152
         * email : sss@qq.com
         * status : 0
         * delFlag : 0
         * parentName : null
         * province : 140000
         * county : 140702
         * city : 140700
         * longitude : 112.736614
         * latitude : 37.719148
         * picture :
         * website : https://www.huaykeji.com/
         * qq : 450522795
         * address : 山西省晋中市榆次区安宁街道新建北路晋园
         * description : 城际专线测试使用
         * isTest : false
         * hotFlag : true
         * establishTime : null
         * companyAccount : null
         * children : []
         */

        private Object searchValue;
        private String createBy;
        private String createTime;
        private Object updateBy;
        private Object updateTime;
        private Object remark;
        private Object dataScope;
        private Object beginTime;
        private Object endTime;
        private ParamsBeanX params;
        private int deptId;
        private int parentId;
        private String ancestors;
        private String deptName;
        private String orderNum;
        private String leader;
        private String phone;
        private String email;
        private String status;
        private String delFlag;
        private Object parentName;
        private String province;
        private String county;
        private String city;
        private String longitude;
        private String latitude;
        private String picture;
        private String website;
        private String qq;
        private String address;
        private String description;
        private boolean isTest;
        private boolean hotFlag;
        private Object establishTime;
        private Object companyAccount;
        private List<?> children;

        public Object getSearchValue() {
            return searchValue;
        }

        public void setSearchValue(Object searchValue) {
            this.searchValue = searchValue;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(Object updateBy) {
            this.updateBy = updateBy;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Object getDataScope() {
            return dataScope;
        }

        public void setDataScope(Object dataScope) {
            this.dataScope = dataScope;
        }

        public Object getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(Object beginTime) {
            this.beginTime = beginTime;
        }

        public Object getEndTime() {
            return endTime;
        }

        public void setEndTime(Object endTime) {
            this.endTime = endTime;
        }

        public ParamsBeanX getParams() {
            return params;
        }

        public void setParams(ParamsBeanX params) {
            this.params = params;
        }

        public int getDeptId() {
            return deptId;
        }

        public void setDeptId(int deptId) {
            this.deptId = deptId;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getAncestors() {
            return ancestors;
        }

        public void setAncestors(String ancestors) {
            this.ancestors = ancestors;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(String orderNum) {
            this.orderNum = orderNum;
        }

        public String getLeader() {
            return leader;
        }

        public void setLeader(String leader) {
            this.leader = leader;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public Object getParentName() {
            return parentName;
        }

        public void setParentName(Object parentName) {
            this.parentName = parentName;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isIsTest() {
            return isTest;
        }

        public void setIsTest(boolean isTest) {
            this.isTest = isTest;
        }

        public boolean isHotFlag() {
            return hotFlag;
        }

        public void setHotFlag(boolean hotFlag) {
            this.hotFlag = hotFlag;
        }

        public Object getEstablishTime() {
            return establishTime;
        }

        public void setEstablishTime(Object establishTime) {
            this.establishTime = establishTime;
        }

        public Object getCompanyAccount() {
            return companyAccount;
        }

        public void setCompanyAccount(Object companyAccount) {
            this.companyAccount = companyAccount;
        }

        public List<?> getChildren() {
            return children;
        }

        public void setChildren(List<?> children) {
            this.children = children;
        }

        public static class ParamsBeanX {
        }
    }
}
