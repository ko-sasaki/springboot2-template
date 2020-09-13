package net.ksasaki.template.demo.persistence.modelgen;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class FlywaySchemaHistory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_rank")
    private Integer installedRank;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.version")
    private String version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.script")
    private String script;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.checksum")
    private Integer checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_by")
    private String installedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_on")
    private LocalDateTime installedOn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.execution_time")
    private Integer executionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.success")
    private Boolean success;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_rank")
    public Integer getInstalledRank() {
        return installedRank;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withInstalledRank(Integer installedRank) {
        this.setInstalledRank(installedRank);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_rank")
    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.version")
    public String getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withVersion(String version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.version")
    public void setVersion(String version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withType(String type) {
        this.setType(type);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.type")
    public void setType(String type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.script")
    public String getScript() {
        return script;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withScript(String script) {
        this.setScript(script);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.script")
    public void setScript(String script) {
        this.script = script;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.checksum")
    public Integer getChecksum() {
        return checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withChecksum(Integer checksum) {
        this.setChecksum(checksum);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.checksum")
    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_by")
    public String getInstalledBy() {
        return installedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withInstalledBy(String installedBy) {
        this.setInstalledBy(installedBy);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_by")
    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_on")
    public LocalDateTime getInstalledOn() {
        return installedOn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withInstalledOn(LocalDateTime installedOn) {
        this.setInstalledOn(installedOn);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_on")
    public void setInstalledOn(LocalDateTime installedOn) {
        this.installedOn = installedOn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.execution_time")
    public Integer getExecutionTime() {
        return executionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withExecutionTime(Integer executionTime) {
        this.setExecutionTime(executionTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.execution_time")
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.success")
    public Boolean getSuccess() {
        return success;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public FlywaySchemaHistory withSuccess(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
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
        FlywaySchemaHistory other = (FlywaySchemaHistory) that;
        return (this.getInstalledRank() == null ? other.getInstalledRank() == null : this.getInstalledRank().equals(other.getInstalledRank()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getScript() == null ? other.getScript() == null : this.getScript().equals(other.getScript()))
            && (this.getChecksum() == null ? other.getChecksum() == null : this.getChecksum().equals(other.getChecksum()))
            && (this.getInstalledBy() == null ? other.getInstalledBy() == null : this.getInstalledBy().equals(other.getInstalledBy()))
            && (this.getInstalledOn() == null ? other.getInstalledOn() == null : this.getInstalledOn().equals(other.getInstalledOn()))
            && (this.getExecutionTime() == null ? other.getExecutionTime() == null : this.getExecutionTime().equals(other.getExecutionTime()))
            && (this.getSuccess() == null ? other.getSuccess() == null : this.getSuccess().equals(other.getSuccess()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInstalledRank() == null) ? 0 : getInstalledRank().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getScript() == null) ? 0 : getScript().hashCode());
        result = prime * result + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        result = prime * result + ((getInstalledBy() == null) ? 0 : getInstalledBy().hashCode());
        result = prime * result + ((getInstalledOn() == null) ? 0 : getInstalledOn().hashCode());
        result = prime * result + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        result = prime * result + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", installedRank=").append(installedRank);
        sb.append(", version=").append(version);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", script=").append(script);
        sb.append(", checksum=").append(checksum);
        sb.append(", installedBy=").append(installedBy);
        sb.append(", installedOn=").append(installedOn);
        sb.append(", executionTime=").append(executionTime);
        sb.append(", success=").append(success);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}