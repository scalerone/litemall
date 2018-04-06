package org.linlinjava.litemall.db.domain;

public class LitemallRegion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region.id
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region.pid
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region.name
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region.type
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region.code
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    private Integer code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region.id
     *
     * @return the value of litemall_region.id
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region.id
     *
     * @param id the value for litemall_region.id
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region.pid
     *
     * @return the value of litemall_region.pid
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region.pid
     *
     * @param pid the value for litemall_region.pid
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region.name
     *
     * @return the value of litemall_region.name
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region.name
     *
     * @param name the value for litemall_region.name
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region.type
     *
     * @return the value of litemall_region.type
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region.type
     *
     * @param type the value for litemall_region.type
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region.code
     *
     * @return the value of litemall_region.code
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region.code
     *
     * @param code the value for litemall_region.code
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallRegion other = (LitemallRegion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated Fri Apr 06 22:55:36 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        pid("pid"),
        name("name"),
        type("type"),
        code("code");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}