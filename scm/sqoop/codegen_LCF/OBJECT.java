// ORM class for table 'LCF.OBJECT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Mar 19 08:02:53 GMT 2020
// For connector: org.apache.sqoop.manager.OracleManager
package codegen_LCF;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class OBJECT extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("OBJECT_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_KEY = (java.math.BigDecimal)value;
      }
    });
    setters.put("SYSTEM_SCHEMA_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SYSTEM_SCHEMA_KEY = (java.math.BigDecimal)value;
      }
    });
    setters.put("TARGET_OBJECT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TARGET_OBJECT_NAME = (String)value;
      }
    });
    setters.put("OBJECT_SHORT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_SHORT_NAME = (String)value;
      }
    });
    setters.put("TARGET_DB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TARGET_DB = (String)value;
      }
    });
    setters.put("SOURCE_OBJECT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SOURCE_OBJECT_NAME = (String)value;
      }
    });
    setters.put("SOURCE_OBJECT_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SOURCE_OBJECT_TYPE = (String)value;
      }
    });
    setters.put("SAS_LIB_REF", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SAS_LIB_REF = (String)value;
      }
    });
    setters.put("PK_COLUMN_NAMES", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PK_COLUMN_NAMES = (com.cloudera.sqoop.lib.ClobRef)value;
      }
    });
    setters.put("NK_COLUMN_NAMES", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NK_COLUMN_NAMES = (com.cloudera.sqoop.lib.ClobRef)value;
      }
    });
    setters.put("EXCLUDED_COLUMNS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EXCLUDED_COLUMNS = (com.cloudera.sqoop.lib.ClobRef)value;
      }
    });
    setters.put("LOAD_PATTERN_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_PATTERN_NAME = (String)value;
      }
    });
    setters.put("SENSITIVE_DATA_FLAG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SENSITIVE_DATA_FLAG = (String)value;
      }
    });
    setters.put("RETENTION_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RETENTION_KEY = (java.math.BigDecimal)value;
      }
    });
    setters.put("CUSTOM_SQL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CUSTOM_SQL = (com.cloudera.sqoop.lib.ClobRef)value;
      }
    });
    setters.put("CHANGE_CAPTURE_TIMESTAMP_COLUMN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CHANGE_CAPTURE_TIMESTAMP_COLUMN = (String)value;
      }
    });
    setters.put("HISTORY_LOADED_FROM_TDW", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HISTORY_LOADED_FROM_TDW = (String)value;
      }
    });
    setters.put("HISTORY_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HISTORY_TYPE = (String)value;
      }
    });
    setters.put("EFFECTIVE_FROM_TIMESTAMP_COLUMN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EFFECTIVE_FROM_TIMESTAMP_COLUMN = (String)value;
      }
    });
    setters.put("EFFECTIVE_TO_TIMESTAMP_COLUMN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EFFECTIVE_TO_TIMESTAMP_COLUMN = (String)value;
      }
    });
    setters.put("EFFECTIVE_TIMESTAMP_GRAIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EFFECTIVE_TIMESTAMP_GRAIN = (String)value;
      }
    });
    setters.put("PURGE_GRAIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PURGE_GRAIN = (String)value;
      }
    });
    setters.put("DUPLICATION_TIMESTAMP_GRAIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DUPLICATION_TIMESTAMP_GRAIN = (String)value;
      }
    });
    setters.put("CREATED_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CREATED_DATE = (java.sql.Timestamp)value;
      }
    });
    setters.put("CREATED_BY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CREATED_BY = (String)value;
      }
    });
    setters.put("BATCH_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BATCH_NAME = (String)value;
      }
    });
    setters.put("CAS_UPLOAD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CAS_UPLOAD = (String)value;
      }
    });
    setters.put("LAYER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAYER = (String)value;
      }
    });
    setters.put("INGESTION_MODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INGESTION_MODE = (String)value;
      }
    });
  }
  public OBJECT() {
    init0();
  }
  private java.math.BigDecimal OBJECT_KEY;
  public java.math.BigDecimal get_OBJECT_KEY() {
    return OBJECT_KEY;
  }
  public void set_OBJECT_KEY(java.math.BigDecimal OBJECT_KEY) {
    this.OBJECT_KEY = OBJECT_KEY;
  }
  public OBJECT with_OBJECT_KEY(java.math.BigDecimal OBJECT_KEY) {
    this.OBJECT_KEY = OBJECT_KEY;
    return this;
  }
  private java.math.BigDecimal SYSTEM_SCHEMA_KEY;
  public java.math.BigDecimal get_SYSTEM_SCHEMA_KEY() {
    return SYSTEM_SCHEMA_KEY;
  }
  public void set_SYSTEM_SCHEMA_KEY(java.math.BigDecimal SYSTEM_SCHEMA_KEY) {
    this.SYSTEM_SCHEMA_KEY = SYSTEM_SCHEMA_KEY;
  }
  public OBJECT with_SYSTEM_SCHEMA_KEY(java.math.BigDecimal SYSTEM_SCHEMA_KEY) {
    this.SYSTEM_SCHEMA_KEY = SYSTEM_SCHEMA_KEY;
    return this;
  }
  private String TARGET_OBJECT_NAME;
  public String get_TARGET_OBJECT_NAME() {
    return TARGET_OBJECT_NAME;
  }
  public void set_TARGET_OBJECT_NAME(String TARGET_OBJECT_NAME) {
    this.TARGET_OBJECT_NAME = TARGET_OBJECT_NAME;
  }
  public OBJECT with_TARGET_OBJECT_NAME(String TARGET_OBJECT_NAME) {
    this.TARGET_OBJECT_NAME = TARGET_OBJECT_NAME;
    return this;
  }
  private String OBJECT_SHORT_NAME;
  public String get_OBJECT_SHORT_NAME() {
    return OBJECT_SHORT_NAME;
  }
  public void set_OBJECT_SHORT_NAME(String OBJECT_SHORT_NAME) {
    this.OBJECT_SHORT_NAME = OBJECT_SHORT_NAME;
  }
  public OBJECT with_OBJECT_SHORT_NAME(String OBJECT_SHORT_NAME) {
    this.OBJECT_SHORT_NAME = OBJECT_SHORT_NAME;
    return this;
  }
  private String TARGET_DB;
  public String get_TARGET_DB() {
    return TARGET_DB;
  }
  public void set_TARGET_DB(String TARGET_DB) {
    this.TARGET_DB = TARGET_DB;
  }
  public OBJECT with_TARGET_DB(String TARGET_DB) {
    this.TARGET_DB = TARGET_DB;
    return this;
  }
  private String SOURCE_OBJECT_NAME;
  public String get_SOURCE_OBJECT_NAME() {
    return SOURCE_OBJECT_NAME;
  }
  public void set_SOURCE_OBJECT_NAME(String SOURCE_OBJECT_NAME) {
    this.SOURCE_OBJECT_NAME = SOURCE_OBJECT_NAME;
  }
  public OBJECT with_SOURCE_OBJECT_NAME(String SOURCE_OBJECT_NAME) {
    this.SOURCE_OBJECT_NAME = SOURCE_OBJECT_NAME;
    return this;
  }
  private String SOURCE_OBJECT_TYPE;
  public String get_SOURCE_OBJECT_TYPE() {
    return SOURCE_OBJECT_TYPE;
  }
  public void set_SOURCE_OBJECT_TYPE(String SOURCE_OBJECT_TYPE) {
    this.SOURCE_OBJECT_TYPE = SOURCE_OBJECT_TYPE;
  }
  public OBJECT with_SOURCE_OBJECT_TYPE(String SOURCE_OBJECT_TYPE) {
    this.SOURCE_OBJECT_TYPE = SOURCE_OBJECT_TYPE;
    return this;
  }
  private String SAS_LIB_REF;
  public String get_SAS_LIB_REF() {
    return SAS_LIB_REF;
  }
  public void set_SAS_LIB_REF(String SAS_LIB_REF) {
    this.SAS_LIB_REF = SAS_LIB_REF;
  }
  public OBJECT with_SAS_LIB_REF(String SAS_LIB_REF) {
    this.SAS_LIB_REF = SAS_LIB_REF;
    return this;
  }
  private com.cloudera.sqoop.lib.ClobRef PK_COLUMN_NAMES;
  public com.cloudera.sqoop.lib.ClobRef get_PK_COLUMN_NAMES() {
    return PK_COLUMN_NAMES;
  }
  public void set_PK_COLUMN_NAMES(com.cloudera.sqoop.lib.ClobRef PK_COLUMN_NAMES) {
    this.PK_COLUMN_NAMES = PK_COLUMN_NAMES;
  }
  public OBJECT with_PK_COLUMN_NAMES(com.cloudera.sqoop.lib.ClobRef PK_COLUMN_NAMES) {
    this.PK_COLUMN_NAMES = PK_COLUMN_NAMES;
    return this;
  }
  private com.cloudera.sqoop.lib.ClobRef NK_COLUMN_NAMES;
  public com.cloudera.sqoop.lib.ClobRef get_NK_COLUMN_NAMES() {
    return NK_COLUMN_NAMES;
  }
  public void set_NK_COLUMN_NAMES(com.cloudera.sqoop.lib.ClobRef NK_COLUMN_NAMES) {
    this.NK_COLUMN_NAMES = NK_COLUMN_NAMES;
  }
  public OBJECT with_NK_COLUMN_NAMES(com.cloudera.sqoop.lib.ClobRef NK_COLUMN_NAMES) {
    this.NK_COLUMN_NAMES = NK_COLUMN_NAMES;
    return this;
  }
  private com.cloudera.sqoop.lib.ClobRef EXCLUDED_COLUMNS;
  public com.cloudera.sqoop.lib.ClobRef get_EXCLUDED_COLUMNS() {
    return EXCLUDED_COLUMNS;
  }
  public void set_EXCLUDED_COLUMNS(com.cloudera.sqoop.lib.ClobRef EXCLUDED_COLUMNS) {
    this.EXCLUDED_COLUMNS = EXCLUDED_COLUMNS;
  }
  public OBJECT with_EXCLUDED_COLUMNS(com.cloudera.sqoop.lib.ClobRef EXCLUDED_COLUMNS) {
    this.EXCLUDED_COLUMNS = EXCLUDED_COLUMNS;
    return this;
  }
  private String LOAD_PATTERN_NAME;
  public String get_LOAD_PATTERN_NAME() {
    return LOAD_PATTERN_NAME;
  }
  public void set_LOAD_PATTERN_NAME(String LOAD_PATTERN_NAME) {
    this.LOAD_PATTERN_NAME = LOAD_PATTERN_NAME;
  }
  public OBJECT with_LOAD_PATTERN_NAME(String LOAD_PATTERN_NAME) {
    this.LOAD_PATTERN_NAME = LOAD_PATTERN_NAME;
    return this;
  }
  private String SENSITIVE_DATA_FLAG;
  public String get_SENSITIVE_DATA_FLAG() {
    return SENSITIVE_DATA_FLAG;
  }
  public void set_SENSITIVE_DATA_FLAG(String SENSITIVE_DATA_FLAG) {
    this.SENSITIVE_DATA_FLAG = SENSITIVE_DATA_FLAG;
  }
  public OBJECT with_SENSITIVE_DATA_FLAG(String SENSITIVE_DATA_FLAG) {
    this.SENSITIVE_DATA_FLAG = SENSITIVE_DATA_FLAG;
    return this;
  }
  private java.math.BigDecimal RETENTION_KEY;
  public java.math.BigDecimal get_RETENTION_KEY() {
    return RETENTION_KEY;
  }
  public void set_RETENTION_KEY(java.math.BigDecimal RETENTION_KEY) {
    this.RETENTION_KEY = RETENTION_KEY;
  }
  public OBJECT with_RETENTION_KEY(java.math.BigDecimal RETENTION_KEY) {
    this.RETENTION_KEY = RETENTION_KEY;
    return this;
  }
  private com.cloudera.sqoop.lib.ClobRef CUSTOM_SQL;
  public com.cloudera.sqoop.lib.ClobRef get_CUSTOM_SQL() {
    return CUSTOM_SQL;
  }
  public void set_CUSTOM_SQL(com.cloudera.sqoop.lib.ClobRef CUSTOM_SQL) {
    this.CUSTOM_SQL = CUSTOM_SQL;
  }
  public OBJECT with_CUSTOM_SQL(com.cloudera.sqoop.lib.ClobRef CUSTOM_SQL) {
    this.CUSTOM_SQL = CUSTOM_SQL;
    return this;
  }
  private String CHANGE_CAPTURE_TIMESTAMP_COLUMN;
  public String get_CHANGE_CAPTURE_TIMESTAMP_COLUMN() {
    return CHANGE_CAPTURE_TIMESTAMP_COLUMN;
  }
  public void set_CHANGE_CAPTURE_TIMESTAMP_COLUMN(String CHANGE_CAPTURE_TIMESTAMP_COLUMN) {
    this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = CHANGE_CAPTURE_TIMESTAMP_COLUMN;
  }
  public OBJECT with_CHANGE_CAPTURE_TIMESTAMP_COLUMN(String CHANGE_CAPTURE_TIMESTAMP_COLUMN) {
    this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = CHANGE_CAPTURE_TIMESTAMP_COLUMN;
    return this;
  }
  private String HISTORY_LOADED_FROM_TDW;
  public String get_HISTORY_LOADED_FROM_TDW() {
    return HISTORY_LOADED_FROM_TDW;
  }
  public void set_HISTORY_LOADED_FROM_TDW(String HISTORY_LOADED_FROM_TDW) {
    this.HISTORY_LOADED_FROM_TDW = HISTORY_LOADED_FROM_TDW;
  }
  public OBJECT with_HISTORY_LOADED_FROM_TDW(String HISTORY_LOADED_FROM_TDW) {
    this.HISTORY_LOADED_FROM_TDW = HISTORY_LOADED_FROM_TDW;
    return this;
  }
  private String HISTORY_TYPE;
  public String get_HISTORY_TYPE() {
    return HISTORY_TYPE;
  }
  public void set_HISTORY_TYPE(String HISTORY_TYPE) {
    this.HISTORY_TYPE = HISTORY_TYPE;
  }
  public OBJECT with_HISTORY_TYPE(String HISTORY_TYPE) {
    this.HISTORY_TYPE = HISTORY_TYPE;
    return this;
  }
  private String EFFECTIVE_FROM_TIMESTAMP_COLUMN;
  public String get_EFFECTIVE_FROM_TIMESTAMP_COLUMN() {
    return EFFECTIVE_FROM_TIMESTAMP_COLUMN;
  }
  public void set_EFFECTIVE_FROM_TIMESTAMP_COLUMN(String EFFECTIVE_FROM_TIMESTAMP_COLUMN) {
    this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = EFFECTIVE_FROM_TIMESTAMP_COLUMN;
  }
  public OBJECT with_EFFECTIVE_FROM_TIMESTAMP_COLUMN(String EFFECTIVE_FROM_TIMESTAMP_COLUMN) {
    this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = EFFECTIVE_FROM_TIMESTAMP_COLUMN;
    return this;
  }
  private String EFFECTIVE_TO_TIMESTAMP_COLUMN;
  public String get_EFFECTIVE_TO_TIMESTAMP_COLUMN() {
    return EFFECTIVE_TO_TIMESTAMP_COLUMN;
  }
  public void set_EFFECTIVE_TO_TIMESTAMP_COLUMN(String EFFECTIVE_TO_TIMESTAMP_COLUMN) {
    this.EFFECTIVE_TO_TIMESTAMP_COLUMN = EFFECTIVE_TO_TIMESTAMP_COLUMN;
  }
  public OBJECT with_EFFECTIVE_TO_TIMESTAMP_COLUMN(String EFFECTIVE_TO_TIMESTAMP_COLUMN) {
    this.EFFECTIVE_TO_TIMESTAMP_COLUMN = EFFECTIVE_TO_TIMESTAMP_COLUMN;
    return this;
  }
  private String EFFECTIVE_TIMESTAMP_GRAIN;
  public String get_EFFECTIVE_TIMESTAMP_GRAIN() {
    return EFFECTIVE_TIMESTAMP_GRAIN;
  }
  public void set_EFFECTIVE_TIMESTAMP_GRAIN(String EFFECTIVE_TIMESTAMP_GRAIN) {
    this.EFFECTIVE_TIMESTAMP_GRAIN = EFFECTIVE_TIMESTAMP_GRAIN;
  }
  public OBJECT with_EFFECTIVE_TIMESTAMP_GRAIN(String EFFECTIVE_TIMESTAMP_GRAIN) {
    this.EFFECTIVE_TIMESTAMP_GRAIN = EFFECTIVE_TIMESTAMP_GRAIN;
    return this;
  }
  private String PURGE_GRAIN;
  public String get_PURGE_GRAIN() {
    return PURGE_GRAIN;
  }
  public void set_PURGE_GRAIN(String PURGE_GRAIN) {
    this.PURGE_GRAIN = PURGE_GRAIN;
  }
  public OBJECT with_PURGE_GRAIN(String PURGE_GRAIN) {
    this.PURGE_GRAIN = PURGE_GRAIN;
    return this;
  }
  private String DUPLICATION_TIMESTAMP_GRAIN;
  public String get_DUPLICATION_TIMESTAMP_GRAIN() {
    return DUPLICATION_TIMESTAMP_GRAIN;
  }
  public void set_DUPLICATION_TIMESTAMP_GRAIN(String DUPLICATION_TIMESTAMP_GRAIN) {
    this.DUPLICATION_TIMESTAMP_GRAIN = DUPLICATION_TIMESTAMP_GRAIN;
  }
  public OBJECT with_DUPLICATION_TIMESTAMP_GRAIN(String DUPLICATION_TIMESTAMP_GRAIN) {
    this.DUPLICATION_TIMESTAMP_GRAIN = DUPLICATION_TIMESTAMP_GRAIN;
    return this;
  }
  private java.sql.Timestamp CREATED_DATE;
  public java.sql.Timestamp get_CREATED_DATE() {
    return CREATED_DATE;
  }
  public void set_CREATED_DATE(java.sql.Timestamp CREATED_DATE) {
    this.CREATED_DATE = CREATED_DATE;
  }
  public OBJECT with_CREATED_DATE(java.sql.Timestamp CREATED_DATE) {
    this.CREATED_DATE = CREATED_DATE;
    return this;
  }
  private String CREATED_BY;
  public String get_CREATED_BY() {
    return CREATED_BY;
  }
  public void set_CREATED_BY(String CREATED_BY) {
    this.CREATED_BY = CREATED_BY;
  }
  public OBJECT with_CREATED_BY(String CREATED_BY) {
    this.CREATED_BY = CREATED_BY;
    return this;
  }
  private String BATCH_NAME;
  public String get_BATCH_NAME() {
    return BATCH_NAME;
  }
  public void set_BATCH_NAME(String BATCH_NAME) {
    this.BATCH_NAME = BATCH_NAME;
  }
  public OBJECT with_BATCH_NAME(String BATCH_NAME) {
    this.BATCH_NAME = BATCH_NAME;
    return this;
  }
  private String CAS_UPLOAD;
  public String get_CAS_UPLOAD() {
    return CAS_UPLOAD;
  }
  public void set_CAS_UPLOAD(String CAS_UPLOAD) {
    this.CAS_UPLOAD = CAS_UPLOAD;
  }
  public OBJECT with_CAS_UPLOAD(String CAS_UPLOAD) {
    this.CAS_UPLOAD = CAS_UPLOAD;
    return this;
  }
  private String LAYER;
  public String get_LAYER() {
    return LAYER;
  }
  public void set_LAYER(String LAYER) {
    this.LAYER = LAYER;
  }
  public OBJECT with_LAYER(String LAYER) {
    this.LAYER = LAYER;
    return this;
  }
  private String INGESTION_MODE;
  public String get_INGESTION_MODE() {
    return INGESTION_MODE;
  }
  public void set_INGESTION_MODE(String INGESTION_MODE) {
    this.INGESTION_MODE = INGESTION_MODE;
  }
  public OBJECT with_INGESTION_MODE(String INGESTION_MODE) {
    this.INGESTION_MODE = INGESTION_MODE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof OBJECT)) {
      return false;
    }
    OBJECT that = (OBJECT) o;
    boolean equal = true;
    equal = equal && (this.OBJECT_KEY == null ? that.OBJECT_KEY == null : this.OBJECT_KEY.equals(that.OBJECT_KEY));
    equal = equal && (this.SYSTEM_SCHEMA_KEY == null ? that.SYSTEM_SCHEMA_KEY == null : this.SYSTEM_SCHEMA_KEY.equals(that.SYSTEM_SCHEMA_KEY));
    equal = equal && (this.TARGET_OBJECT_NAME == null ? that.TARGET_OBJECT_NAME == null : this.TARGET_OBJECT_NAME.equals(that.TARGET_OBJECT_NAME));
    equal = equal && (this.OBJECT_SHORT_NAME == null ? that.OBJECT_SHORT_NAME == null : this.OBJECT_SHORT_NAME.equals(that.OBJECT_SHORT_NAME));
    equal = equal && (this.TARGET_DB == null ? that.TARGET_DB == null : this.TARGET_DB.equals(that.TARGET_DB));
    equal = equal && (this.SOURCE_OBJECT_NAME == null ? that.SOURCE_OBJECT_NAME == null : this.SOURCE_OBJECT_NAME.equals(that.SOURCE_OBJECT_NAME));
    equal = equal && (this.SOURCE_OBJECT_TYPE == null ? that.SOURCE_OBJECT_TYPE == null : this.SOURCE_OBJECT_TYPE.equals(that.SOURCE_OBJECT_TYPE));
    equal = equal && (this.SAS_LIB_REF == null ? that.SAS_LIB_REF == null : this.SAS_LIB_REF.equals(that.SAS_LIB_REF));
    equal = equal && (this.PK_COLUMN_NAMES == null ? that.PK_COLUMN_NAMES == null : this.PK_COLUMN_NAMES.equals(that.PK_COLUMN_NAMES));
    equal = equal && (this.NK_COLUMN_NAMES == null ? that.NK_COLUMN_NAMES == null : this.NK_COLUMN_NAMES.equals(that.NK_COLUMN_NAMES));
    equal = equal && (this.EXCLUDED_COLUMNS == null ? that.EXCLUDED_COLUMNS == null : this.EXCLUDED_COLUMNS.equals(that.EXCLUDED_COLUMNS));
    equal = equal && (this.LOAD_PATTERN_NAME == null ? that.LOAD_PATTERN_NAME == null : this.LOAD_PATTERN_NAME.equals(that.LOAD_PATTERN_NAME));
    equal = equal && (this.SENSITIVE_DATA_FLAG == null ? that.SENSITIVE_DATA_FLAG == null : this.SENSITIVE_DATA_FLAG.equals(that.SENSITIVE_DATA_FLAG));
    equal = equal && (this.RETENTION_KEY == null ? that.RETENTION_KEY == null : this.RETENTION_KEY.equals(that.RETENTION_KEY));
    equal = equal && (this.CUSTOM_SQL == null ? that.CUSTOM_SQL == null : this.CUSTOM_SQL.equals(that.CUSTOM_SQL));
    equal = equal && (this.CHANGE_CAPTURE_TIMESTAMP_COLUMN == null ? that.CHANGE_CAPTURE_TIMESTAMP_COLUMN == null : this.CHANGE_CAPTURE_TIMESTAMP_COLUMN.equals(that.CHANGE_CAPTURE_TIMESTAMP_COLUMN));
    equal = equal && (this.HISTORY_LOADED_FROM_TDW == null ? that.HISTORY_LOADED_FROM_TDW == null : this.HISTORY_LOADED_FROM_TDW.equals(that.HISTORY_LOADED_FROM_TDW));
    equal = equal && (this.HISTORY_TYPE == null ? that.HISTORY_TYPE == null : this.HISTORY_TYPE.equals(that.HISTORY_TYPE));
    equal = equal && (this.EFFECTIVE_FROM_TIMESTAMP_COLUMN == null ? that.EFFECTIVE_FROM_TIMESTAMP_COLUMN == null : this.EFFECTIVE_FROM_TIMESTAMP_COLUMN.equals(that.EFFECTIVE_FROM_TIMESTAMP_COLUMN));
    equal = equal && (this.EFFECTIVE_TO_TIMESTAMP_COLUMN == null ? that.EFFECTIVE_TO_TIMESTAMP_COLUMN == null : this.EFFECTIVE_TO_TIMESTAMP_COLUMN.equals(that.EFFECTIVE_TO_TIMESTAMP_COLUMN));
    equal = equal && (this.EFFECTIVE_TIMESTAMP_GRAIN == null ? that.EFFECTIVE_TIMESTAMP_GRAIN == null : this.EFFECTIVE_TIMESTAMP_GRAIN.equals(that.EFFECTIVE_TIMESTAMP_GRAIN));
    equal = equal && (this.PURGE_GRAIN == null ? that.PURGE_GRAIN == null : this.PURGE_GRAIN.equals(that.PURGE_GRAIN));
    equal = equal && (this.DUPLICATION_TIMESTAMP_GRAIN == null ? that.DUPLICATION_TIMESTAMP_GRAIN == null : this.DUPLICATION_TIMESTAMP_GRAIN.equals(that.DUPLICATION_TIMESTAMP_GRAIN));
    equal = equal && (this.CREATED_DATE == null ? that.CREATED_DATE == null : this.CREATED_DATE.equals(that.CREATED_DATE));
    equal = equal && (this.CREATED_BY == null ? that.CREATED_BY == null : this.CREATED_BY.equals(that.CREATED_BY));
    equal = equal && (this.BATCH_NAME == null ? that.BATCH_NAME == null : this.BATCH_NAME.equals(that.BATCH_NAME));
    equal = equal && (this.CAS_UPLOAD == null ? that.CAS_UPLOAD == null : this.CAS_UPLOAD.equals(that.CAS_UPLOAD));
    equal = equal && (this.LAYER == null ? that.LAYER == null : this.LAYER.equals(that.LAYER));
    equal = equal && (this.INGESTION_MODE == null ? that.INGESTION_MODE == null : this.INGESTION_MODE.equals(that.INGESTION_MODE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof OBJECT)) {
      return false;
    }
    OBJECT that = (OBJECT) o;
    boolean equal = true;
    equal = equal && (this.OBJECT_KEY == null ? that.OBJECT_KEY == null : this.OBJECT_KEY.equals(that.OBJECT_KEY));
    equal = equal && (this.SYSTEM_SCHEMA_KEY == null ? that.SYSTEM_SCHEMA_KEY == null : this.SYSTEM_SCHEMA_KEY.equals(that.SYSTEM_SCHEMA_KEY));
    equal = equal && (this.TARGET_OBJECT_NAME == null ? that.TARGET_OBJECT_NAME == null : this.TARGET_OBJECT_NAME.equals(that.TARGET_OBJECT_NAME));
    equal = equal && (this.OBJECT_SHORT_NAME == null ? that.OBJECT_SHORT_NAME == null : this.OBJECT_SHORT_NAME.equals(that.OBJECT_SHORT_NAME));
    equal = equal && (this.TARGET_DB == null ? that.TARGET_DB == null : this.TARGET_DB.equals(that.TARGET_DB));
    equal = equal && (this.SOURCE_OBJECT_NAME == null ? that.SOURCE_OBJECT_NAME == null : this.SOURCE_OBJECT_NAME.equals(that.SOURCE_OBJECT_NAME));
    equal = equal && (this.SOURCE_OBJECT_TYPE == null ? that.SOURCE_OBJECT_TYPE == null : this.SOURCE_OBJECT_TYPE.equals(that.SOURCE_OBJECT_TYPE));
    equal = equal && (this.SAS_LIB_REF == null ? that.SAS_LIB_REF == null : this.SAS_LIB_REF.equals(that.SAS_LIB_REF));
    equal = equal && (this.PK_COLUMN_NAMES == null ? that.PK_COLUMN_NAMES == null : this.PK_COLUMN_NAMES.equals(that.PK_COLUMN_NAMES));
    equal = equal && (this.NK_COLUMN_NAMES == null ? that.NK_COLUMN_NAMES == null : this.NK_COLUMN_NAMES.equals(that.NK_COLUMN_NAMES));
    equal = equal && (this.EXCLUDED_COLUMNS == null ? that.EXCLUDED_COLUMNS == null : this.EXCLUDED_COLUMNS.equals(that.EXCLUDED_COLUMNS));
    equal = equal && (this.LOAD_PATTERN_NAME == null ? that.LOAD_PATTERN_NAME == null : this.LOAD_PATTERN_NAME.equals(that.LOAD_PATTERN_NAME));
    equal = equal && (this.SENSITIVE_DATA_FLAG == null ? that.SENSITIVE_DATA_FLAG == null : this.SENSITIVE_DATA_FLAG.equals(that.SENSITIVE_DATA_FLAG));
    equal = equal && (this.RETENTION_KEY == null ? that.RETENTION_KEY == null : this.RETENTION_KEY.equals(that.RETENTION_KEY));
    equal = equal && (this.CUSTOM_SQL == null ? that.CUSTOM_SQL == null : this.CUSTOM_SQL.equals(that.CUSTOM_SQL));
    equal = equal && (this.CHANGE_CAPTURE_TIMESTAMP_COLUMN == null ? that.CHANGE_CAPTURE_TIMESTAMP_COLUMN == null : this.CHANGE_CAPTURE_TIMESTAMP_COLUMN.equals(that.CHANGE_CAPTURE_TIMESTAMP_COLUMN));
    equal = equal && (this.HISTORY_LOADED_FROM_TDW == null ? that.HISTORY_LOADED_FROM_TDW == null : this.HISTORY_LOADED_FROM_TDW.equals(that.HISTORY_LOADED_FROM_TDW));
    equal = equal && (this.HISTORY_TYPE == null ? that.HISTORY_TYPE == null : this.HISTORY_TYPE.equals(that.HISTORY_TYPE));
    equal = equal && (this.EFFECTIVE_FROM_TIMESTAMP_COLUMN == null ? that.EFFECTIVE_FROM_TIMESTAMP_COLUMN == null : this.EFFECTIVE_FROM_TIMESTAMP_COLUMN.equals(that.EFFECTIVE_FROM_TIMESTAMP_COLUMN));
    equal = equal && (this.EFFECTIVE_TO_TIMESTAMP_COLUMN == null ? that.EFFECTIVE_TO_TIMESTAMP_COLUMN == null : this.EFFECTIVE_TO_TIMESTAMP_COLUMN.equals(that.EFFECTIVE_TO_TIMESTAMP_COLUMN));
    equal = equal && (this.EFFECTIVE_TIMESTAMP_GRAIN == null ? that.EFFECTIVE_TIMESTAMP_GRAIN == null : this.EFFECTIVE_TIMESTAMP_GRAIN.equals(that.EFFECTIVE_TIMESTAMP_GRAIN));
    equal = equal && (this.PURGE_GRAIN == null ? that.PURGE_GRAIN == null : this.PURGE_GRAIN.equals(that.PURGE_GRAIN));
    equal = equal && (this.DUPLICATION_TIMESTAMP_GRAIN == null ? that.DUPLICATION_TIMESTAMP_GRAIN == null : this.DUPLICATION_TIMESTAMP_GRAIN.equals(that.DUPLICATION_TIMESTAMP_GRAIN));
    equal = equal && (this.CREATED_DATE == null ? that.CREATED_DATE == null : this.CREATED_DATE.equals(that.CREATED_DATE));
    equal = equal && (this.CREATED_BY == null ? that.CREATED_BY == null : this.CREATED_BY.equals(that.CREATED_BY));
    equal = equal && (this.BATCH_NAME == null ? that.BATCH_NAME == null : this.BATCH_NAME.equals(that.BATCH_NAME));
    equal = equal && (this.CAS_UPLOAD == null ? that.CAS_UPLOAD == null : this.CAS_UPLOAD.equals(that.CAS_UPLOAD));
    equal = equal && (this.LAYER == null ? that.LAYER == null : this.LAYER.equals(that.LAYER));
    equal = equal && (this.INGESTION_MODE == null ? that.INGESTION_MODE == null : this.INGESTION_MODE.equals(that.INGESTION_MODE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OBJECT_KEY = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.SYSTEM_SCHEMA_KEY = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.TARGET_OBJECT_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.OBJECT_SHORT_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.TARGET_DB = JdbcWritableBridge.readString(5, __dbResults);
    this.SOURCE_OBJECT_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.SOURCE_OBJECT_TYPE = JdbcWritableBridge.readString(7, __dbResults);
    this.SAS_LIB_REF = JdbcWritableBridge.readString(8, __dbResults);
    this.PK_COLUMN_NAMES = JdbcWritableBridge.readClobRef(9, __dbResults);
    this.NK_COLUMN_NAMES = JdbcWritableBridge.readClobRef(10, __dbResults);
    this.EXCLUDED_COLUMNS = JdbcWritableBridge.readClobRef(11, __dbResults);
    this.LOAD_PATTERN_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.SENSITIVE_DATA_FLAG = JdbcWritableBridge.readString(13, __dbResults);
    this.RETENTION_KEY = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.CUSTOM_SQL = JdbcWritableBridge.readClobRef(15, __dbResults);
    this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(16, __dbResults);
    this.HISTORY_LOADED_FROM_TDW = JdbcWritableBridge.readString(17, __dbResults);
    this.HISTORY_TYPE = JdbcWritableBridge.readString(18, __dbResults);
    this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(19, __dbResults);
    this.EFFECTIVE_TO_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(20, __dbResults);
    this.EFFECTIVE_TIMESTAMP_GRAIN = JdbcWritableBridge.readString(21, __dbResults);
    this.PURGE_GRAIN = JdbcWritableBridge.readString(22, __dbResults);
    this.DUPLICATION_TIMESTAMP_GRAIN = JdbcWritableBridge.readString(23, __dbResults);
    this.CREATED_DATE = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.CREATED_BY = JdbcWritableBridge.readString(25, __dbResults);
    this.BATCH_NAME = JdbcWritableBridge.readString(26, __dbResults);
    this.CAS_UPLOAD = JdbcWritableBridge.readString(27, __dbResults);
    this.LAYER = JdbcWritableBridge.readString(28, __dbResults);
    this.INGESTION_MODE = JdbcWritableBridge.readString(29, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OBJECT_KEY = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.SYSTEM_SCHEMA_KEY = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.TARGET_OBJECT_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.OBJECT_SHORT_NAME = JdbcWritableBridge.readString(4, __dbResults);
    this.TARGET_DB = JdbcWritableBridge.readString(5, __dbResults);
    this.SOURCE_OBJECT_NAME = JdbcWritableBridge.readString(6, __dbResults);
    this.SOURCE_OBJECT_TYPE = JdbcWritableBridge.readString(7, __dbResults);
    this.SAS_LIB_REF = JdbcWritableBridge.readString(8, __dbResults);
    this.PK_COLUMN_NAMES = JdbcWritableBridge.readClobRef(9, __dbResults);
    this.NK_COLUMN_NAMES = JdbcWritableBridge.readClobRef(10, __dbResults);
    this.EXCLUDED_COLUMNS = JdbcWritableBridge.readClobRef(11, __dbResults);
    this.LOAD_PATTERN_NAME = JdbcWritableBridge.readString(12, __dbResults);
    this.SENSITIVE_DATA_FLAG = JdbcWritableBridge.readString(13, __dbResults);
    this.RETENTION_KEY = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.CUSTOM_SQL = JdbcWritableBridge.readClobRef(15, __dbResults);
    this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(16, __dbResults);
    this.HISTORY_LOADED_FROM_TDW = JdbcWritableBridge.readString(17, __dbResults);
    this.HISTORY_TYPE = JdbcWritableBridge.readString(18, __dbResults);
    this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(19, __dbResults);
    this.EFFECTIVE_TO_TIMESTAMP_COLUMN = JdbcWritableBridge.readString(20, __dbResults);
    this.EFFECTIVE_TIMESTAMP_GRAIN = JdbcWritableBridge.readString(21, __dbResults);
    this.PURGE_GRAIN = JdbcWritableBridge.readString(22, __dbResults);
    this.DUPLICATION_TIMESTAMP_GRAIN = JdbcWritableBridge.readString(23, __dbResults);
    this.CREATED_DATE = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.CREATED_BY = JdbcWritableBridge.readString(25, __dbResults);
    this.BATCH_NAME = JdbcWritableBridge.readString(26, __dbResults);
    this.CAS_UPLOAD = JdbcWritableBridge.readString(27, __dbResults);
    this.LAYER = JdbcWritableBridge.readString(28, __dbResults);
    this.INGESTION_MODE = JdbcWritableBridge.readString(29, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.PK_COLUMN_NAMES = __loader.readClobRef(9, this.__cur_result_set);
    this.NK_COLUMN_NAMES = __loader.readClobRef(10, this.__cur_result_set);
    this.EXCLUDED_COLUMNS = __loader.readClobRef(11, this.__cur_result_set);
    this.CUSTOM_SQL = __loader.readClobRef(15, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.PK_COLUMN_NAMES = __loader.readClobRef(9, this.__cur_result_set);
    this.NK_COLUMN_NAMES = __loader.readClobRef(10, this.__cur_result_set);
    this.EXCLUDED_COLUMNS = __loader.readClobRef(11, this.__cur_result_set);
    this.CUSTOM_SQL = __loader.readClobRef(15, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(OBJECT_KEY, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SYSTEM_SCHEMA_KEY, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_OBJECT_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_SHORT_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_DB, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_OBJECT_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_OBJECT_TYPE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SAS_LIB_REF, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeClobRef(PK_COLUMN_NAMES, 9 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeClobRef(NK_COLUMN_NAMES, 10 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeClobRef(EXCLUDED_COLUMNS, 11 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_PATTERN_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SENSITIVE_DATA_FLAG, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RETENTION_KEY, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeClobRef(CUSTOM_SQL, 15 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_CAPTURE_TIMESTAMP_COLUMN, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HISTORY_LOADED_FROM_TDW, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HISTORY_TYPE, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_FROM_TIMESTAMP_COLUMN, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_TO_TIMESTAMP_COLUMN, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_TIMESTAMP_GRAIN, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PURGE_GRAIN, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DUPLICATION_TIMESTAMP_GRAIN, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CREATED_DATE, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CREATED_BY, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BATCH_NAME, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAS_UPLOAD, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAYER, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INGESTION_MODE, 29 + __off, 12, __dbStmt);
    return 29;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(OBJECT_KEY, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SYSTEM_SCHEMA_KEY, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_OBJECT_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_SHORT_NAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_DB, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_OBJECT_NAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE_OBJECT_TYPE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SAS_LIB_REF, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeClobRef(PK_COLUMN_NAMES, 9 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeClobRef(NK_COLUMN_NAMES, 10 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeClobRef(EXCLUDED_COLUMNS, 11 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_PATTERN_NAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SENSITIVE_DATA_FLAG, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RETENTION_KEY, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeClobRef(CUSTOM_SQL, 15 + __off, 2005, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_CAPTURE_TIMESTAMP_COLUMN, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HISTORY_LOADED_FROM_TDW, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HISTORY_TYPE, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_FROM_TIMESTAMP_COLUMN, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_TO_TIMESTAMP_COLUMN, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EFFECTIVE_TIMESTAMP_GRAIN, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PURGE_GRAIN, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DUPLICATION_TIMESTAMP_GRAIN, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CREATED_DATE, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CREATED_BY, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BATCH_NAME, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CAS_UPLOAD, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAYER, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INGESTION_MODE, 29 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.OBJECT_KEY = null;
    } else {
    this.OBJECT_KEY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SYSTEM_SCHEMA_KEY = null;
    } else {
    this.SYSTEM_SCHEMA_KEY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TARGET_OBJECT_NAME = null;
    } else {
    this.TARGET_OBJECT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OBJECT_SHORT_NAME = null;
    } else {
    this.OBJECT_SHORT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TARGET_DB = null;
    } else {
    this.TARGET_DB = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SOURCE_OBJECT_NAME = null;
    } else {
    this.SOURCE_OBJECT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SOURCE_OBJECT_TYPE = null;
    } else {
    this.SOURCE_OBJECT_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SAS_LIB_REF = null;
    } else {
    this.SAS_LIB_REF = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PK_COLUMN_NAMES = null;
    } else {
    this.PK_COLUMN_NAMES = com.cloudera.sqoop.lib.LobSerializer.readClobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NK_COLUMN_NAMES = null;
    } else {
    this.NK_COLUMN_NAMES = com.cloudera.sqoop.lib.LobSerializer.readClobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXCLUDED_COLUMNS = null;
    } else {
    this.EXCLUDED_COLUMNS = com.cloudera.sqoop.lib.LobSerializer.readClobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_PATTERN_NAME = null;
    } else {
    this.LOAD_PATTERN_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SENSITIVE_DATA_FLAG = null;
    } else {
    this.SENSITIVE_DATA_FLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RETENTION_KEY = null;
    } else {
    this.RETENTION_KEY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CUSTOM_SQL = null;
    } else {
    this.CUSTOM_SQL = com.cloudera.sqoop.lib.LobSerializer.readClobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = null;
    } else {
    this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HISTORY_LOADED_FROM_TDW = null;
    } else {
    this.HISTORY_LOADED_FROM_TDW = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HISTORY_TYPE = null;
    } else {
    this.HISTORY_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = null;
    } else {
    this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EFFECTIVE_TO_TIMESTAMP_COLUMN = null;
    } else {
    this.EFFECTIVE_TO_TIMESTAMP_COLUMN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EFFECTIVE_TIMESTAMP_GRAIN = null;
    } else {
    this.EFFECTIVE_TIMESTAMP_GRAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PURGE_GRAIN = null;
    } else {
    this.PURGE_GRAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DUPLICATION_TIMESTAMP_GRAIN = null;
    } else {
    this.DUPLICATION_TIMESTAMP_GRAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREATED_DATE = null;
    } else {
    this.CREATED_DATE = new Timestamp(__dataIn.readLong());
    this.CREATED_DATE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CREATED_BY = null;
    } else {
    this.CREATED_BY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BATCH_NAME = null;
    } else {
    this.BATCH_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CAS_UPLOAD = null;
    } else {
    this.CAS_UPLOAD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAYER = null;
    } else {
    this.LAYER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INGESTION_MODE = null;
    } else {
    this.INGESTION_MODE = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.OBJECT_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_KEY, __dataOut);
    }
    if (null == this.SYSTEM_SCHEMA_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SYSTEM_SCHEMA_KEY, __dataOut);
    }
    if (null == this.TARGET_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_OBJECT_NAME);
    }
    if (null == this.OBJECT_SHORT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_SHORT_NAME);
    }
    if (null == this.TARGET_DB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_DB);
    }
    if (null == this.SOURCE_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_OBJECT_NAME);
    }
    if (null == this.SOURCE_OBJECT_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_OBJECT_TYPE);
    }
    if (null == this.SAS_LIB_REF) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SAS_LIB_REF);
    }
    if (null == this.PK_COLUMN_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.PK_COLUMN_NAMES, __dataOut);
    }
    if (null == this.NK_COLUMN_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.NK_COLUMN_NAMES, __dataOut);
    }
    if (null == this.EXCLUDED_COLUMNS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.EXCLUDED_COLUMNS, __dataOut);
    }
    if (null == this.LOAD_PATTERN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_PATTERN_NAME);
    }
    if (null == this.SENSITIVE_DATA_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SENSITIVE_DATA_FLAG);
    }
    if (null == this.RETENTION_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RETENTION_KEY, __dataOut);
    }
    if (null == this.CUSTOM_SQL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.CUSTOM_SQL, __dataOut);
    }
    if (null == this.CHANGE_CAPTURE_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHANGE_CAPTURE_TIMESTAMP_COLUMN);
    }
    if (null == this.HISTORY_LOADED_FROM_TDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HISTORY_LOADED_FROM_TDW);
    }
    if (null == this.HISTORY_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HISTORY_TYPE);
    }
    if (null == this.EFFECTIVE_FROM_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_FROM_TIMESTAMP_COLUMN);
    }
    if (null == this.EFFECTIVE_TO_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_TO_TIMESTAMP_COLUMN);
    }
    if (null == this.EFFECTIVE_TIMESTAMP_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_TIMESTAMP_GRAIN);
    }
    if (null == this.PURGE_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PURGE_GRAIN);
    }
    if (null == this.DUPLICATION_TIMESTAMP_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DUPLICATION_TIMESTAMP_GRAIN);
    }
    if (null == this.CREATED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CREATED_DATE.getTime());
    __dataOut.writeInt(this.CREATED_DATE.getNanos());
    }
    if (null == this.CREATED_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATED_BY);
    }
    if (null == this.BATCH_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BATCH_NAME);
    }
    if (null == this.CAS_UPLOAD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAS_UPLOAD);
    }
    if (null == this.LAYER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAYER);
    }
    if (null == this.INGESTION_MODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INGESTION_MODE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.OBJECT_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_KEY, __dataOut);
    }
    if (null == this.SYSTEM_SCHEMA_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SYSTEM_SCHEMA_KEY, __dataOut);
    }
    if (null == this.TARGET_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_OBJECT_NAME);
    }
    if (null == this.OBJECT_SHORT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_SHORT_NAME);
    }
    if (null == this.TARGET_DB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_DB);
    }
    if (null == this.SOURCE_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_OBJECT_NAME);
    }
    if (null == this.SOURCE_OBJECT_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE_OBJECT_TYPE);
    }
    if (null == this.SAS_LIB_REF) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SAS_LIB_REF);
    }
    if (null == this.PK_COLUMN_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.PK_COLUMN_NAMES, __dataOut);
    }
    if (null == this.NK_COLUMN_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.NK_COLUMN_NAMES, __dataOut);
    }
    if (null == this.EXCLUDED_COLUMNS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.EXCLUDED_COLUMNS, __dataOut);
    }
    if (null == this.LOAD_PATTERN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_PATTERN_NAME);
    }
    if (null == this.SENSITIVE_DATA_FLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SENSITIVE_DATA_FLAG);
    }
    if (null == this.RETENTION_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RETENTION_KEY, __dataOut);
    }
    if (null == this.CUSTOM_SQL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeClob(this.CUSTOM_SQL, __dataOut);
    }
    if (null == this.CHANGE_CAPTURE_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHANGE_CAPTURE_TIMESTAMP_COLUMN);
    }
    if (null == this.HISTORY_LOADED_FROM_TDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HISTORY_LOADED_FROM_TDW);
    }
    if (null == this.HISTORY_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HISTORY_TYPE);
    }
    if (null == this.EFFECTIVE_FROM_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_FROM_TIMESTAMP_COLUMN);
    }
    if (null == this.EFFECTIVE_TO_TIMESTAMP_COLUMN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_TO_TIMESTAMP_COLUMN);
    }
    if (null == this.EFFECTIVE_TIMESTAMP_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EFFECTIVE_TIMESTAMP_GRAIN);
    }
    if (null == this.PURGE_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PURGE_GRAIN);
    }
    if (null == this.DUPLICATION_TIMESTAMP_GRAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DUPLICATION_TIMESTAMP_GRAIN);
    }
    if (null == this.CREATED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CREATED_DATE.getTime());
    __dataOut.writeInt(this.CREATED_DATE.getNanos());
    }
    if (null == this.CREATED_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATED_BY);
    }
    if (null == this.BATCH_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BATCH_NAME);
    }
    if (null == this.CAS_UPLOAD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CAS_UPLOAD);
    }
    if (null == this.LAYER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAYER);
    }
    if (null == this.INGESTION_MODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INGESTION_MODE);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_KEY==null?"null":OBJECT_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SYSTEM_SCHEMA_KEY==null?"null":SYSTEM_SCHEMA_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_OBJECT_NAME==null?"null":TARGET_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_SHORT_NAME==null?"null":OBJECT_SHORT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_DB==null?"null":TARGET_DB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_OBJECT_NAME==null?"null":SOURCE_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_OBJECT_TYPE==null?"null":SOURCE_OBJECT_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAS_LIB_REF==null?"null":SAS_LIB_REF, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PK_COLUMN_NAMES==null?"null":"" + PK_COLUMN_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NK_COLUMN_NAMES==null?"null":"" + NK_COLUMN_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXCLUDED_COLUMNS==null?"null":"" + EXCLUDED_COLUMNS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_PATTERN_NAME==null?"null":LOAD_PATTERN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SENSITIVE_DATA_FLAG==null?"null":SENSITIVE_DATA_FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RETENTION_KEY==null?"null":RETENTION_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUSTOM_SQL==null?"null":"" + CUSTOM_SQL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_CAPTURE_TIMESTAMP_COLUMN==null?"null":CHANGE_CAPTURE_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HISTORY_LOADED_FROM_TDW==null?"null":HISTORY_LOADED_FROM_TDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HISTORY_TYPE==null?"null":HISTORY_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_FROM_TIMESTAMP_COLUMN==null?"null":EFFECTIVE_FROM_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_TO_TIMESTAMP_COLUMN==null?"null":EFFECTIVE_TO_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_TIMESTAMP_GRAIN==null?"null":EFFECTIVE_TIMESTAMP_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PURGE_GRAIN==null?"null":PURGE_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DUPLICATION_TIMESTAMP_GRAIN==null?"null":DUPLICATION_TIMESTAMP_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATED_DATE==null?"null":"" + CREATED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATED_BY==null?"null":CREATED_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BATCH_NAME==null?"null":BATCH_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAS_UPLOAD==null?"null":CAS_UPLOAD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAYER==null?"null":LAYER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INGESTION_MODE==null?"null":INGESTION_MODE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_KEY==null?"null":OBJECT_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SYSTEM_SCHEMA_KEY==null?"null":SYSTEM_SCHEMA_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_OBJECT_NAME==null?"null":TARGET_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_SHORT_NAME==null?"null":OBJECT_SHORT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_DB==null?"null":TARGET_DB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_OBJECT_NAME==null?"null":SOURCE_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE_OBJECT_TYPE==null?"null":SOURCE_OBJECT_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SAS_LIB_REF==null?"null":SAS_LIB_REF, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PK_COLUMN_NAMES==null?"null":"" + PK_COLUMN_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NK_COLUMN_NAMES==null?"null":"" + NK_COLUMN_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXCLUDED_COLUMNS==null?"null":"" + EXCLUDED_COLUMNS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_PATTERN_NAME==null?"null":LOAD_PATTERN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SENSITIVE_DATA_FLAG==null?"null":SENSITIVE_DATA_FLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RETENTION_KEY==null?"null":RETENTION_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CUSTOM_SQL==null?"null":"" + CUSTOM_SQL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_CAPTURE_TIMESTAMP_COLUMN==null?"null":CHANGE_CAPTURE_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HISTORY_LOADED_FROM_TDW==null?"null":HISTORY_LOADED_FROM_TDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HISTORY_TYPE==null?"null":HISTORY_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_FROM_TIMESTAMP_COLUMN==null?"null":EFFECTIVE_FROM_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_TO_TIMESTAMP_COLUMN==null?"null":EFFECTIVE_TO_TIMESTAMP_COLUMN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_TIMESTAMP_GRAIN==null?"null":EFFECTIVE_TIMESTAMP_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PURGE_GRAIN==null?"null":PURGE_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DUPLICATION_TIMESTAMP_GRAIN==null?"null":DUPLICATION_TIMESTAMP_GRAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATED_DATE==null?"null":"" + CREATED_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATED_BY==null?"null":CREATED_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BATCH_NAME==null?"null":BATCH_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CAS_UPLOAD==null?"null":CAS_UPLOAD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAYER==null?"null":LAYER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INGESTION_MODE==null?"null":INGESTION_MODE, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_KEY = null; } else {
      this.OBJECT_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SYSTEM_SCHEMA_KEY = null; } else {
      this.SYSTEM_SCHEMA_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_OBJECT_NAME = null; } else {
      this.TARGET_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_SHORT_NAME = null; } else {
      this.OBJECT_SHORT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_DB = null; } else {
      this.TARGET_DB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_OBJECT_NAME = null; } else {
      this.SOURCE_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_OBJECT_TYPE = null; } else {
      this.SOURCE_OBJECT_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SAS_LIB_REF = null; } else {
      this.SAS_LIB_REF = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PK_COLUMN_NAMES = null; } else {
      this.PK_COLUMN_NAMES = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NK_COLUMN_NAMES = null; } else {
      this.NK_COLUMN_NAMES = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EXCLUDED_COLUMNS = null; } else {
      this.EXCLUDED_COLUMNS = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_PATTERN_NAME = null; } else {
      this.LOAD_PATTERN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SENSITIVE_DATA_FLAG = null; } else {
      this.SENSITIVE_DATA_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RETENTION_KEY = null; } else {
      this.RETENTION_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUSTOM_SQL = null; } else {
      this.CUSTOM_SQL = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = null; } else {
      this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HISTORY_LOADED_FROM_TDW = null; } else {
      this.HISTORY_LOADED_FROM_TDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HISTORY_TYPE = null; } else {
      this.HISTORY_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = null; } else {
      this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_TO_TIMESTAMP_COLUMN = null; } else {
      this.EFFECTIVE_TO_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_TIMESTAMP_GRAIN = null; } else {
      this.EFFECTIVE_TIMESTAMP_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PURGE_GRAIN = null; } else {
      this.PURGE_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DUPLICATION_TIMESTAMP_GRAIN = null; } else {
      this.DUPLICATION_TIMESTAMP_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CREATED_DATE = null; } else {
      this.CREATED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATED_BY = null; } else {
      this.CREATED_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BATCH_NAME = null; } else {
      this.BATCH_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAS_UPLOAD = null; } else {
      this.CAS_UPLOAD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAYER = null; } else {
      this.LAYER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INGESTION_MODE = null; } else {
      this.INGESTION_MODE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_KEY = null; } else {
      this.OBJECT_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SYSTEM_SCHEMA_KEY = null; } else {
      this.SYSTEM_SCHEMA_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_OBJECT_NAME = null; } else {
      this.TARGET_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_SHORT_NAME = null; } else {
      this.OBJECT_SHORT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_DB = null; } else {
      this.TARGET_DB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_OBJECT_NAME = null; } else {
      this.SOURCE_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE_OBJECT_TYPE = null; } else {
      this.SOURCE_OBJECT_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SAS_LIB_REF = null; } else {
      this.SAS_LIB_REF = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PK_COLUMN_NAMES = null; } else {
      this.PK_COLUMN_NAMES = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NK_COLUMN_NAMES = null; } else {
      this.NK_COLUMN_NAMES = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EXCLUDED_COLUMNS = null; } else {
      this.EXCLUDED_COLUMNS = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_PATTERN_NAME = null; } else {
      this.LOAD_PATTERN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SENSITIVE_DATA_FLAG = null; } else {
      this.SENSITIVE_DATA_FLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RETENTION_KEY = null; } else {
      this.RETENTION_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CUSTOM_SQL = null; } else {
      this.CUSTOM_SQL = ClobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = null; } else {
      this.CHANGE_CAPTURE_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HISTORY_LOADED_FROM_TDW = null; } else {
      this.HISTORY_LOADED_FROM_TDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HISTORY_TYPE = null; } else {
      this.HISTORY_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = null; } else {
      this.EFFECTIVE_FROM_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_TO_TIMESTAMP_COLUMN = null; } else {
      this.EFFECTIVE_TO_TIMESTAMP_COLUMN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EFFECTIVE_TIMESTAMP_GRAIN = null; } else {
      this.EFFECTIVE_TIMESTAMP_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PURGE_GRAIN = null; } else {
      this.PURGE_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DUPLICATION_TIMESTAMP_GRAIN = null; } else {
      this.DUPLICATION_TIMESTAMP_GRAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CREATED_DATE = null; } else {
      this.CREATED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATED_BY = null; } else {
      this.CREATED_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BATCH_NAME = null; } else {
      this.BATCH_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CAS_UPLOAD = null; } else {
      this.CAS_UPLOAD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAYER = null; } else {
      this.LAYER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INGESTION_MODE = null; } else {
      this.INGESTION_MODE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    OBJECT o = (OBJECT) super.clone();
    o.PK_COLUMN_NAMES = (o.PK_COLUMN_NAMES != null) ? (com.cloudera.sqoop.lib.ClobRef) o.PK_COLUMN_NAMES.clone() : null;
    o.NK_COLUMN_NAMES = (o.NK_COLUMN_NAMES != null) ? (com.cloudera.sqoop.lib.ClobRef) o.NK_COLUMN_NAMES.clone() : null;
    o.EXCLUDED_COLUMNS = (o.EXCLUDED_COLUMNS != null) ? (com.cloudera.sqoop.lib.ClobRef) o.EXCLUDED_COLUMNS.clone() : null;
    o.CUSTOM_SQL = (o.CUSTOM_SQL != null) ? (com.cloudera.sqoop.lib.ClobRef) o.CUSTOM_SQL.clone() : null;
    o.CREATED_DATE = (o.CREATED_DATE != null) ? (java.sql.Timestamp) o.CREATED_DATE.clone() : null;
    return o;
  }

  public void clone0(OBJECT o) throws CloneNotSupportedException {
    o.PK_COLUMN_NAMES = (o.PK_COLUMN_NAMES != null) ? (com.cloudera.sqoop.lib.ClobRef) o.PK_COLUMN_NAMES.clone() : null;
    o.NK_COLUMN_NAMES = (o.NK_COLUMN_NAMES != null) ? (com.cloudera.sqoop.lib.ClobRef) o.NK_COLUMN_NAMES.clone() : null;
    o.EXCLUDED_COLUMNS = (o.EXCLUDED_COLUMNS != null) ? (com.cloudera.sqoop.lib.ClobRef) o.EXCLUDED_COLUMNS.clone() : null;
    o.CUSTOM_SQL = (o.CUSTOM_SQL != null) ? (com.cloudera.sqoop.lib.ClobRef) o.CUSTOM_SQL.clone() : null;
    o.CREATED_DATE = (o.CREATED_DATE != null) ? (java.sql.Timestamp) o.CREATED_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("OBJECT_KEY", this.OBJECT_KEY);
    __sqoop$field_map.put("SYSTEM_SCHEMA_KEY", this.SYSTEM_SCHEMA_KEY);
    __sqoop$field_map.put("TARGET_OBJECT_NAME", this.TARGET_OBJECT_NAME);
    __sqoop$field_map.put("OBJECT_SHORT_NAME", this.OBJECT_SHORT_NAME);
    __sqoop$field_map.put("TARGET_DB", this.TARGET_DB);
    __sqoop$field_map.put("SOURCE_OBJECT_NAME", this.SOURCE_OBJECT_NAME);
    __sqoop$field_map.put("SOURCE_OBJECT_TYPE", this.SOURCE_OBJECT_TYPE);
    __sqoop$field_map.put("SAS_LIB_REF", this.SAS_LIB_REF);
    __sqoop$field_map.put("PK_COLUMN_NAMES", this.PK_COLUMN_NAMES);
    __sqoop$field_map.put("NK_COLUMN_NAMES", this.NK_COLUMN_NAMES);
    __sqoop$field_map.put("EXCLUDED_COLUMNS", this.EXCLUDED_COLUMNS);
    __sqoop$field_map.put("LOAD_PATTERN_NAME", this.LOAD_PATTERN_NAME);
    __sqoop$field_map.put("SENSITIVE_DATA_FLAG", this.SENSITIVE_DATA_FLAG);
    __sqoop$field_map.put("RETENTION_KEY", this.RETENTION_KEY);
    __sqoop$field_map.put("CUSTOM_SQL", this.CUSTOM_SQL);
    __sqoop$field_map.put("CHANGE_CAPTURE_TIMESTAMP_COLUMN", this.CHANGE_CAPTURE_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("HISTORY_LOADED_FROM_TDW", this.HISTORY_LOADED_FROM_TDW);
    __sqoop$field_map.put("HISTORY_TYPE", this.HISTORY_TYPE);
    __sqoop$field_map.put("EFFECTIVE_FROM_TIMESTAMP_COLUMN", this.EFFECTIVE_FROM_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("EFFECTIVE_TO_TIMESTAMP_COLUMN", this.EFFECTIVE_TO_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("EFFECTIVE_TIMESTAMP_GRAIN", this.EFFECTIVE_TIMESTAMP_GRAIN);
    __sqoop$field_map.put("PURGE_GRAIN", this.PURGE_GRAIN);
    __sqoop$field_map.put("DUPLICATION_TIMESTAMP_GRAIN", this.DUPLICATION_TIMESTAMP_GRAIN);
    __sqoop$field_map.put("CREATED_DATE", this.CREATED_DATE);
    __sqoop$field_map.put("CREATED_BY", this.CREATED_BY);
    __sqoop$field_map.put("BATCH_NAME", this.BATCH_NAME);
    __sqoop$field_map.put("CAS_UPLOAD", this.CAS_UPLOAD);
    __sqoop$field_map.put("LAYER", this.LAYER);
    __sqoop$field_map.put("INGESTION_MODE", this.INGESTION_MODE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OBJECT_KEY", this.OBJECT_KEY);
    __sqoop$field_map.put("SYSTEM_SCHEMA_KEY", this.SYSTEM_SCHEMA_KEY);
    __sqoop$field_map.put("TARGET_OBJECT_NAME", this.TARGET_OBJECT_NAME);
    __sqoop$field_map.put("OBJECT_SHORT_NAME", this.OBJECT_SHORT_NAME);
    __sqoop$field_map.put("TARGET_DB", this.TARGET_DB);
    __sqoop$field_map.put("SOURCE_OBJECT_NAME", this.SOURCE_OBJECT_NAME);
    __sqoop$field_map.put("SOURCE_OBJECT_TYPE", this.SOURCE_OBJECT_TYPE);
    __sqoop$field_map.put("SAS_LIB_REF", this.SAS_LIB_REF);
    __sqoop$field_map.put("PK_COLUMN_NAMES", this.PK_COLUMN_NAMES);
    __sqoop$field_map.put("NK_COLUMN_NAMES", this.NK_COLUMN_NAMES);
    __sqoop$field_map.put("EXCLUDED_COLUMNS", this.EXCLUDED_COLUMNS);
    __sqoop$field_map.put("LOAD_PATTERN_NAME", this.LOAD_PATTERN_NAME);
    __sqoop$field_map.put("SENSITIVE_DATA_FLAG", this.SENSITIVE_DATA_FLAG);
    __sqoop$field_map.put("RETENTION_KEY", this.RETENTION_KEY);
    __sqoop$field_map.put("CUSTOM_SQL", this.CUSTOM_SQL);
    __sqoop$field_map.put("CHANGE_CAPTURE_TIMESTAMP_COLUMN", this.CHANGE_CAPTURE_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("HISTORY_LOADED_FROM_TDW", this.HISTORY_LOADED_FROM_TDW);
    __sqoop$field_map.put("HISTORY_TYPE", this.HISTORY_TYPE);
    __sqoop$field_map.put("EFFECTIVE_FROM_TIMESTAMP_COLUMN", this.EFFECTIVE_FROM_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("EFFECTIVE_TO_TIMESTAMP_COLUMN", this.EFFECTIVE_TO_TIMESTAMP_COLUMN);
    __sqoop$field_map.put("EFFECTIVE_TIMESTAMP_GRAIN", this.EFFECTIVE_TIMESTAMP_GRAIN);
    __sqoop$field_map.put("PURGE_GRAIN", this.PURGE_GRAIN);
    __sqoop$field_map.put("DUPLICATION_TIMESTAMP_GRAIN", this.DUPLICATION_TIMESTAMP_GRAIN);
    __sqoop$field_map.put("CREATED_DATE", this.CREATED_DATE);
    __sqoop$field_map.put("CREATED_BY", this.CREATED_BY);
    __sqoop$field_map.put("BATCH_NAME", this.BATCH_NAME);
    __sqoop$field_map.put("CAS_UPLOAD", this.CAS_UPLOAD);
    __sqoop$field_map.put("LAYER", this.LAYER);
    __sqoop$field_map.put("INGESTION_MODE", this.INGESTION_MODE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
