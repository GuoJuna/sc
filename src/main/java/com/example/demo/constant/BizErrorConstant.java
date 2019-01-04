package com.example.demo.constant;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2018/11/27
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
public interface BizErrorConstant {


    /**
     * 成功
     */
    enum Success{
        Success("00000","成功");
        private String type;
        private String typeName;

        Success(String type,String typeName){
            this.type = type;
            this.typeName = typeName;
        }

        public String getType() {
            return type;
        }


        public String getTypeName() {
            return typeName;
        }

        public static String getName(String type) {
            for(Success sceneType: Success.values()) {
                if(sceneType.getType().equals(type)) {
                    return sceneType.getTypeName();
                }
            }
            return null;
        }

    }



    /**
     * 失败
     */
    enum Error{
        Error("40000","失败"),
        CodeError("20000","验证码错误"),
        ParamError("50000","参数错误"),
        EmptyParam("30000","必填参数不能为空");
        private String type;
        private String typeName;

        Error(String type,String typeName){
            this.type = type;
            this.typeName = typeName;
        }

        public String getType() {
            return type;
        }


        public String getTypeName() {
            return typeName;
        }

        public static String getName(String type) {
            for(Error sceneType: Error.values()) {
                if(sceneType.getType().equals(type)) {
                    return sceneType.getTypeName();
                }
            }
            return null;
        }

    }


}
