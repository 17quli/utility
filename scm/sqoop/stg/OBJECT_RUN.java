// ORM class for table 'OBJECT_RUN'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 07 20:24:12 GMT 2020
// For connector: org.apache.sqoop.manager.OracleManager
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

public class OBJECT_RUN extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("OBJECT_RUN_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_RUN_KEY = (java.math.BigDecimal)value;
      }
    });
    setters.put("TARGET_OBJECT_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TARGET_OBJECT_NAME = (String)value;
      }
    });
    setters.put("OBJECT_KEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_KEY = (java.math.BigDecimal)value;
      }
    });
    setters.put("START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("STATUS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STATUS = (String)value;
      }
    });
    setters.put("STATUS_MESSAGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STATUS_MESSAGE = (String)value;
      }
    });
    setters.put("RECORDS_READ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RECORDS_READ = (java.math.BigDecimal)value;
      }
    });
    setters.put("RECORDS_WRITTEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RECORDS_WRITTEN = (java.math.BigDecimal)value;
      }
    });
    setters.put("OBJECT_LOG_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_LOG_NAME = (String)value;
      }
    });
    setters.put("OBJECT_PRG_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OBJECT_PRG_NAME = (String)value;
      }
    });
    setters.put("INGESTION_MODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        INGESTION_MODE = (String)value;
      }
    });
    setters.put("PREV_HIGH_WATER_MARK_VALUE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PREV_HIGH_WATER_MARK_VALUE = (java.sql.Timestamp)value;
      }
    });
    setters.put("HIGH_WATER_MARK_VALUE_JNL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HIGH_WATER_MARK_VALUE_JNL = (java.sql.Timestamp)value;
      }
    });
    setters.put("HIGH_WATER_MARK_VALUE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HIGH_WATER_MARK_VALUE = (java.sql.Timestamp)value;
      }
    });
    setters.put("LOAD_PATTERN_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LOAD_PATTERN_NAME = (String)value;
      }
    });
    setters.put("TASK1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK1 = (String)value;
      }
    });
    setters.put("TASK1_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK1_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK1_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK1_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK2 = (String)value;
      }
    });
    setters.put("TASK2_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK2_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK2_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK2_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK3 = (String)value;
      }
    });
    setters.put("TASK3_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK3_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK3_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK3_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK4 = (String)value;
      }
    });
    setters.put("TASK4_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK4_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK4_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK4_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK5 = (String)value;
      }
    });
    setters.put("TASK5_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK5_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK5_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK5_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK6", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK6 = (String)value;
      }
    });
    setters.put("TASK6_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK6_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK6_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK6_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK7", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK7 = (String)value;
      }
    });
    setters.put("TASK7_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK7_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK7_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK7_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK8", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK8 = (String)value;
      }
    });
    setters.put("TASK8_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK8_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK8_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK8_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK9", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK9 = (String)value;
      }
    });
    setters.put("TASK9_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK9_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK9_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK9_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK10 = (String)value;
      }
    });
    setters.put("TASK10_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK10_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK10_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK10_END_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK11", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK11 = (String)value;
      }
    });
    setters.put("TASK11_START_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK11_START_TIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("TASK11_END_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TASK11_END_TIME = (java.sql.Timestamp)value;
      }
    });
  }
  public OBJECT_RUN() {
    init0();
  }
  private java.math.BigDecimal OBJECT_RUN_KEY;
  public java.math.BigDecimal get_OBJECT_RUN_KEY() {
    return OBJECT_RUN_KEY;
  }
  public void set_OBJECT_RUN_KEY(java.math.BigDecimal OBJECT_RUN_KEY) {
    this.OBJECT_RUN_KEY = OBJECT_RUN_KEY;
  }
  public OBJECT_RUN with_OBJECT_RUN_KEY(java.math.BigDecimal OBJECT_RUN_KEY) {
    this.OBJECT_RUN_KEY = OBJECT_RUN_KEY;
    return this;
  }
  private String TARGET_OBJECT_NAME;
  public String get_TARGET_OBJECT_NAME() {
    return TARGET_OBJECT_NAME;
  }
  public void set_TARGET_OBJECT_NAME(String TARGET_OBJECT_NAME) {
    this.TARGET_OBJECT_NAME = TARGET_OBJECT_NAME;
  }
  public OBJECT_RUN with_TARGET_OBJECT_NAME(String TARGET_OBJECT_NAME) {
    this.TARGET_OBJECT_NAME = TARGET_OBJECT_NAME;
    return this;
  }
  private java.math.BigDecimal OBJECT_KEY;
  public java.math.BigDecimal get_OBJECT_KEY() {
    return OBJECT_KEY;
  }
  public void set_OBJECT_KEY(java.math.BigDecimal OBJECT_KEY) {
    this.OBJECT_KEY = OBJECT_KEY;
  }
  public OBJECT_RUN with_OBJECT_KEY(java.math.BigDecimal OBJECT_KEY) {
    this.OBJECT_KEY = OBJECT_KEY;
    return this;
  }
  private java.sql.Timestamp START_TIME;
  public java.sql.Timestamp get_START_TIME() {
    return START_TIME;
  }
  public void set_START_TIME(java.sql.Timestamp START_TIME) {
    this.START_TIME = START_TIME;
  }
  public OBJECT_RUN with_START_TIME(java.sql.Timestamp START_TIME) {
    this.START_TIME = START_TIME;
    return this;
  }
  private java.sql.Timestamp END_TIME;
  public java.sql.Timestamp get_END_TIME() {
    return END_TIME;
  }
  public void set_END_TIME(java.sql.Timestamp END_TIME) {
    this.END_TIME = END_TIME;
  }
  public OBJECT_RUN with_END_TIME(java.sql.Timestamp END_TIME) {
    this.END_TIME = END_TIME;
    return this;
  }
  private String STATUS;
  public String get_STATUS() {
    return STATUS;
  }
  public void set_STATUS(String STATUS) {
    this.STATUS = STATUS;
  }
  public OBJECT_RUN with_STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }
  private String STATUS_MESSAGE;
  public String get_STATUS_MESSAGE() {
    return STATUS_MESSAGE;
  }
  public void set_STATUS_MESSAGE(String STATUS_MESSAGE) {
    this.STATUS_MESSAGE = STATUS_MESSAGE;
  }
  public OBJECT_RUN with_STATUS_MESSAGE(String STATUS_MESSAGE) {
    this.STATUS_MESSAGE = STATUS_MESSAGE;
    return this;
  }
  private java.math.BigDecimal RECORDS_READ;
  public java.math.BigDecimal get_RECORDS_READ() {
    return RECORDS_READ;
  }
  public void set_RECORDS_READ(java.math.BigDecimal RECORDS_READ) {
    this.RECORDS_READ = RECORDS_READ;
  }
  public OBJECT_RUN with_RECORDS_READ(java.math.BigDecimal RECORDS_READ) {
    this.RECORDS_READ = RECORDS_READ;
    return this;
  }
  private java.math.BigDecimal RECORDS_WRITTEN;
  public java.math.BigDecimal get_RECORDS_WRITTEN() {
    return RECORDS_WRITTEN;
  }
  public void set_RECORDS_WRITTEN(java.math.BigDecimal RECORDS_WRITTEN) {
    this.RECORDS_WRITTEN = RECORDS_WRITTEN;
  }
  public OBJECT_RUN with_RECORDS_WRITTEN(java.math.BigDecimal RECORDS_WRITTEN) {
    this.RECORDS_WRITTEN = RECORDS_WRITTEN;
    return this;
  }
  private String OBJECT_LOG_NAME;
  public String get_OBJECT_LOG_NAME() {
    return OBJECT_LOG_NAME;
  }
  public void set_OBJECT_LOG_NAME(String OBJECT_LOG_NAME) {
    this.OBJECT_LOG_NAME = OBJECT_LOG_NAME;
  }
  public OBJECT_RUN with_OBJECT_LOG_NAME(String OBJECT_LOG_NAME) {
    this.OBJECT_LOG_NAME = OBJECT_LOG_NAME;
    return this;
  }
  private String OBJECT_PRG_NAME;
  public String get_OBJECT_PRG_NAME() {
    return OBJECT_PRG_NAME;
  }
  public void set_OBJECT_PRG_NAME(String OBJECT_PRG_NAME) {
    this.OBJECT_PRG_NAME = OBJECT_PRG_NAME;
  }
  public OBJECT_RUN with_OBJECT_PRG_NAME(String OBJECT_PRG_NAME) {
    this.OBJECT_PRG_NAME = OBJECT_PRG_NAME;
    return this;
  }
  private String INGESTION_MODE;
  public String get_INGESTION_MODE() {
    return INGESTION_MODE;
  }
  public void set_INGESTION_MODE(String INGESTION_MODE) {
    this.INGESTION_MODE = INGESTION_MODE;
  }
  public OBJECT_RUN with_INGESTION_MODE(String INGESTION_MODE) {
    this.INGESTION_MODE = INGESTION_MODE;
    return this;
  }
  private java.sql.Timestamp PREV_HIGH_WATER_MARK_VALUE;
  public java.sql.Timestamp get_PREV_HIGH_WATER_MARK_VALUE() {
    return PREV_HIGH_WATER_MARK_VALUE;
  }
  public void set_PREV_HIGH_WATER_MARK_VALUE(java.sql.Timestamp PREV_HIGH_WATER_MARK_VALUE) {
    this.PREV_HIGH_WATER_MARK_VALUE = PREV_HIGH_WATER_MARK_VALUE;
  }
  public OBJECT_RUN with_PREV_HIGH_WATER_MARK_VALUE(java.sql.Timestamp PREV_HIGH_WATER_MARK_VALUE) {
    this.PREV_HIGH_WATER_MARK_VALUE = PREV_HIGH_WATER_MARK_VALUE;
    return this;
  }
  private java.sql.Timestamp HIGH_WATER_MARK_VALUE_JNL;
  public java.sql.Timestamp get_HIGH_WATER_MARK_VALUE_JNL() {
    return HIGH_WATER_MARK_VALUE_JNL;
  }
  public void set_HIGH_WATER_MARK_VALUE_JNL(java.sql.Timestamp HIGH_WATER_MARK_VALUE_JNL) {
    this.HIGH_WATER_MARK_VALUE_JNL = HIGH_WATER_MARK_VALUE_JNL;
  }
  public OBJECT_RUN with_HIGH_WATER_MARK_VALUE_JNL(java.sql.Timestamp HIGH_WATER_MARK_VALUE_JNL) {
    this.HIGH_WATER_MARK_VALUE_JNL = HIGH_WATER_MARK_VALUE_JNL;
    return this;
  }
  private java.sql.Timestamp HIGH_WATER_MARK_VALUE;
  public java.sql.Timestamp get_HIGH_WATER_MARK_VALUE() {
    return HIGH_WATER_MARK_VALUE;
  }
  public void set_HIGH_WATER_MARK_VALUE(java.sql.Timestamp HIGH_WATER_MARK_VALUE) {
    this.HIGH_WATER_MARK_VALUE = HIGH_WATER_MARK_VALUE;
  }
  public OBJECT_RUN with_HIGH_WATER_MARK_VALUE(java.sql.Timestamp HIGH_WATER_MARK_VALUE) {
    this.HIGH_WATER_MARK_VALUE = HIGH_WATER_MARK_VALUE;
    return this;
  }
  private String LOAD_PATTERN_NAME;
  public String get_LOAD_PATTERN_NAME() {
    return LOAD_PATTERN_NAME;
  }
  public void set_LOAD_PATTERN_NAME(String LOAD_PATTERN_NAME) {
    this.LOAD_PATTERN_NAME = LOAD_PATTERN_NAME;
  }
  public OBJECT_RUN with_LOAD_PATTERN_NAME(String LOAD_PATTERN_NAME) {
    this.LOAD_PATTERN_NAME = LOAD_PATTERN_NAME;
    return this;
  }
  private String TASK1;
  public String get_TASK1() {
    return TASK1;
  }
  public void set_TASK1(String TASK1) {
    this.TASK1 = TASK1;
  }
  public OBJECT_RUN with_TASK1(String TASK1) {
    this.TASK1 = TASK1;
    return this;
  }
  private java.sql.Timestamp TASK1_START_TIME;
  public java.sql.Timestamp get_TASK1_START_TIME() {
    return TASK1_START_TIME;
  }
  public void set_TASK1_START_TIME(java.sql.Timestamp TASK1_START_TIME) {
    this.TASK1_START_TIME = TASK1_START_TIME;
  }
  public OBJECT_RUN with_TASK1_START_TIME(java.sql.Timestamp TASK1_START_TIME) {
    this.TASK1_START_TIME = TASK1_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK1_END_TIME;
  public java.sql.Timestamp get_TASK1_END_TIME() {
    return TASK1_END_TIME;
  }
  public void set_TASK1_END_TIME(java.sql.Timestamp TASK1_END_TIME) {
    this.TASK1_END_TIME = TASK1_END_TIME;
  }
  public OBJECT_RUN with_TASK1_END_TIME(java.sql.Timestamp TASK1_END_TIME) {
    this.TASK1_END_TIME = TASK1_END_TIME;
    return this;
  }
  private String TASK2;
  public String get_TASK2() {
    return TASK2;
  }
  public void set_TASK2(String TASK2) {
    this.TASK2 = TASK2;
  }
  public OBJECT_RUN with_TASK2(String TASK2) {
    this.TASK2 = TASK2;
    return this;
  }
  private java.sql.Timestamp TASK2_START_TIME;
  public java.sql.Timestamp get_TASK2_START_TIME() {
    return TASK2_START_TIME;
  }
  public void set_TASK2_START_TIME(java.sql.Timestamp TASK2_START_TIME) {
    this.TASK2_START_TIME = TASK2_START_TIME;
  }
  public OBJECT_RUN with_TASK2_START_TIME(java.sql.Timestamp TASK2_START_TIME) {
    this.TASK2_START_TIME = TASK2_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK2_END_TIME;
  public java.sql.Timestamp get_TASK2_END_TIME() {
    return TASK2_END_TIME;
  }
  public void set_TASK2_END_TIME(java.sql.Timestamp TASK2_END_TIME) {
    this.TASK2_END_TIME = TASK2_END_TIME;
  }
  public OBJECT_RUN with_TASK2_END_TIME(java.sql.Timestamp TASK2_END_TIME) {
    this.TASK2_END_TIME = TASK2_END_TIME;
    return this;
  }
  private String TASK3;
  public String get_TASK3() {
    return TASK3;
  }
  public void set_TASK3(String TASK3) {
    this.TASK3 = TASK3;
  }
  public OBJECT_RUN with_TASK3(String TASK3) {
    this.TASK3 = TASK3;
    return this;
  }
  private java.sql.Timestamp TASK3_START_TIME;
  public java.sql.Timestamp get_TASK3_START_TIME() {
    return TASK3_START_TIME;
  }
  public void set_TASK3_START_TIME(java.sql.Timestamp TASK3_START_TIME) {
    this.TASK3_START_TIME = TASK3_START_TIME;
  }
  public OBJECT_RUN with_TASK3_START_TIME(java.sql.Timestamp TASK3_START_TIME) {
    this.TASK3_START_TIME = TASK3_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK3_END_TIME;
  public java.sql.Timestamp get_TASK3_END_TIME() {
    return TASK3_END_TIME;
  }
  public void set_TASK3_END_TIME(java.sql.Timestamp TASK3_END_TIME) {
    this.TASK3_END_TIME = TASK3_END_TIME;
  }
  public OBJECT_RUN with_TASK3_END_TIME(java.sql.Timestamp TASK3_END_TIME) {
    this.TASK3_END_TIME = TASK3_END_TIME;
    return this;
  }
  private String TASK4;
  public String get_TASK4() {
    return TASK4;
  }
  public void set_TASK4(String TASK4) {
    this.TASK4 = TASK4;
  }
  public OBJECT_RUN with_TASK4(String TASK4) {
    this.TASK4 = TASK4;
    return this;
  }
  private java.sql.Timestamp TASK4_START_TIME;
  public java.sql.Timestamp get_TASK4_START_TIME() {
    return TASK4_START_TIME;
  }
  public void set_TASK4_START_TIME(java.sql.Timestamp TASK4_START_TIME) {
    this.TASK4_START_TIME = TASK4_START_TIME;
  }
  public OBJECT_RUN with_TASK4_START_TIME(java.sql.Timestamp TASK4_START_TIME) {
    this.TASK4_START_TIME = TASK4_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK4_END_TIME;
  public java.sql.Timestamp get_TASK4_END_TIME() {
    return TASK4_END_TIME;
  }
  public void set_TASK4_END_TIME(java.sql.Timestamp TASK4_END_TIME) {
    this.TASK4_END_TIME = TASK4_END_TIME;
  }
  public OBJECT_RUN with_TASK4_END_TIME(java.sql.Timestamp TASK4_END_TIME) {
    this.TASK4_END_TIME = TASK4_END_TIME;
    return this;
  }
  private String TASK5;
  public String get_TASK5() {
    return TASK5;
  }
  public void set_TASK5(String TASK5) {
    this.TASK5 = TASK5;
  }
  public OBJECT_RUN with_TASK5(String TASK5) {
    this.TASK5 = TASK5;
    return this;
  }
  private java.sql.Timestamp TASK5_START_TIME;
  public java.sql.Timestamp get_TASK5_START_TIME() {
    return TASK5_START_TIME;
  }
  public void set_TASK5_START_TIME(java.sql.Timestamp TASK5_START_TIME) {
    this.TASK5_START_TIME = TASK5_START_TIME;
  }
  public OBJECT_RUN with_TASK5_START_TIME(java.sql.Timestamp TASK5_START_TIME) {
    this.TASK5_START_TIME = TASK5_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK5_END_TIME;
  public java.sql.Timestamp get_TASK5_END_TIME() {
    return TASK5_END_TIME;
  }
  public void set_TASK5_END_TIME(java.sql.Timestamp TASK5_END_TIME) {
    this.TASK5_END_TIME = TASK5_END_TIME;
  }
  public OBJECT_RUN with_TASK5_END_TIME(java.sql.Timestamp TASK5_END_TIME) {
    this.TASK5_END_TIME = TASK5_END_TIME;
    return this;
  }
  private String TASK6;
  public String get_TASK6() {
    return TASK6;
  }
  public void set_TASK6(String TASK6) {
    this.TASK6 = TASK6;
  }
  public OBJECT_RUN with_TASK6(String TASK6) {
    this.TASK6 = TASK6;
    return this;
  }
  private java.sql.Timestamp TASK6_START_TIME;
  public java.sql.Timestamp get_TASK6_START_TIME() {
    return TASK6_START_TIME;
  }
  public void set_TASK6_START_TIME(java.sql.Timestamp TASK6_START_TIME) {
    this.TASK6_START_TIME = TASK6_START_TIME;
  }
  public OBJECT_RUN with_TASK6_START_TIME(java.sql.Timestamp TASK6_START_TIME) {
    this.TASK6_START_TIME = TASK6_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK6_END_TIME;
  public java.sql.Timestamp get_TASK6_END_TIME() {
    return TASK6_END_TIME;
  }
  public void set_TASK6_END_TIME(java.sql.Timestamp TASK6_END_TIME) {
    this.TASK6_END_TIME = TASK6_END_TIME;
  }
  public OBJECT_RUN with_TASK6_END_TIME(java.sql.Timestamp TASK6_END_TIME) {
    this.TASK6_END_TIME = TASK6_END_TIME;
    return this;
  }
  private String TASK7;
  public String get_TASK7() {
    return TASK7;
  }
  public void set_TASK7(String TASK7) {
    this.TASK7 = TASK7;
  }
  public OBJECT_RUN with_TASK7(String TASK7) {
    this.TASK7 = TASK7;
    return this;
  }
  private java.sql.Timestamp TASK7_START_TIME;
  public java.sql.Timestamp get_TASK7_START_TIME() {
    return TASK7_START_TIME;
  }
  public void set_TASK7_START_TIME(java.sql.Timestamp TASK7_START_TIME) {
    this.TASK7_START_TIME = TASK7_START_TIME;
  }
  public OBJECT_RUN with_TASK7_START_TIME(java.sql.Timestamp TASK7_START_TIME) {
    this.TASK7_START_TIME = TASK7_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK7_END_TIME;
  public java.sql.Timestamp get_TASK7_END_TIME() {
    return TASK7_END_TIME;
  }
  public void set_TASK7_END_TIME(java.sql.Timestamp TASK7_END_TIME) {
    this.TASK7_END_TIME = TASK7_END_TIME;
  }
  public OBJECT_RUN with_TASK7_END_TIME(java.sql.Timestamp TASK7_END_TIME) {
    this.TASK7_END_TIME = TASK7_END_TIME;
    return this;
  }
  private String TASK8;
  public String get_TASK8() {
    return TASK8;
  }
  public void set_TASK8(String TASK8) {
    this.TASK8 = TASK8;
  }
  public OBJECT_RUN with_TASK8(String TASK8) {
    this.TASK8 = TASK8;
    return this;
  }
  private java.sql.Timestamp TASK8_START_TIME;
  public java.sql.Timestamp get_TASK8_START_TIME() {
    return TASK8_START_TIME;
  }
  public void set_TASK8_START_TIME(java.sql.Timestamp TASK8_START_TIME) {
    this.TASK8_START_TIME = TASK8_START_TIME;
  }
  public OBJECT_RUN with_TASK8_START_TIME(java.sql.Timestamp TASK8_START_TIME) {
    this.TASK8_START_TIME = TASK8_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK8_END_TIME;
  public java.sql.Timestamp get_TASK8_END_TIME() {
    return TASK8_END_TIME;
  }
  public void set_TASK8_END_TIME(java.sql.Timestamp TASK8_END_TIME) {
    this.TASK8_END_TIME = TASK8_END_TIME;
  }
  public OBJECT_RUN with_TASK8_END_TIME(java.sql.Timestamp TASK8_END_TIME) {
    this.TASK8_END_TIME = TASK8_END_TIME;
    return this;
  }
  private String TASK9;
  public String get_TASK9() {
    return TASK9;
  }
  public void set_TASK9(String TASK9) {
    this.TASK9 = TASK9;
  }
  public OBJECT_RUN with_TASK9(String TASK9) {
    this.TASK9 = TASK9;
    return this;
  }
  private java.sql.Timestamp TASK9_START_TIME;
  public java.sql.Timestamp get_TASK9_START_TIME() {
    return TASK9_START_TIME;
  }
  public void set_TASK9_START_TIME(java.sql.Timestamp TASK9_START_TIME) {
    this.TASK9_START_TIME = TASK9_START_TIME;
  }
  public OBJECT_RUN with_TASK9_START_TIME(java.sql.Timestamp TASK9_START_TIME) {
    this.TASK9_START_TIME = TASK9_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK9_END_TIME;
  public java.sql.Timestamp get_TASK9_END_TIME() {
    return TASK9_END_TIME;
  }
  public void set_TASK9_END_TIME(java.sql.Timestamp TASK9_END_TIME) {
    this.TASK9_END_TIME = TASK9_END_TIME;
  }
  public OBJECT_RUN with_TASK9_END_TIME(java.sql.Timestamp TASK9_END_TIME) {
    this.TASK9_END_TIME = TASK9_END_TIME;
    return this;
  }
  private String TASK10;
  public String get_TASK10() {
    return TASK10;
  }
  public void set_TASK10(String TASK10) {
    this.TASK10 = TASK10;
  }
  public OBJECT_RUN with_TASK10(String TASK10) {
    this.TASK10 = TASK10;
    return this;
  }
  private java.sql.Timestamp TASK10_START_TIME;
  public java.sql.Timestamp get_TASK10_START_TIME() {
    return TASK10_START_TIME;
  }
  public void set_TASK10_START_TIME(java.sql.Timestamp TASK10_START_TIME) {
    this.TASK10_START_TIME = TASK10_START_TIME;
  }
  public OBJECT_RUN with_TASK10_START_TIME(java.sql.Timestamp TASK10_START_TIME) {
    this.TASK10_START_TIME = TASK10_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK10_END_TIME;
  public java.sql.Timestamp get_TASK10_END_TIME() {
    return TASK10_END_TIME;
  }
  public void set_TASK10_END_TIME(java.sql.Timestamp TASK10_END_TIME) {
    this.TASK10_END_TIME = TASK10_END_TIME;
  }
  public OBJECT_RUN with_TASK10_END_TIME(java.sql.Timestamp TASK10_END_TIME) {
    this.TASK10_END_TIME = TASK10_END_TIME;
    return this;
  }
  private String TASK11;
  public String get_TASK11() {
    return TASK11;
  }
  public void set_TASK11(String TASK11) {
    this.TASK11 = TASK11;
  }
  public OBJECT_RUN with_TASK11(String TASK11) {
    this.TASK11 = TASK11;
    return this;
  }
  private java.sql.Timestamp TASK11_START_TIME;
  public java.sql.Timestamp get_TASK11_START_TIME() {
    return TASK11_START_TIME;
  }
  public void set_TASK11_START_TIME(java.sql.Timestamp TASK11_START_TIME) {
    this.TASK11_START_TIME = TASK11_START_TIME;
  }
  public OBJECT_RUN with_TASK11_START_TIME(java.sql.Timestamp TASK11_START_TIME) {
    this.TASK11_START_TIME = TASK11_START_TIME;
    return this;
  }
  private java.sql.Timestamp TASK11_END_TIME;
  public java.sql.Timestamp get_TASK11_END_TIME() {
    return TASK11_END_TIME;
  }
  public void set_TASK11_END_TIME(java.sql.Timestamp TASK11_END_TIME) {
    this.TASK11_END_TIME = TASK11_END_TIME;
  }
  public OBJECT_RUN with_TASK11_END_TIME(java.sql.Timestamp TASK11_END_TIME) {
    this.TASK11_END_TIME = TASK11_END_TIME;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof OBJECT_RUN)) {
      return false;
    }
    OBJECT_RUN that = (OBJECT_RUN) o;
    boolean equal = true;
    equal = equal && (this.OBJECT_RUN_KEY == null ? that.OBJECT_RUN_KEY == null : this.OBJECT_RUN_KEY.equals(that.OBJECT_RUN_KEY));
    equal = equal && (this.TARGET_OBJECT_NAME == null ? that.TARGET_OBJECT_NAME == null : this.TARGET_OBJECT_NAME.equals(that.TARGET_OBJECT_NAME));
    equal = equal && (this.OBJECT_KEY == null ? that.OBJECT_KEY == null : this.OBJECT_KEY.equals(that.OBJECT_KEY));
    equal = equal && (this.START_TIME == null ? that.START_TIME == null : this.START_TIME.equals(that.START_TIME));
    equal = equal && (this.END_TIME == null ? that.END_TIME == null : this.END_TIME.equals(that.END_TIME));
    equal = equal && (this.STATUS == null ? that.STATUS == null : this.STATUS.equals(that.STATUS));
    equal = equal && (this.STATUS_MESSAGE == null ? that.STATUS_MESSAGE == null : this.STATUS_MESSAGE.equals(that.STATUS_MESSAGE));
    equal = equal && (this.RECORDS_READ == null ? that.RECORDS_READ == null : this.RECORDS_READ.equals(that.RECORDS_READ));
    equal = equal && (this.RECORDS_WRITTEN == null ? that.RECORDS_WRITTEN == null : this.RECORDS_WRITTEN.equals(that.RECORDS_WRITTEN));
    equal = equal && (this.OBJECT_LOG_NAME == null ? that.OBJECT_LOG_NAME == null : this.OBJECT_LOG_NAME.equals(that.OBJECT_LOG_NAME));
    equal = equal && (this.OBJECT_PRG_NAME == null ? that.OBJECT_PRG_NAME == null : this.OBJECT_PRG_NAME.equals(that.OBJECT_PRG_NAME));
    equal = equal && (this.INGESTION_MODE == null ? that.INGESTION_MODE == null : this.INGESTION_MODE.equals(that.INGESTION_MODE));
    equal = equal && (this.PREV_HIGH_WATER_MARK_VALUE == null ? that.PREV_HIGH_WATER_MARK_VALUE == null : this.PREV_HIGH_WATER_MARK_VALUE.equals(that.PREV_HIGH_WATER_MARK_VALUE));
    equal = equal && (this.HIGH_WATER_MARK_VALUE_JNL == null ? that.HIGH_WATER_MARK_VALUE_JNL == null : this.HIGH_WATER_MARK_VALUE_JNL.equals(that.HIGH_WATER_MARK_VALUE_JNL));
    equal = equal && (this.HIGH_WATER_MARK_VALUE == null ? that.HIGH_WATER_MARK_VALUE == null : this.HIGH_WATER_MARK_VALUE.equals(that.HIGH_WATER_MARK_VALUE));
    equal = equal && (this.LOAD_PATTERN_NAME == null ? that.LOAD_PATTERN_NAME == null : this.LOAD_PATTERN_NAME.equals(that.LOAD_PATTERN_NAME));
    equal = equal && (this.TASK1 == null ? that.TASK1 == null : this.TASK1.equals(that.TASK1));
    equal = equal && (this.TASK1_START_TIME == null ? that.TASK1_START_TIME == null : this.TASK1_START_TIME.equals(that.TASK1_START_TIME));
    equal = equal && (this.TASK1_END_TIME == null ? that.TASK1_END_TIME == null : this.TASK1_END_TIME.equals(that.TASK1_END_TIME));
    equal = equal && (this.TASK2 == null ? that.TASK2 == null : this.TASK2.equals(that.TASK2));
    equal = equal && (this.TASK2_START_TIME == null ? that.TASK2_START_TIME == null : this.TASK2_START_TIME.equals(that.TASK2_START_TIME));
    equal = equal && (this.TASK2_END_TIME == null ? that.TASK2_END_TIME == null : this.TASK2_END_TIME.equals(that.TASK2_END_TIME));
    equal = equal && (this.TASK3 == null ? that.TASK3 == null : this.TASK3.equals(that.TASK3));
    equal = equal && (this.TASK3_START_TIME == null ? that.TASK3_START_TIME == null : this.TASK3_START_TIME.equals(that.TASK3_START_TIME));
    equal = equal && (this.TASK3_END_TIME == null ? that.TASK3_END_TIME == null : this.TASK3_END_TIME.equals(that.TASK3_END_TIME));
    equal = equal && (this.TASK4 == null ? that.TASK4 == null : this.TASK4.equals(that.TASK4));
    equal = equal && (this.TASK4_START_TIME == null ? that.TASK4_START_TIME == null : this.TASK4_START_TIME.equals(that.TASK4_START_TIME));
    equal = equal && (this.TASK4_END_TIME == null ? that.TASK4_END_TIME == null : this.TASK4_END_TIME.equals(that.TASK4_END_TIME));
    equal = equal && (this.TASK5 == null ? that.TASK5 == null : this.TASK5.equals(that.TASK5));
    equal = equal && (this.TASK5_START_TIME == null ? that.TASK5_START_TIME == null : this.TASK5_START_TIME.equals(that.TASK5_START_TIME));
    equal = equal && (this.TASK5_END_TIME == null ? that.TASK5_END_TIME == null : this.TASK5_END_TIME.equals(that.TASK5_END_TIME));
    equal = equal && (this.TASK6 == null ? that.TASK6 == null : this.TASK6.equals(that.TASK6));
    equal = equal && (this.TASK6_START_TIME == null ? that.TASK6_START_TIME == null : this.TASK6_START_TIME.equals(that.TASK6_START_TIME));
    equal = equal && (this.TASK6_END_TIME == null ? that.TASK6_END_TIME == null : this.TASK6_END_TIME.equals(that.TASK6_END_TIME));
    equal = equal && (this.TASK7 == null ? that.TASK7 == null : this.TASK7.equals(that.TASK7));
    equal = equal && (this.TASK7_START_TIME == null ? that.TASK7_START_TIME == null : this.TASK7_START_TIME.equals(that.TASK7_START_TIME));
    equal = equal && (this.TASK7_END_TIME == null ? that.TASK7_END_TIME == null : this.TASK7_END_TIME.equals(that.TASK7_END_TIME));
    equal = equal && (this.TASK8 == null ? that.TASK8 == null : this.TASK8.equals(that.TASK8));
    equal = equal && (this.TASK8_START_TIME == null ? that.TASK8_START_TIME == null : this.TASK8_START_TIME.equals(that.TASK8_START_TIME));
    equal = equal && (this.TASK8_END_TIME == null ? that.TASK8_END_TIME == null : this.TASK8_END_TIME.equals(that.TASK8_END_TIME));
    equal = equal && (this.TASK9 == null ? that.TASK9 == null : this.TASK9.equals(that.TASK9));
    equal = equal && (this.TASK9_START_TIME == null ? that.TASK9_START_TIME == null : this.TASK9_START_TIME.equals(that.TASK9_START_TIME));
    equal = equal && (this.TASK9_END_TIME == null ? that.TASK9_END_TIME == null : this.TASK9_END_TIME.equals(that.TASK9_END_TIME));
    equal = equal && (this.TASK10 == null ? that.TASK10 == null : this.TASK10.equals(that.TASK10));
    equal = equal && (this.TASK10_START_TIME == null ? that.TASK10_START_TIME == null : this.TASK10_START_TIME.equals(that.TASK10_START_TIME));
    equal = equal && (this.TASK10_END_TIME == null ? that.TASK10_END_TIME == null : this.TASK10_END_TIME.equals(that.TASK10_END_TIME));
    equal = equal && (this.TASK11 == null ? that.TASK11 == null : this.TASK11.equals(that.TASK11));
    equal = equal && (this.TASK11_START_TIME == null ? that.TASK11_START_TIME == null : this.TASK11_START_TIME.equals(that.TASK11_START_TIME));
    equal = equal && (this.TASK11_END_TIME == null ? that.TASK11_END_TIME == null : this.TASK11_END_TIME.equals(that.TASK11_END_TIME));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof OBJECT_RUN)) {
      return false;
    }
    OBJECT_RUN that = (OBJECT_RUN) o;
    boolean equal = true;
    equal = equal && (this.OBJECT_RUN_KEY == null ? that.OBJECT_RUN_KEY == null : this.OBJECT_RUN_KEY.equals(that.OBJECT_RUN_KEY));
    equal = equal && (this.TARGET_OBJECT_NAME == null ? that.TARGET_OBJECT_NAME == null : this.TARGET_OBJECT_NAME.equals(that.TARGET_OBJECT_NAME));
    equal = equal && (this.OBJECT_KEY == null ? that.OBJECT_KEY == null : this.OBJECT_KEY.equals(that.OBJECT_KEY));
    equal = equal && (this.START_TIME == null ? that.START_TIME == null : this.START_TIME.equals(that.START_TIME));
    equal = equal && (this.END_TIME == null ? that.END_TIME == null : this.END_TIME.equals(that.END_TIME));
    equal = equal && (this.STATUS == null ? that.STATUS == null : this.STATUS.equals(that.STATUS));
    equal = equal && (this.STATUS_MESSAGE == null ? that.STATUS_MESSAGE == null : this.STATUS_MESSAGE.equals(that.STATUS_MESSAGE));
    equal = equal && (this.RECORDS_READ == null ? that.RECORDS_READ == null : this.RECORDS_READ.equals(that.RECORDS_READ));
    equal = equal && (this.RECORDS_WRITTEN == null ? that.RECORDS_WRITTEN == null : this.RECORDS_WRITTEN.equals(that.RECORDS_WRITTEN));
    equal = equal && (this.OBJECT_LOG_NAME == null ? that.OBJECT_LOG_NAME == null : this.OBJECT_LOG_NAME.equals(that.OBJECT_LOG_NAME));
    equal = equal && (this.OBJECT_PRG_NAME == null ? that.OBJECT_PRG_NAME == null : this.OBJECT_PRG_NAME.equals(that.OBJECT_PRG_NAME));
    equal = equal && (this.INGESTION_MODE == null ? that.INGESTION_MODE == null : this.INGESTION_MODE.equals(that.INGESTION_MODE));
    equal = equal && (this.PREV_HIGH_WATER_MARK_VALUE == null ? that.PREV_HIGH_WATER_MARK_VALUE == null : this.PREV_HIGH_WATER_MARK_VALUE.equals(that.PREV_HIGH_WATER_MARK_VALUE));
    equal = equal && (this.HIGH_WATER_MARK_VALUE_JNL == null ? that.HIGH_WATER_MARK_VALUE_JNL == null : this.HIGH_WATER_MARK_VALUE_JNL.equals(that.HIGH_WATER_MARK_VALUE_JNL));
    equal = equal && (this.HIGH_WATER_MARK_VALUE == null ? that.HIGH_WATER_MARK_VALUE == null : this.HIGH_WATER_MARK_VALUE.equals(that.HIGH_WATER_MARK_VALUE));
    equal = equal && (this.LOAD_PATTERN_NAME == null ? that.LOAD_PATTERN_NAME == null : this.LOAD_PATTERN_NAME.equals(that.LOAD_PATTERN_NAME));
    equal = equal && (this.TASK1 == null ? that.TASK1 == null : this.TASK1.equals(that.TASK1));
    equal = equal && (this.TASK1_START_TIME == null ? that.TASK1_START_TIME == null : this.TASK1_START_TIME.equals(that.TASK1_START_TIME));
    equal = equal && (this.TASK1_END_TIME == null ? that.TASK1_END_TIME == null : this.TASK1_END_TIME.equals(that.TASK1_END_TIME));
    equal = equal && (this.TASK2 == null ? that.TASK2 == null : this.TASK2.equals(that.TASK2));
    equal = equal && (this.TASK2_START_TIME == null ? that.TASK2_START_TIME == null : this.TASK2_START_TIME.equals(that.TASK2_START_TIME));
    equal = equal && (this.TASK2_END_TIME == null ? that.TASK2_END_TIME == null : this.TASK2_END_TIME.equals(that.TASK2_END_TIME));
    equal = equal && (this.TASK3 == null ? that.TASK3 == null : this.TASK3.equals(that.TASK3));
    equal = equal && (this.TASK3_START_TIME == null ? that.TASK3_START_TIME == null : this.TASK3_START_TIME.equals(that.TASK3_START_TIME));
    equal = equal && (this.TASK3_END_TIME == null ? that.TASK3_END_TIME == null : this.TASK3_END_TIME.equals(that.TASK3_END_TIME));
    equal = equal && (this.TASK4 == null ? that.TASK4 == null : this.TASK4.equals(that.TASK4));
    equal = equal && (this.TASK4_START_TIME == null ? that.TASK4_START_TIME == null : this.TASK4_START_TIME.equals(that.TASK4_START_TIME));
    equal = equal && (this.TASK4_END_TIME == null ? that.TASK4_END_TIME == null : this.TASK4_END_TIME.equals(that.TASK4_END_TIME));
    equal = equal && (this.TASK5 == null ? that.TASK5 == null : this.TASK5.equals(that.TASK5));
    equal = equal && (this.TASK5_START_TIME == null ? that.TASK5_START_TIME == null : this.TASK5_START_TIME.equals(that.TASK5_START_TIME));
    equal = equal && (this.TASK5_END_TIME == null ? that.TASK5_END_TIME == null : this.TASK5_END_TIME.equals(that.TASK5_END_TIME));
    equal = equal && (this.TASK6 == null ? that.TASK6 == null : this.TASK6.equals(that.TASK6));
    equal = equal && (this.TASK6_START_TIME == null ? that.TASK6_START_TIME == null : this.TASK6_START_TIME.equals(that.TASK6_START_TIME));
    equal = equal && (this.TASK6_END_TIME == null ? that.TASK6_END_TIME == null : this.TASK6_END_TIME.equals(that.TASK6_END_TIME));
    equal = equal && (this.TASK7 == null ? that.TASK7 == null : this.TASK7.equals(that.TASK7));
    equal = equal && (this.TASK7_START_TIME == null ? that.TASK7_START_TIME == null : this.TASK7_START_TIME.equals(that.TASK7_START_TIME));
    equal = equal && (this.TASK7_END_TIME == null ? that.TASK7_END_TIME == null : this.TASK7_END_TIME.equals(that.TASK7_END_TIME));
    equal = equal && (this.TASK8 == null ? that.TASK8 == null : this.TASK8.equals(that.TASK8));
    equal = equal && (this.TASK8_START_TIME == null ? that.TASK8_START_TIME == null : this.TASK8_START_TIME.equals(that.TASK8_START_TIME));
    equal = equal && (this.TASK8_END_TIME == null ? that.TASK8_END_TIME == null : this.TASK8_END_TIME.equals(that.TASK8_END_TIME));
    equal = equal && (this.TASK9 == null ? that.TASK9 == null : this.TASK9.equals(that.TASK9));
    equal = equal && (this.TASK9_START_TIME == null ? that.TASK9_START_TIME == null : this.TASK9_START_TIME.equals(that.TASK9_START_TIME));
    equal = equal && (this.TASK9_END_TIME == null ? that.TASK9_END_TIME == null : this.TASK9_END_TIME.equals(that.TASK9_END_TIME));
    equal = equal && (this.TASK10 == null ? that.TASK10 == null : this.TASK10.equals(that.TASK10));
    equal = equal && (this.TASK10_START_TIME == null ? that.TASK10_START_TIME == null : this.TASK10_START_TIME.equals(that.TASK10_START_TIME));
    equal = equal && (this.TASK10_END_TIME == null ? that.TASK10_END_TIME == null : this.TASK10_END_TIME.equals(that.TASK10_END_TIME));
    equal = equal && (this.TASK11 == null ? that.TASK11 == null : this.TASK11.equals(that.TASK11));
    equal = equal && (this.TASK11_START_TIME == null ? that.TASK11_START_TIME == null : this.TASK11_START_TIME.equals(that.TASK11_START_TIME));
    equal = equal && (this.TASK11_END_TIME == null ? that.TASK11_END_TIME == null : this.TASK11_END_TIME.equals(that.TASK11_END_TIME));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.OBJECT_RUN_KEY = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.TARGET_OBJECT_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.OBJECT_KEY = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.START_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.END_TIME = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.STATUS = JdbcWritableBridge.readString(6, __dbResults);
    this.STATUS_MESSAGE = JdbcWritableBridge.readString(7, __dbResults);
    this.RECORDS_READ = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.RECORDS_WRITTEN = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.OBJECT_LOG_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.OBJECT_PRG_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.INGESTION_MODE = JdbcWritableBridge.readString(12, __dbResults);
    this.PREV_HIGH_WATER_MARK_VALUE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.HIGH_WATER_MARK_VALUE_JNL = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.HIGH_WATER_MARK_VALUE = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.LOAD_PATTERN_NAME = JdbcWritableBridge.readString(16, __dbResults);
    this.TASK1 = JdbcWritableBridge.readString(17, __dbResults);
    this.TASK1_START_TIME = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.TASK1_END_TIME = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.TASK2 = JdbcWritableBridge.readString(20, __dbResults);
    this.TASK2_START_TIME = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.TASK2_END_TIME = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.TASK3 = JdbcWritableBridge.readString(23, __dbResults);
    this.TASK3_START_TIME = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.TASK3_END_TIME = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.TASK4 = JdbcWritableBridge.readString(26, __dbResults);
    this.TASK4_START_TIME = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.TASK4_END_TIME = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.TASK5 = JdbcWritableBridge.readString(29, __dbResults);
    this.TASK5_START_TIME = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.TASK5_END_TIME = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.TASK6 = JdbcWritableBridge.readString(32, __dbResults);
    this.TASK6_START_TIME = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.TASK6_END_TIME = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.TASK7 = JdbcWritableBridge.readString(35, __dbResults);
    this.TASK7_START_TIME = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.TASK7_END_TIME = JdbcWritableBridge.readTimestamp(37, __dbResults);
    this.TASK8 = JdbcWritableBridge.readString(38, __dbResults);
    this.TASK8_START_TIME = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.TASK8_END_TIME = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.TASK9 = JdbcWritableBridge.readString(41, __dbResults);
    this.TASK9_START_TIME = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.TASK9_END_TIME = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.TASK10 = JdbcWritableBridge.readString(44, __dbResults);
    this.TASK10_START_TIME = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.TASK10_END_TIME = JdbcWritableBridge.readTimestamp(46, __dbResults);
    this.TASK11 = JdbcWritableBridge.readString(47, __dbResults);
    this.TASK11_START_TIME = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.TASK11_END_TIME = JdbcWritableBridge.readTimestamp(49, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.OBJECT_RUN_KEY = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.TARGET_OBJECT_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.OBJECT_KEY = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.START_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.END_TIME = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.STATUS = JdbcWritableBridge.readString(6, __dbResults);
    this.STATUS_MESSAGE = JdbcWritableBridge.readString(7, __dbResults);
    this.RECORDS_READ = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.RECORDS_WRITTEN = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.OBJECT_LOG_NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.OBJECT_PRG_NAME = JdbcWritableBridge.readString(11, __dbResults);
    this.INGESTION_MODE = JdbcWritableBridge.readString(12, __dbResults);
    this.PREV_HIGH_WATER_MARK_VALUE = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.HIGH_WATER_MARK_VALUE_JNL = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.HIGH_WATER_MARK_VALUE = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.LOAD_PATTERN_NAME = JdbcWritableBridge.readString(16, __dbResults);
    this.TASK1 = JdbcWritableBridge.readString(17, __dbResults);
    this.TASK1_START_TIME = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.TASK1_END_TIME = JdbcWritableBridge.readTimestamp(19, __dbResults);
    this.TASK2 = JdbcWritableBridge.readString(20, __dbResults);
    this.TASK2_START_TIME = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.TASK2_END_TIME = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.TASK3 = JdbcWritableBridge.readString(23, __dbResults);
    this.TASK3_START_TIME = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.TASK3_END_TIME = JdbcWritableBridge.readTimestamp(25, __dbResults);
    this.TASK4 = JdbcWritableBridge.readString(26, __dbResults);
    this.TASK4_START_TIME = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.TASK4_END_TIME = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.TASK5 = JdbcWritableBridge.readString(29, __dbResults);
    this.TASK5_START_TIME = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.TASK5_END_TIME = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.TASK6 = JdbcWritableBridge.readString(32, __dbResults);
    this.TASK6_START_TIME = JdbcWritableBridge.readTimestamp(33, __dbResults);
    this.TASK6_END_TIME = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.TASK7 = JdbcWritableBridge.readString(35, __dbResults);
    this.TASK7_START_TIME = JdbcWritableBridge.readTimestamp(36, __dbResults);
    this.TASK7_END_TIME = JdbcWritableBridge.readTimestamp(37, __dbResults);
    this.TASK8 = JdbcWritableBridge.readString(38, __dbResults);
    this.TASK8_START_TIME = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.TASK8_END_TIME = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.TASK9 = JdbcWritableBridge.readString(41, __dbResults);
    this.TASK9_START_TIME = JdbcWritableBridge.readTimestamp(42, __dbResults);
    this.TASK9_END_TIME = JdbcWritableBridge.readTimestamp(43, __dbResults);
    this.TASK10 = JdbcWritableBridge.readString(44, __dbResults);
    this.TASK10_START_TIME = JdbcWritableBridge.readTimestamp(45, __dbResults);
    this.TASK10_END_TIME = JdbcWritableBridge.readTimestamp(46, __dbResults);
    this.TASK11 = JdbcWritableBridge.readString(47, __dbResults);
    this.TASK11_START_TIME = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.TASK11_END_TIME = JdbcWritableBridge.readTimestamp(49, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(OBJECT_RUN_KEY, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_OBJECT_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OBJECT_KEY, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(START_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(END_TIME, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(STATUS, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS_MESSAGE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RECORDS_READ, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RECORDS_WRITTEN, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_LOG_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_PRG_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INGESTION_MODE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PREV_HIGH_WATER_MARK_VALUE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HIGH_WATER_MARK_VALUE_JNL, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HIGH_WATER_MARK_VALUE, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_PATTERN_NAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK1, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK1_START_TIME, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK1_END_TIME, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK2_START_TIME, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK2_END_TIME, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK3, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK3_START_TIME, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK3_END_TIME, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK4, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK4_START_TIME, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK4_END_TIME, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK5, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK5_START_TIME, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK5_END_TIME, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK6, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK6_START_TIME, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK6_END_TIME, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK7, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK7_START_TIME, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK7_END_TIME, 37 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK8, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK8_START_TIME, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK8_END_TIME, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK9, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK9_START_TIME, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK9_END_TIME, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK10, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK10_START_TIME, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK10_END_TIME, 46 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK11, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK11_START_TIME, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK11_END_TIME, 49 + __off, 93, __dbStmt);
    return 49;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(OBJECT_RUN_KEY, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(TARGET_OBJECT_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OBJECT_KEY, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(START_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(END_TIME, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(STATUS, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS_MESSAGE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RECORDS_READ, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RECORDS_WRITTEN, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_LOG_NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OBJECT_PRG_NAME, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INGESTION_MODE, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PREV_HIGH_WATER_MARK_VALUE, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HIGH_WATER_MARK_VALUE_JNL, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(HIGH_WATER_MARK_VALUE, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(LOAD_PATTERN_NAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK1, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK1_START_TIME, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK1_END_TIME, 19 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK2, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK2_START_TIME, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK2_END_TIME, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK3, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK3_START_TIME, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK3_END_TIME, 25 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK4, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK4_START_TIME, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK4_END_TIME, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK5, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK5_START_TIME, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK5_END_TIME, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK6, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK6_START_TIME, 33 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK6_END_TIME, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK7, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK7_START_TIME, 36 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK7_END_TIME, 37 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK8, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK8_START_TIME, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK8_END_TIME, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK9, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK9_START_TIME, 42 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK9_END_TIME, 43 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK10, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK10_START_TIME, 45 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK10_END_TIME, 46 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(TASK11, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK11_START_TIME, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TASK11_END_TIME, 49 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.OBJECT_RUN_KEY = null;
    } else {
    this.OBJECT_RUN_KEY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TARGET_OBJECT_NAME = null;
    } else {
    this.TARGET_OBJECT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OBJECT_KEY = null;
    } else {
    this.OBJECT_KEY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.START_TIME = null;
    } else {
    this.START_TIME = new Timestamp(__dataIn.readLong());
    this.START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.END_TIME = null;
    } else {
    this.END_TIME = new Timestamp(__dataIn.readLong());
    this.END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS = null;
    } else {
    this.STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS_MESSAGE = null;
    } else {
    this.STATUS_MESSAGE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RECORDS_READ = null;
    } else {
    this.RECORDS_READ = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RECORDS_WRITTEN = null;
    } else {
    this.RECORDS_WRITTEN = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OBJECT_LOG_NAME = null;
    } else {
    this.OBJECT_LOG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OBJECT_PRG_NAME = null;
    } else {
    this.OBJECT_PRG_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INGESTION_MODE = null;
    } else {
    this.INGESTION_MODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PREV_HIGH_WATER_MARK_VALUE = null;
    } else {
    this.PREV_HIGH_WATER_MARK_VALUE = new Timestamp(__dataIn.readLong());
    this.PREV_HIGH_WATER_MARK_VALUE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.HIGH_WATER_MARK_VALUE_JNL = null;
    } else {
    this.HIGH_WATER_MARK_VALUE_JNL = new Timestamp(__dataIn.readLong());
    this.HIGH_WATER_MARK_VALUE_JNL.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.HIGH_WATER_MARK_VALUE = null;
    } else {
    this.HIGH_WATER_MARK_VALUE = new Timestamp(__dataIn.readLong());
    this.HIGH_WATER_MARK_VALUE.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.LOAD_PATTERN_NAME = null;
    } else {
    this.LOAD_PATTERN_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK1 = null;
    } else {
    this.TASK1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK1_START_TIME = null;
    } else {
    this.TASK1_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK1_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK1_END_TIME = null;
    } else {
    this.TASK1_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK1_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK2 = null;
    } else {
    this.TASK2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK2_START_TIME = null;
    } else {
    this.TASK2_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK2_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK2_END_TIME = null;
    } else {
    this.TASK2_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK2_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK3 = null;
    } else {
    this.TASK3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK3_START_TIME = null;
    } else {
    this.TASK3_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK3_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK3_END_TIME = null;
    } else {
    this.TASK3_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK3_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK4 = null;
    } else {
    this.TASK4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK4_START_TIME = null;
    } else {
    this.TASK4_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK4_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK4_END_TIME = null;
    } else {
    this.TASK4_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK4_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK5 = null;
    } else {
    this.TASK5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK5_START_TIME = null;
    } else {
    this.TASK5_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK5_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK5_END_TIME = null;
    } else {
    this.TASK5_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK5_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK6 = null;
    } else {
    this.TASK6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK6_START_TIME = null;
    } else {
    this.TASK6_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK6_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK6_END_TIME = null;
    } else {
    this.TASK6_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK6_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK7 = null;
    } else {
    this.TASK7 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK7_START_TIME = null;
    } else {
    this.TASK7_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK7_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK7_END_TIME = null;
    } else {
    this.TASK7_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK7_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK8 = null;
    } else {
    this.TASK8 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK8_START_TIME = null;
    } else {
    this.TASK8_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK8_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK8_END_TIME = null;
    } else {
    this.TASK8_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK8_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK9 = null;
    } else {
    this.TASK9 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK9_START_TIME = null;
    } else {
    this.TASK9_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK9_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK9_END_TIME = null;
    } else {
    this.TASK9_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK9_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK10 = null;
    } else {
    this.TASK10 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK10_START_TIME = null;
    } else {
    this.TASK10_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK10_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK10_END_TIME = null;
    } else {
    this.TASK10_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK10_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK11 = null;
    } else {
    this.TASK11 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK11_START_TIME = null;
    } else {
    this.TASK11_START_TIME = new Timestamp(__dataIn.readLong());
    this.TASK11_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.TASK11_END_TIME = null;
    } else {
    this.TASK11_END_TIME = new Timestamp(__dataIn.readLong());
    this.TASK11_END_TIME.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.OBJECT_RUN_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_RUN_KEY, __dataOut);
    }
    if (null == this.TARGET_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_OBJECT_NAME);
    }
    if (null == this.OBJECT_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_KEY, __dataOut);
    }
    if (null == this.START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.START_TIME.getTime());
    __dataOut.writeInt(this.START_TIME.getNanos());
    }
    if (null == this.END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.END_TIME.getTime());
    __dataOut.writeInt(this.END_TIME.getNanos());
    }
    if (null == this.STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS);
    }
    if (null == this.STATUS_MESSAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS_MESSAGE);
    }
    if (null == this.RECORDS_READ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RECORDS_READ, __dataOut);
    }
    if (null == this.RECORDS_WRITTEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RECORDS_WRITTEN, __dataOut);
    }
    if (null == this.OBJECT_LOG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_LOG_NAME);
    }
    if (null == this.OBJECT_PRG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_PRG_NAME);
    }
    if (null == this.INGESTION_MODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INGESTION_MODE);
    }
    if (null == this.PREV_HIGH_WATER_MARK_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PREV_HIGH_WATER_MARK_VALUE.getTime());
    __dataOut.writeInt(this.PREV_HIGH_WATER_MARK_VALUE.getNanos());
    }
    if (null == this.HIGH_WATER_MARK_VALUE_JNL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HIGH_WATER_MARK_VALUE_JNL.getTime());
    __dataOut.writeInt(this.HIGH_WATER_MARK_VALUE_JNL.getNanos());
    }
    if (null == this.HIGH_WATER_MARK_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HIGH_WATER_MARK_VALUE.getTime());
    __dataOut.writeInt(this.HIGH_WATER_MARK_VALUE.getNanos());
    }
    if (null == this.LOAD_PATTERN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_PATTERN_NAME);
    }
    if (null == this.TASK1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK1);
    }
    if (null == this.TASK1_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK1_START_TIME.getTime());
    __dataOut.writeInt(this.TASK1_START_TIME.getNanos());
    }
    if (null == this.TASK1_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK1_END_TIME.getTime());
    __dataOut.writeInt(this.TASK1_END_TIME.getNanos());
    }
    if (null == this.TASK2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK2);
    }
    if (null == this.TASK2_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK2_START_TIME.getTime());
    __dataOut.writeInt(this.TASK2_START_TIME.getNanos());
    }
    if (null == this.TASK2_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK2_END_TIME.getTime());
    __dataOut.writeInt(this.TASK2_END_TIME.getNanos());
    }
    if (null == this.TASK3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK3);
    }
    if (null == this.TASK3_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK3_START_TIME.getTime());
    __dataOut.writeInt(this.TASK3_START_TIME.getNanos());
    }
    if (null == this.TASK3_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK3_END_TIME.getTime());
    __dataOut.writeInt(this.TASK3_END_TIME.getNanos());
    }
    if (null == this.TASK4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK4);
    }
    if (null == this.TASK4_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK4_START_TIME.getTime());
    __dataOut.writeInt(this.TASK4_START_TIME.getNanos());
    }
    if (null == this.TASK4_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK4_END_TIME.getTime());
    __dataOut.writeInt(this.TASK4_END_TIME.getNanos());
    }
    if (null == this.TASK5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK5);
    }
    if (null == this.TASK5_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK5_START_TIME.getTime());
    __dataOut.writeInt(this.TASK5_START_TIME.getNanos());
    }
    if (null == this.TASK5_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK5_END_TIME.getTime());
    __dataOut.writeInt(this.TASK5_END_TIME.getNanos());
    }
    if (null == this.TASK6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK6);
    }
    if (null == this.TASK6_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK6_START_TIME.getTime());
    __dataOut.writeInt(this.TASK6_START_TIME.getNanos());
    }
    if (null == this.TASK6_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK6_END_TIME.getTime());
    __dataOut.writeInt(this.TASK6_END_TIME.getNanos());
    }
    if (null == this.TASK7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK7);
    }
    if (null == this.TASK7_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK7_START_TIME.getTime());
    __dataOut.writeInt(this.TASK7_START_TIME.getNanos());
    }
    if (null == this.TASK7_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK7_END_TIME.getTime());
    __dataOut.writeInt(this.TASK7_END_TIME.getNanos());
    }
    if (null == this.TASK8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK8);
    }
    if (null == this.TASK8_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK8_START_TIME.getTime());
    __dataOut.writeInt(this.TASK8_START_TIME.getNanos());
    }
    if (null == this.TASK8_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK8_END_TIME.getTime());
    __dataOut.writeInt(this.TASK8_END_TIME.getNanos());
    }
    if (null == this.TASK9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK9);
    }
    if (null == this.TASK9_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK9_START_TIME.getTime());
    __dataOut.writeInt(this.TASK9_START_TIME.getNanos());
    }
    if (null == this.TASK9_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK9_END_TIME.getTime());
    __dataOut.writeInt(this.TASK9_END_TIME.getNanos());
    }
    if (null == this.TASK10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK10);
    }
    if (null == this.TASK10_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK10_START_TIME.getTime());
    __dataOut.writeInt(this.TASK10_START_TIME.getNanos());
    }
    if (null == this.TASK10_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK10_END_TIME.getTime());
    __dataOut.writeInt(this.TASK10_END_TIME.getNanos());
    }
    if (null == this.TASK11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK11);
    }
    if (null == this.TASK11_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK11_START_TIME.getTime());
    __dataOut.writeInt(this.TASK11_START_TIME.getNanos());
    }
    if (null == this.TASK11_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK11_END_TIME.getTime());
    __dataOut.writeInt(this.TASK11_END_TIME.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.OBJECT_RUN_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_RUN_KEY, __dataOut);
    }
    if (null == this.TARGET_OBJECT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TARGET_OBJECT_NAME);
    }
    if (null == this.OBJECT_KEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OBJECT_KEY, __dataOut);
    }
    if (null == this.START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.START_TIME.getTime());
    __dataOut.writeInt(this.START_TIME.getNanos());
    }
    if (null == this.END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.END_TIME.getTime());
    __dataOut.writeInt(this.END_TIME.getNanos());
    }
    if (null == this.STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS);
    }
    if (null == this.STATUS_MESSAGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS_MESSAGE);
    }
    if (null == this.RECORDS_READ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RECORDS_READ, __dataOut);
    }
    if (null == this.RECORDS_WRITTEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RECORDS_WRITTEN, __dataOut);
    }
    if (null == this.OBJECT_LOG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_LOG_NAME);
    }
    if (null == this.OBJECT_PRG_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OBJECT_PRG_NAME);
    }
    if (null == this.INGESTION_MODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INGESTION_MODE);
    }
    if (null == this.PREV_HIGH_WATER_MARK_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PREV_HIGH_WATER_MARK_VALUE.getTime());
    __dataOut.writeInt(this.PREV_HIGH_WATER_MARK_VALUE.getNanos());
    }
    if (null == this.HIGH_WATER_MARK_VALUE_JNL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HIGH_WATER_MARK_VALUE_JNL.getTime());
    __dataOut.writeInt(this.HIGH_WATER_MARK_VALUE_JNL.getNanos());
    }
    if (null == this.HIGH_WATER_MARK_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.HIGH_WATER_MARK_VALUE.getTime());
    __dataOut.writeInt(this.HIGH_WATER_MARK_VALUE.getNanos());
    }
    if (null == this.LOAD_PATTERN_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOAD_PATTERN_NAME);
    }
    if (null == this.TASK1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK1);
    }
    if (null == this.TASK1_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK1_START_TIME.getTime());
    __dataOut.writeInt(this.TASK1_START_TIME.getNanos());
    }
    if (null == this.TASK1_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK1_END_TIME.getTime());
    __dataOut.writeInt(this.TASK1_END_TIME.getNanos());
    }
    if (null == this.TASK2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK2);
    }
    if (null == this.TASK2_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK2_START_TIME.getTime());
    __dataOut.writeInt(this.TASK2_START_TIME.getNanos());
    }
    if (null == this.TASK2_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK2_END_TIME.getTime());
    __dataOut.writeInt(this.TASK2_END_TIME.getNanos());
    }
    if (null == this.TASK3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK3);
    }
    if (null == this.TASK3_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK3_START_TIME.getTime());
    __dataOut.writeInt(this.TASK3_START_TIME.getNanos());
    }
    if (null == this.TASK3_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK3_END_TIME.getTime());
    __dataOut.writeInt(this.TASK3_END_TIME.getNanos());
    }
    if (null == this.TASK4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK4);
    }
    if (null == this.TASK4_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK4_START_TIME.getTime());
    __dataOut.writeInt(this.TASK4_START_TIME.getNanos());
    }
    if (null == this.TASK4_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK4_END_TIME.getTime());
    __dataOut.writeInt(this.TASK4_END_TIME.getNanos());
    }
    if (null == this.TASK5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK5);
    }
    if (null == this.TASK5_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK5_START_TIME.getTime());
    __dataOut.writeInt(this.TASK5_START_TIME.getNanos());
    }
    if (null == this.TASK5_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK5_END_TIME.getTime());
    __dataOut.writeInt(this.TASK5_END_TIME.getNanos());
    }
    if (null == this.TASK6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK6);
    }
    if (null == this.TASK6_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK6_START_TIME.getTime());
    __dataOut.writeInt(this.TASK6_START_TIME.getNanos());
    }
    if (null == this.TASK6_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK6_END_TIME.getTime());
    __dataOut.writeInt(this.TASK6_END_TIME.getNanos());
    }
    if (null == this.TASK7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK7);
    }
    if (null == this.TASK7_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK7_START_TIME.getTime());
    __dataOut.writeInt(this.TASK7_START_TIME.getNanos());
    }
    if (null == this.TASK7_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK7_END_TIME.getTime());
    __dataOut.writeInt(this.TASK7_END_TIME.getNanos());
    }
    if (null == this.TASK8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK8);
    }
    if (null == this.TASK8_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK8_START_TIME.getTime());
    __dataOut.writeInt(this.TASK8_START_TIME.getNanos());
    }
    if (null == this.TASK8_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK8_END_TIME.getTime());
    __dataOut.writeInt(this.TASK8_END_TIME.getNanos());
    }
    if (null == this.TASK9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK9);
    }
    if (null == this.TASK9_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK9_START_TIME.getTime());
    __dataOut.writeInt(this.TASK9_START_TIME.getNanos());
    }
    if (null == this.TASK9_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK9_END_TIME.getTime());
    __dataOut.writeInt(this.TASK9_END_TIME.getNanos());
    }
    if (null == this.TASK10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK10);
    }
    if (null == this.TASK10_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK10_START_TIME.getTime());
    __dataOut.writeInt(this.TASK10_START_TIME.getNanos());
    }
    if (null == this.TASK10_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK10_END_TIME.getTime());
    __dataOut.writeInt(this.TASK10_END_TIME.getNanos());
    }
    if (null == this.TASK11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK11);
    }
    if (null == this.TASK11_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK11_START_TIME.getTime());
    __dataOut.writeInt(this.TASK11_START_TIME.getNanos());
    }
    if (null == this.TASK11_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TASK11_END_TIME.getTime());
    __dataOut.writeInt(this.TASK11_END_TIME.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_RUN_KEY==null?"null":OBJECT_RUN_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_OBJECT_NAME==null?"null":TARGET_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_KEY==null?"null":OBJECT_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME==null?"null":"" + START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME==null?"null":"" + END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS==null?"null":STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_MESSAGE==null?"null":STATUS_MESSAGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDS_READ==null?"null":RECORDS_READ.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDS_WRITTEN==null?"null":RECORDS_WRITTEN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_LOG_NAME==null?"null":OBJECT_LOG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_PRG_NAME==null?"null":OBJECT_PRG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INGESTION_MODE==null?"null":INGESTION_MODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREV_HIGH_WATER_MARK_VALUE==null?"null":"" + PREV_HIGH_WATER_MARK_VALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_WATER_MARK_VALUE_JNL==null?"null":"" + HIGH_WATER_MARK_VALUE_JNL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_WATER_MARK_VALUE==null?"null":"" + HIGH_WATER_MARK_VALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_PATTERN_NAME==null?"null":LOAD_PATTERN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1==null?"null":TASK1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1_START_TIME==null?"null":"" + TASK1_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1_END_TIME==null?"null":"" + TASK1_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2==null?"null":TASK2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2_START_TIME==null?"null":"" + TASK2_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2_END_TIME==null?"null":"" + TASK2_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3==null?"null":TASK3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3_START_TIME==null?"null":"" + TASK3_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3_END_TIME==null?"null":"" + TASK3_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4==null?"null":TASK4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4_START_TIME==null?"null":"" + TASK4_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4_END_TIME==null?"null":"" + TASK4_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5==null?"null":TASK5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5_START_TIME==null?"null":"" + TASK5_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5_END_TIME==null?"null":"" + TASK5_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6==null?"null":TASK6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6_START_TIME==null?"null":"" + TASK6_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6_END_TIME==null?"null":"" + TASK6_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7==null?"null":TASK7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7_START_TIME==null?"null":"" + TASK7_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7_END_TIME==null?"null":"" + TASK7_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8==null?"null":TASK8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8_START_TIME==null?"null":"" + TASK8_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8_END_TIME==null?"null":"" + TASK8_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9==null?"null":TASK9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9_START_TIME==null?"null":"" + TASK9_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9_END_TIME==null?"null":"" + TASK9_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10==null?"null":TASK10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10_START_TIME==null?"null":"" + TASK10_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10_END_TIME==null?"null":"" + TASK10_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11==null?"null":TASK11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11_START_TIME==null?"null":"" + TASK11_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11_END_TIME==null?"null":"" + TASK11_END_TIME, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_RUN_KEY==null?"null":OBJECT_RUN_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TARGET_OBJECT_NAME==null?"null":TARGET_OBJECT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_KEY==null?"null":OBJECT_KEY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME==null?"null":"" + START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME==null?"null":"" + END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS==null?"null":STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS_MESSAGE==null?"null":STATUS_MESSAGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDS_READ==null?"null":RECORDS_READ.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDS_WRITTEN==null?"null":RECORDS_WRITTEN.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_LOG_NAME==null?"null":OBJECT_LOG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OBJECT_PRG_NAME==null?"null":OBJECT_PRG_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INGESTION_MODE==null?"null":INGESTION_MODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PREV_HIGH_WATER_MARK_VALUE==null?"null":"" + PREV_HIGH_WATER_MARK_VALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_WATER_MARK_VALUE_JNL==null?"null":"" + HIGH_WATER_MARK_VALUE_JNL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_WATER_MARK_VALUE==null?"null":"" + HIGH_WATER_MARK_VALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOAD_PATTERN_NAME==null?"null":LOAD_PATTERN_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1==null?"null":TASK1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1_START_TIME==null?"null":"" + TASK1_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK1_END_TIME==null?"null":"" + TASK1_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2==null?"null":TASK2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2_START_TIME==null?"null":"" + TASK2_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK2_END_TIME==null?"null":"" + TASK2_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3==null?"null":TASK3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3_START_TIME==null?"null":"" + TASK3_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK3_END_TIME==null?"null":"" + TASK3_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4==null?"null":TASK4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4_START_TIME==null?"null":"" + TASK4_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK4_END_TIME==null?"null":"" + TASK4_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5==null?"null":TASK5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5_START_TIME==null?"null":"" + TASK5_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK5_END_TIME==null?"null":"" + TASK5_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6==null?"null":TASK6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6_START_TIME==null?"null":"" + TASK6_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK6_END_TIME==null?"null":"" + TASK6_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7==null?"null":TASK7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7_START_TIME==null?"null":"" + TASK7_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK7_END_TIME==null?"null":"" + TASK7_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8==null?"null":TASK8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8_START_TIME==null?"null":"" + TASK8_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK8_END_TIME==null?"null":"" + TASK8_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9==null?"null":TASK9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9_START_TIME==null?"null":"" + TASK9_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK9_END_TIME==null?"null":"" + TASK9_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10==null?"null":TASK10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10_START_TIME==null?"null":"" + TASK10_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK10_END_TIME==null?"null":"" + TASK10_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11==null?"null":TASK11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11_START_TIME==null?"null":"" + TASK11_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK11_END_TIME==null?"null":"" + TASK11_END_TIME, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_RUN_KEY = null; } else {
      this.OBJECT_RUN_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_OBJECT_NAME = null; } else {
      this.TARGET_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_KEY = null; } else {
      this.OBJECT_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME = null; } else {
      this.START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME = null; } else {
      this.END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS = null; } else {
      this.STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS_MESSAGE = null; } else {
      this.STATUS_MESSAGE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDS_READ = null; } else {
      this.RECORDS_READ = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDS_WRITTEN = null; } else {
      this.RECORDS_WRITTEN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_LOG_NAME = null; } else {
      this.OBJECT_LOG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_PRG_NAME = null; } else {
      this.OBJECT_PRG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INGESTION_MODE = null; } else {
      this.INGESTION_MODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PREV_HIGH_WATER_MARK_VALUE = null; } else {
      this.PREV_HIGH_WATER_MARK_VALUE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_WATER_MARK_VALUE_JNL = null; } else {
      this.HIGH_WATER_MARK_VALUE_JNL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_WATER_MARK_VALUE = null; } else {
      this.HIGH_WATER_MARK_VALUE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_PATTERN_NAME = null; } else {
      this.LOAD_PATTERN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK1 = null; } else {
      this.TASK1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK1_START_TIME = null; } else {
      this.TASK1_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK1_END_TIME = null; } else {
      this.TASK1_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK2 = null; } else {
      this.TASK2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK2_START_TIME = null; } else {
      this.TASK2_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK2_END_TIME = null; } else {
      this.TASK2_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK3 = null; } else {
      this.TASK3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK3_START_TIME = null; } else {
      this.TASK3_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK3_END_TIME = null; } else {
      this.TASK3_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK4 = null; } else {
      this.TASK4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK4_START_TIME = null; } else {
      this.TASK4_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK4_END_TIME = null; } else {
      this.TASK4_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK5 = null; } else {
      this.TASK5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK5_START_TIME = null; } else {
      this.TASK5_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK5_END_TIME = null; } else {
      this.TASK5_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK6 = null; } else {
      this.TASK6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK6_START_TIME = null; } else {
      this.TASK6_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK6_END_TIME = null; } else {
      this.TASK6_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK7 = null; } else {
      this.TASK7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK7_START_TIME = null; } else {
      this.TASK7_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK7_END_TIME = null; } else {
      this.TASK7_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK8 = null; } else {
      this.TASK8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK8_START_TIME = null; } else {
      this.TASK8_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK8_END_TIME = null; } else {
      this.TASK8_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK9 = null; } else {
      this.TASK9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK9_START_TIME = null; } else {
      this.TASK9_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK9_END_TIME = null; } else {
      this.TASK9_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK10 = null; } else {
      this.TASK10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK10_START_TIME = null; } else {
      this.TASK10_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK10_END_TIME = null; } else {
      this.TASK10_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK11 = null; } else {
      this.TASK11 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK11_START_TIME = null; } else {
      this.TASK11_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK11_END_TIME = null; } else {
      this.TASK11_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_RUN_KEY = null; } else {
      this.OBJECT_RUN_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TARGET_OBJECT_NAME = null; } else {
      this.TARGET_OBJECT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OBJECT_KEY = null; } else {
      this.OBJECT_KEY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME = null; } else {
      this.START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME = null; } else {
      this.END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS = null; } else {
      this.STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS_MESSAGE = null; } else {
      this.STATUS_MESSAGE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDS_READ = null; } else {
      this.RECORDS_READ = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDS_WRITTEN = null; } else {
      this.RECORDS_WRITTEN = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_LOG_NAME = null; } else {
      this.OBJECT_LOG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OBJECT_PRG_NAME = null; } else {
      this.OBJECT_PRG_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INGESTION_MODE = null; } else {
      this.INGESTION_MODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PREV_HIGH_WATER_MARK_VALUE = null; } else {
      this.PREV_HIGH_WATER_MARK_VALUE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_WATER_MARK_VALUE_JNL = null; } else {
      this.HIGH_WATER_MARK_VALUE_JNL = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_WATER_MARK_VALUE = null; } else {
      this.HIGH_WATER_MARK_VALUE = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOAD_PATTERN_NAME = null; } else {
      this.LOAD_PATTERN_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK1 = null; } else {
      this.TASK1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK1_START_TIME = null; } else {
      this.TASK1_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK1_END_TIME = null; } else {
      this.TASK1_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK2 = null; } else {
      this.TASK2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK2_START_TIME = null; } else {
      this.TASK2_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK2_END_TIME = null; } else {
      this.TASK2_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK3 = null; } else {
      this.TASK3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK3_START_TIME = null; } else {
      this.TASK3_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK3_END_TIME = null; } else {
      this.TASK3_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK4 = null; } else {
      this.TASK4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK4_START_TIME = null; } else {
      this.TASK4_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK4_END_TIME = null; } else {
      this.TASK4_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK5 = null; } else {
      this.TASK5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK5_START_TIME = null; } else {
      this.TASK5_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK5_END_TIME = null; } else {
      this.TASK5_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK6 = null; } else {
      this.TASK6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK6_START_TIME = null; } else {
      this.TASK6_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK6_END_TIME = null; } else {
      this.TASK6_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK7 = null; } else {
      this.TASK7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK7_START_TIME = null; } else {
      this.TASK7_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK7_END_TIME = null; } else {
      this.TASK7_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK8 = null; } else {
      this.TASK8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK8_START_TIME = null; } else {
      this.TASK8_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK8_END_TIME = null; } else {
      this.TASK8_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK9 = null; } else {
      this.TASK9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK9_START_TIME = null; } else {
      this.TASK9_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK9_END_TIME = null; } else {
      this.TASK9_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK10 = null; } else {
      this.TASK10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK10_START_TIME = null; } else {
      this.TASK10_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK10_END_TIME = null; } else {
      this.TASK10_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK11 = null; } else {
      this.TASK11 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK11_START_TIME = null; } else {
      this.TASK11_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TASK11_END_TIME = null; } else {
      this.TASK11_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    OBJECT_RUN o = (OBJECT_RUN) super.clone();
    o.START_TIME = (o.START_TIME != null) ? (java.sql.Timestamp) o.START_TIME.clone() : null;
    o.END_TIME = (o.END_TIME != null) ? (java.sql.Timestamp) o.END_TIME.clone() : null;
    o.PREV_HIGH_WATER_MARK_VALUE = (o.PREV_HIGH_WATER_MARK_VALUE != null) ? (java.sql.Timestamp) o.PREV_HIGH_WATER_MARK_VALUE.clone() : null;
    o.HIGH_WATER_MARK_VALUE_JNL = (o.HIGH_WATER_MARK_VALUE_JNL != null) ? (java.sql.Timestamp) o.HIGH_WATER_MARK_VALUE_JNL.clone() : null;
    o.HIGH_WATER_MARK_VALUE = (o.HIGH_WATER_MARK_VALUE != null) ? (java.sql.Timestamp) o.HIGH_WATER_MARK_VALUE.clone() : null;
    o.TASK1_START_TIME = (o.TASK1_START_TIME != null) ? (java.sql.Timestamp) o.TASK1_START_TIME.clone() : null;
    o.TASK1_END_TIME = (o.TASK1_END_TIME != null) ? (java.sql.Timestamp) o.TASK1_END_TIME.clone() : null;
    o.TASK2_START_TIME = (o.TASK2_START_TIME != null) ? (java.sql.Timestamp) o.TASK2_START_TIME.clone() : null;
    o.TASK2_END_TIME = (o.TASK2_END_TIME != null) ? (java.sql.Timestamp) o.TASK2_END_TIME.clone() : null;
    o.TASK3_START_TIME = (o.TASK3_START_TIME != null) ? (java.sql.Timestamp) o.TASK3_START_TIME.clone() : null;
    o.TASK3_END_TIME = (o.TASK3_END_TIME != null) ? (java.sql.Timestamp) o.TASK3_END_TIME.clone() : null;
    o.TASK4_START_TIME = (o.TASK4_START_TIME != null) ? (java.sql.Timestamp) o.TASK4_START_TIME.clone() : null;
    o.TASK4_END_TIME = (o.TASK4_END_TIME != null) ? (java.sql.Timestamp) o.TASK4_END_TIME.clone() : null;
    o.TASK5_START_TIME = (o.TASK5_START_TIME != null) ? (java.sql.Timestamp) o.TASK5_START_TIME.clone() : null;
    o.TASK5_END_TIME = (o.TASK5_END_TIME != null) ? (java.sql.Timestamp) o.TASK5_END_TIME.clone() : null;
    o.TASK6_START_TIME = (o.TASK6_START_TIME != null) ? (java.sql.Timestamp) o.TASK6_START_TIME.clone() : null;
    o.TASK6_END_TIME = (o.TASK6_END_TIME != null) ? (java.sql.Timestamp) o.TASK6_END_TIME.clone() : null;
    o.TASK7_START_TIME = (o.TASK7_START_TIME != null) ? (java.sql.Timestamp) o.TASK7_START_TIME.clone() : null;
    o.TASK7_END_TIME = (o.TASK7_END_TIME != null) ? (java.sql.Timestamp) o.TASK7_END_TIME.clone() : null;
    o.TASK8_START_TIME = (o.TASK8_START_TIME != null) ? (java.sql.Timestamp) o.TASK8_START_TIME.clone() : null;
    o.TASK8_END_TIME = (o.TASK8_END_TIME != null) ? (java.sql.Timestamp) o.TASK8_END_TIME.clone() : null;
    o.TASK9_START_TIME = (o.TASK9_START_TIME != null) ? (java.sql.Timestamp) o.TASK9_START_TIME.clone() : null;
    o.TASK9_END_TIME = (o.TASK9_END_TIME != null) ? (java.sql.Timestamp) o.TASK9_END_TIME.clone() : null;
    o.TASK10_START_TIME = (o.TASK10_START_TIME != null) ? (java.sql.Timestamp) o.TASK10_START_TIME.clone() : null;
    o.TASK10_END_TIME = (o.TASK10_END_TIME != null) ? (java.sql.Timestamp) o.TASK10_END_TIME.clone() : null;
    o.TASK11_START_TIME = (o.TASK11_START_TIME != null) ? (java.sql.Timestamp) o.TASK11_START_TIME.clone() : null;
    o.TASK11_END_TIME = (o.TASK11_END_TIME != null) ? (java.sql.Timestamp) o.TASK11_END_TIME.clone() : null;
    return o;
  }

  public void clone0(OBJECT_RUN o) throws CloneNotSupportedException {
    o.START_TIME = (o.START_TIME != null) ? (java.sql.Timestamp) o.START_TIME.clone() : null;
    o.END_TIME = (o.END_TIME != null) ? (java.sql.Timestamp) o.END_TIME.clone() : null;
    o.PREV_HIGH_WATER_MARK_VALUE = (o.PREV_HIGH_WATER_MARK_VALUE != null) ? (java.sql.Timestamp) o.PREV_HIGH_WATER_MARK_VALUE.clone() : null;
    o.HIGH_WATER_MARK_VALUE_JNL = (o.HIGH_WATER_MARK_VALUE_JNL != null) ? (java.sql.Timestamp) o.HIGH_WATER_MARK_VALUE_JNL.clone() : null;
    o.HIGH_WATER_MARK_VALUE = (o.HIGH_WATER_MARK_VALUE != null) ? (java.sql.Timestamp) o.HIGH_WATER_MARK_VALUE.clone() : null;
    o.TASK1_START_TIME = (o.TASK1_START_TIME != null) ? (java.sql.Timestamp) o.TASK1_START_TIME.clone() : null;
    o.TASK1_END_TIME = (o.TASK1_END_TIME != null) ? (java.sql.Timestamp) o.TASK1_END_TIME.clone() : null;
    o.TASK2_START_TIME = (o.TASK2_START_TIME != null) ? (java.sql.Timestamp) o.TASK2_START_TIME.clone() : null;
    o.TASK2_END_TIME = (o.TASK2_END_TIME != null) ? (java.sql.Timestamp) o.TASK2_END_TIME.clone() : null;
    o.TASK3_START_TIME = (o.TASK3_START_TIME != null) ? (java.sql.Timestamp) o.TASK3_START_TIME.clone() : null;
    o.TASK3_END_TIME = (o.TASK3_END_TIME != null) ? (java.sql.Timestamp) o.TASK3_END_TIME.clone() : null;
    o.TASK4_START_TIME = (o.TASK4_START_TIME != null) ? (java.sql.Timestamp) o.TASK4_START_TIME.clone() : null;
    o.TASK4_END_TIME = (o.TASK4_END_TIME != null) ? (java.sql.Timestamp) o.TASK4_END_TIME.clone() : null;
    o.TASK5_START_TIME = (o.TASK5_START_TIME != null) ? (java.sql.Timestamp) o.TASK5_START_TIME.clone() : null;
    o.TASK5_END_TIME = (o.TASK5_END_TIME != null) ? (java.sql.Timestamp) o.TASK5_END_TIME.clone() : null;
    o.TASK6_START_TIME = (o.TASK6_START_TIME != null) ? (java.sql.Timestamp) o.TASK6_START_TIME.clone() : null;
    o.TASK6_END_TIME = (o.TASK6_END_TIME != null) ? (java.sql.Timestamp) o.TASK6_END_TIME.clone() : null;
    o.TASK7_START_TIME = (o.TASK7_START_TIME != null) ? (java.sql.Timestamp) o.TASK7_START_TIME.clone() : null;
    o.TASK7_END_TIME = (o.TASK7_END_TIME != null) ? (java.sql.Timestamp) o.TASK7_END_TIME.clone() : null;
    o.TASK8_START_TIME = (o.TASK8_START_TIME != null) ? (java.sql.Timestamp) o.TASK8_START_TIME.clone() : null;
    o.TASK8_END_TIME = (o.TASK8_END_TIME != null) ? (java.sql.Timestamp) o.TASK8_END_TIME.clone() : null;
    o.TASK9_START_TIME = (o.TASK9_START_TIME != null) ? (java.sql.Timestamp) o.TASK9_START_TIME.clone() : null;
    o.TASK9_END_TIME = (o.TASK9_END_TIME != null) ? (java.sql.Timestamp) o.TASK9_END_TIME.clone() : null;
    o.TASK10_START_TIME = (o.TASK10_START_TIME != null) ? (java.sql.Timestamp) o.TASK10_START_TIME.clone() : null;
    o.TASK10_END_TIME = (o.TASK10_END_TIME != null) ? (java.sql.Timestamp) o.TASK10_END_TIME.clone() : null;
    o.TASK11_START_TIME = (o.TASK11_START_TIME != null) ? (java.sql.Timestamp) o.TASK11_START_TIME.clone() : null;
    o.TASK11_END_TIME = (o.TASK11_END_TIME != null) ? (java.sql.Timestamp) o.TASK11_END_TIME.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("OBJECT_RUN_KEY", this.OBJECT_RUN_KEY);
    __sqoop$field_map.put("TARGET_OBJECT_NAME", this.TARGET_OBJECT_NAME);
    __sqoop$field_map.put("OBJECT_KEY", this.OBJECT_KEY);
    __sqoop$field_map.put("START_TIME", this.START_TIME);
    __sqoop$field_map.put("END_TIME", this.END_TIME);
    __sqoop$field_map.put("STATUS", this.STATUS);
    __sqoop$field_map.put("STATUS_MESSAGE", this.STATUS_MESSAGE);
    __sqoop$field_map.put("RECORDS_READ", this.RECORDS_READ);
    __sqoop$field_map.put("RECORDS_WRITTEN", this.RECORDS_WRITTEN);
    __sqoop$field_map.put("OBJECT_LOG_NAME", this.OBJECT_LOG_NAME);
    __sqoop$field_map.put("OBJECT_PRG_NAME", this.OBJECT_PRG_NAME);
    __sqoop$field_map.put("INGESTION_MODE", this.INGESTION_MODE);
    __sqoop$field_map.put("PREV_HIGH_WATER_MARK_VALUE", this.PREV_HIGH_WATER_MARK_VALUE);
    __sqoop$field_map.put("HIGH_WATER_MARK_VALUE_JNL", this.HIGH_WATER_MARK_VALUE_JNL);
    __sqoop$field_map.put("HIGH_WATER_MARK_VALUE", this.HIGH_WATER_MARK_VALUE);
    __sqoop$field_map.put("LOAD_PATTERN_NAME", this.LOAD_PATTERN_NAME);
    __sqoop$field_map.put("TASK1", this.TASK1);
    __sqoop$field_map.put("TASK1_START_TIME", this.TASK1_START_TIME);
    __sqoop$field_map.put("TASK1_END_TIME", this.TASK1_END_TIME);
    __sqoop$field_map.put("TASK2", this.TASK2);
    __sqoop$field_map.put("TASK2_START_TIME", this.TASK2_START_TIME);
    __sqoop$field_map.put("TASK2_END_TIME", this.TASK2_END_TIME);
    __sqoop$field_map.put("TASK3", this.TASK3);
    __sqoop$field_map.put("TASK3_START_TIME", this.TASK3_START_TIME);
    __sqoop$field_map.put("TASK3_END_TIME", this.TASK3_END_TIME);
    __sqoop$field_map.put("TASK4", this.TASK4);
    __sqoop$field_map.put("TASK4_START_TIME", this.TASK4_START_TIME);
    __sqoop$field_map.put("TASK4_END_TIME", this.TASK4_END_TIME);
    __sqoop$field_map.put("TASK5", this.TASK5);
    __sqoop$field_map.put("TASK5_START_TIME", this.TASK5_START_TIME);
    __sqoop$field_map.put("TASK5_END_TIME", this.TASK5_END_TIME);
    __sqoop$field_map.put("TASK6", this.TASK6);
    __sqoop$field_map.put("TASK6_START_TIME", this.TASK6_START_TIME);
    __sqoop$field_map.put("TASK6_END_TIME", this.TASK6_END_TIME);
    __sqoop$field_map.put("TASK7", this.TASK7);
    __sqoop$field_map.put("TASK7_START_TIME", this.TASK7_START_TIME);
    __sqoop$field_map.put("TASK7_END_TIME", this.TASK7_END_TIME);
    __sqoop$field_map.put("TASK8", this.TASK8);
    __sqoop$field_map.put("TASK8_START_TIME", this.TASK8_START_TIME);
    __sqoop$field_map.put("TASK8_END_TIME", this.TASK8_END_TIME);
    __sqoop$field_map.put("TASK9", this.TASK9);
    __sqoop$field_map.put("TASK9_START_TIME", this.TASK9_START_TIME);
    __sqoop$field_map.put("TASK9_END_TIME", this.TASK9_END_TIME);
    __sqoop$field_map.put("TASK10", this.TASK10);
    __sqoop$field_map.put("TASK10_START_TIME", this.TASK10_START_TIME);
    __sqoop$field_map.put("TASK10_END_TIME", this.TASK10_END_TIME);
    __sqoop$field_map.put("TASK11", this.TASK11);
    __sqoop$field_map.put("TASK11_START_TIME", this.TASK11_START_TIME);
    __sqoop$field_map.put("TASK11_END_TIME", this.TASK11_END_TIME);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("OBJECT_RUN_KEY", this.OBJECT_RUN_KEY);
    __sqoop$field_map.put("TARGET_OBJECT_NAME", this.TARGET_OBJECT_NAME);
    __sqoop$field_map.put("OBJECT_KEY", this.OBJECT_KEY);
    __sqoop$field_map.put("START_TIME", this.START_TIME);
    __sqoop$field_map.put("END_TIME", this.END_TIME);
    __sqoop$field_map.put("STATUS", this.STATUS);
    __sqoop$field_map.put("STATUS_MESSAGE", this.STATUS_MESSAGE);
    __sqoop$field_map.put("RECORDS_READ", this.RECORDS_READ);
    __sqoop$field_map.put("RECORDS_WRITTEN", this.RECORDS_WRITTEN);
    __sqoop$field_map.put("OBJECT_LOG_NAME", this.OBJECT_LOG_NAME);
    __sqoop$field_map.put("OBJECT_PRG_NAME", this.OBJECT_PRG_NAME);
    __sqoop$field_map.put("INGESTION_MODE", this.INGESTION_MODE);
    __sqoop$field_map.put("PREV_HIGH_WATER_MARK_VALUE", this.PREV_HIGH_WATER_MARK_VALUE);
    __sqoop$field_map.put("HIGH_WATER_MARK_VALUE_JNL", this.HIGH_WATER_MARK_VALUE_JNL);
    __sqoop$field_map.put("HIGH_WATER_MARK_VALUE", this.HIGH_WATER_MARK_VALUE);
    __sqoop$field_map.put("LOAD_PATTERN_NAME", this.LOAD_PATTERN_NAME);
    __sqoop$field_map.put("TASK1", this.TASK1);
    __sqoop$field_map.put("TASK1_START_TIME", this.TASK1_START_TIME);
    __sqoop$field_map.put("TASK1_END_TIME", this.TASK1_END_TIME);
    __sqoop$field_map.put("TASK2", this.TASK2);
    __sqoop$field_map.put("TASK2_START_TIME", this.TASK2_START_TIME);
    __sqoop$field_map.put("TASK2_END_TIME", this.TASK2_END_TIME);
    __sqoop$field_map.put("TASK3", this.TASK3);
    __sqoop$field_map.put("TASK3_START_TIME", this.TASK3_START_TIME);
    __sqoop$field_map.put("TASK3_END_TIME", this.TASK3_END_TIME);
    __sqoop$field_map.put("TASK4", this.TASK4);
    __sqoop$field_map.put("TASK4_START_TIME", this.TASK4_START_TIME);
    __sqoop$field_map.put("TASK4_END_TIME", this.TASK4_END_TIME);
    __sqoop$field_map.put("TASK5", this.TASK5);
    __sqoop$field_map.put("TASK5_START_TIME", this.TASK5_START_TIME);
    __sqoop$field_map.put("TASK5_END_TIME", this.TASK5_END_TIME);
    __sqoop$field_map.put("TASK6", this.TASK6);
    __sqoop$field_map.put("TASK6_START_TIME", this.TASK6_START_TIME);
    __sqoop$field_map.put("TASK6_END_TIME", this.TASK6_END_TIME);
    __sqoop$field_map.put("TASK7", this.TASK7);
    __sqoop$field_map.put("TASK7_START_TIME", this.TASK7_START_TIME);
    __sqoop$field_map.put("TASK7_END_TIME", this.TASK7_END_TIME);
    __sqoop$field_map.put("TASK8", this.TASK8);
    __sqoop$field_map.put("TASK8_START_TIME", this.TASK8_START_TIME);
    __sqoop$field_map.put("TASK8_END_TIME", this.TASK8_END_TIME);
    __sqoop$field_map.put("TASK9", this.TASK9);
    __sqoop$field_map.put("TASK9_START_TIME", this.TASK9_START_TIME);
    __sqoop$field_map.put("TASK9_END_TIME", this.TASK9_END_TIME);
    __sqoop$field_map.put("TASK10", this.TASK10);
    __sqoop$field_map.put("TASK10_START_TIME", this.TASK10_START_TIME);
    __sqoop$field_map.put("TASK10_END_TIME", this.TASK10_END_TIME);
    __sqoop$field_map.put("TASK11", this.TASK11);
    __sqoop$field_map.put("TASK11_START_TIME", this.TASK11_START_TIME);
    __sqoop$field_map.put("TASK11_END_TIME", this.TASK11_END_TIME);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
