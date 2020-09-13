package net.ksasaki.template.demo.persistence.mappergen;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FlywaySchemaHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public static final FlywaySchemaHistory flywaySchemaHistory = new FlywaySchemaHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_rank")
    public static final SqlColumn<Integer> installedRank = flywaySchemaHistory.installedRank;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.version")
    public static final SqlColumn<String> version = flywaySchemaHistory.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.description")
    public static final SqlColumn<String> description = flywaySchemaHistory.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.type")
    public static final SqlColumn<String> type = flywaySchemaHistory.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.script")
    public static final SqlColumn<String> script = flywaySchemaHistory.script;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.checksum")
    public static final SqlColumn<Integer> checksum = flywaySchemaHistory.checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_by")
    public static final SqlColumn<String> installedBy = flywaySchemaHistory.installedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.installed_on")
    public static final SqlColumn<LocalDateTime> installedOn = flywaySchemaHistory.installedOn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.execution_time")
    public static final SqlColumn<Integer> executionTime = flywaySchemaHistory.executionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: flyway_schema_history.success")
    public static final SqlColumn<Boolean> success = flywaySchemaHistory.success;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: flyway_schema_history")
    public static final class FlywaySchemaHistory extends SqlTable {
        public final SqlColumn<Integer> installedRank = column("installed_rank", JDBCType.INTEGER);

        public final SqlColumn<String> version = column("version", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> script = column("script", JDBCType.VARCHAR);

        public final SqlColumn<Integer> checksum = column("checksum", JDBCType.INTEGER);

        public final SqlColumn<String> installedBy = column("installed_by", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> installedOn = column("installed_on", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> executionTime = column("execution_time", JDBCType.INTEGER);

        public final SqlColumn<Boolean> success = column("success", JDBCType.BIT);

        public FlywaySchemaHistory() {
            super("flyway_schema_history");
        }
    }
}