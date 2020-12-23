// ORM class for table 'tblcontrolusagelog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Dec 12 03:34:25 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
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

public class tblcontrolusagelog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ControlUsageKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fi64ControlUsageKey = (Long)value;
      }
    });
    setters.put("fi64SessionUniqueKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fi64SessionUniqueKey = (Long)value;
      }
    });
    setters.put("fstrApplication", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrApplication = (String)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrManager = (String)value;
      }
    });
    setters.put("fstrFlow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrFlow = (String)value;
      }
    });
    setters.put("fstrControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrControl = (String)value;
      }
    });
    setters.put("flngMode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.flngMode = (Integer)value;
      }
    });
    setters.put("fstrType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrType = (String)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fdtmEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrLastViewDoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrLastViewDoc = (String)value;
      }
    });
    setters.put("fstrLastView", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrLastView = (String)value;
      }
    });
    setters.put("fintLastStep", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fintLastStep = (Integer)value;
      }
    });
    setters.put("flngDuration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.flngDuration = (Integer)value;
      }
    });
    setters.put("fblnExecuted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fblnExecuted = (Integer)value;
      }
    });
    setters.put("fblnMobileDevice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fblnMobileDevice = (Integer)value;
      }
    });
    setters.put("fblnMobileMode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fblnMobileMode = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusagelog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcontrolusagelog() {
    init0();
  }
  private Long fi64ControlUsageKey;
  public Long get_fi64ControlUsageKey() {
    return fi64ControlUsageKey;
  }
  public void set_fi64ControlUsageKey(Long fi64ControlUsageKey) {
    this.fi64ControlUsageKey = fi64ControlUsageKey;
  }
  public tblcontrolusagelog with_fi64ControlUsageKey(Long fi64ControlUsageKey) {
    this.fi64ControlUsageKey = fi64ControlUsageKey;
    return this;
  }
  private Long fi64SessionUniqueKey;
  public Long get_fi64SessionUniqueKey() {
    return fi64SessionUniqueKey;
  }
  public void set_fi64SessionUniqueKey(Long fi64SessionUniqueKey) {
    this.fi64SessionUniqueKey = fi64SessionUniqueKey;
  }
  public tblcontrolusagelog with_fi64SessionUniqueKey(Long fi64SessionUniqueKey) {
    this.fi64SessionUniqueKey = fi64SessionUniqueKey;
    return this;
  }
  private String fstrApplication;
  public String get_fstrApplication() {
    return fstrApplication;
  }
  public void set_fstrApplication(String fstrApplication) {
    this.fstrApplication = fstrApplication;
  }
  public tblcontrolusagelog with_fstrApplication(String fstrApplication) {
    this.fstrApplication = fstrApplication;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tblcontrolusagelog with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private String fstrFlow;
  public String get_fstrFlow() {
    return fstrFlow;
  }
  public void set_fstrFlow(String fstrFlow) {
    this.fstrFlow = fstrFlow;
  }
  public tblcontrolusagelog with_fstrFlow(String fstrFlow) {
    this.fstrFlow = fstrFlow;
    return this;
  }
  private String fstrControl;
  public String get_fstrControl() {
    return fstrControl;
  }
  public void set_fstrControl(String fstrControl) {
    this.fstrControl = fstrControl;
  }
  public tblcontrolusagelog with_fstrControl(String fstrControl) {
    this.fstrControl = fstrControl;
    return this;
  }
  private Integer flngMode;
  public Integer get_flngMode() {
    return flngMode;
  }
  public void set_flngMode(Integer flngMode) {
    this.flngMode = flngMode;
  }
  public tblcontrolusagelog with_flngMode(Integer flngMode) {
    this.flngMode = flngMode;
    return this;
  }
  private String fstrType;
  public String get_fstrType() {
    return fstrType;
  }
  public void set_fstrType(String fstrType) {
    this.fstrType = fstrType;
  }
  public tblcontrolusagelog with_fstrType(String fstrType) {
    this.fstrType = fstrType;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tblcontrolusagelog with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmEnd;
  public java.sql.Timestamp get_fdtmEnd() {
    return fdtmEnd;
  }
  public void set_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
  }
  public tblcontrolusagelog with_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
    return this;
  }
  private String fstrLastViewDoc;
  public String get_fstrLastViewDoc() {
    return fstrLastViewDoc;
  }
  public void set_fstrLastViewDoc(String fstrLastViewDoc) {
    this.fstrLastViewDoc = fstrLastViewDoc;
  }
  public tblcontrolusagelog with_fstrLastViewDoc(String fstrLastViewDoc) {
    this.fstrLastViewDoc = fstrLastViewDoc;
    return this;
  }
  private String fstrLastView;
  public String get_fstrLastView() {
    return fstrLastView;
  }
  public void set_fstrLastView(String fstrLastView) {
    this.fstrLastView = fstrLastView;
  }
  public tblcontrolusagelog with_fstrLastView(String fstrLastView) {
    this.fstrLastView = fstrLastView;
    return this;
  }
  private Integer fintLastStep;
  public Integer get_fintLastStep() {
    return fintLastStep;
  }
  public void set_fintLastStep(Integer fintLastStep) {
    this.fintLastStep = fintLastStep;
  }
  public tblcontrolusagelog with_fintLastStep(Integer fintLastStep) {
    this.fintLastStep = fintLastStep;
    return this;
  }
  private Integer flngDuration;
  public Integer get_flngDuration() {
    return flngDuration;
  }
  public void set_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
  }
  public tblcontrolusagelog with_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
    return this;
  }
  private Integer fblnExecuted;
  public Integer get_fblnExecuted() {
    return fblnExecuted;
  }
  public void set_fblnExecuted(Integer fblnExecuted) {
    this.fblnExecuted = fblnExecuted;
  }
  public tblcontrolusagelog with_fblnExecuted(Integer fblnExecuted) {
    this.fblnExecuted = fblnExecuted;
    return this;
  }
  private Integer fblnMobileDevice;
  public Integer get_fblnMobileDevice() {
    return fblnMobileDevice;
  }
  public void set_fblnMobileDevice(Integer fblnMobileDevice) {
    this.fblnMobileDevice = fblnMobileDevice;
  }
  public tblcontrolusagelog with_fblnMobileDevice(Integer fblnMobileDevice) {
    this.fblnMobileDevice = fblnMobileDevice;
    return this;
  }
  private Integer fblnMobileMode;
  public Integer get_fblnMobileMode() {
    return fblnMobileMode;
  }
  public void set_fblnMobileMode(Integer fblnMobileMode) {
    this.fblnMobileMode = fblnMobileMode;
  }
  public tblcontrolusagelog with_fblnMobileMode(Integer fblnMobileMode) {
    this.fblnMobileMode = fblnMobileMode;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcontrolusagelog with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblcontrolusagelog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontrolusagelog)) {
      return false;
    }
    tblcontrolusagelog that = (tblcontrolusagelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ControlUsageKey == null ? that.fi64ControlUsageKey == null : this.fi64ControlUsageKey.equals(that.fi64ControlUsageKey));
    equal = equal && (this.fi64SessionUniqueKey == null ? that.fi64SessionUniqueKey == null : this.fi64SessionUniqueKey.equals(that.fi64SessionUniqueKey));
    equal = equal && (this.fstrApplication == null ? that.fstrApplication == null : this.fstrApplication.equals(that.fstrApplication));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrFlow == null ? that.fstrFlow == null : this.fstrFlow.equals(that.fstrFlow));
    equal = equal && (this.fstrControl == null ? that.fstrControl == null : this.fstrControl.equals(that.fstrControl));
    equal = equal && (this.flngMode == null ? that.flngMode == null : this.flngMode.equals(that.flngMode));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrLastViewDoc == null ? that.fstrLastViewDoc == null : this.fstrLastViewDoc.equals(that.fstrLastViewDoc));
    equal = equal && (this.fstrLastView == null ? that.fstrLastView == null : this.fstrLastView.equals(that.fstrLastView));
    equal = equal && (this.fintLastStep == null ? that.fintLastStep == null : this.fintLastStep.equals(that.fintLastStep));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fblnExecuted == null ? that.fblnExecuted == null : this.fblnExecuted.equals(that.fblnExecuted));
    equal = equal && (this.fblnMobileDevice == null ? that.fblnMobileDevice == null : this.fblnMobileDevice.equals(that.fblnMobileDevice));
    equal = equal && (this.fblnMobileMode == null ? that.fblnMobileMode == null : this.fblnMobileMode.equals(that.fblnMobileMode));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontrolusagelog)) {
      return false;
    }
    tblcontrolusagelog that = (tblcontrolusagelog) o;
    boolean equal = true;
    equal = equal && (this.fi64ControlUsageKey == null ? that.fi64ControlUsageKey == null : this.fi64ControlUsageKey.equals(that.fi64ControlUsageKey));
    equal = equal && (this.fi64SessionUniqueKey == null ? that.fi64SessionUniqueKey == null : this.fi64SessionUniqueKey.equals(that.fi64SessionUniqueKey));
    equal = equal && (this.fstrApplication == null ? that.fstrApplication == null : this.fstrApplication.equals(that.fstrApplication));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.fstrFlow == null ? that.fstrFlow == null : this.fstrFlow.equals(that.fstrFlow));
    equal = equal && (this.fstrControl == null ? that.fstrControl == null : this.fstrControl.equals(that.fstrControl));
    equal = equal && (this.flngMode == null ? that.flngMode == null : this.flngMode.equals(that.flngMode));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrLastViewDoc == null ? that.fstrLastViewDoc == null : this.fstrLastViewDoc.equals(that.fstrLastViewDoc));
    equal = equal && (this.fstrLastView == null ? that.fstrLastView == null : this.fstrLastView.equals(that.fstrLastView));
    equal = equal && (this.fintLastStep == null ? that.fintLastStep == null : this.fintLastStep.equals(that.fintLastStep));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fblnExecuted == null ? that.fblnExecuted == null : this.fblnExecuted.equals(that.fblnExecuted));
    equal = equal && (this.fblnMobileDevice == null ? that.fblnMobileDevice == null : this.fblnMobileDevice.equals(that.fblnMobileDevice));
    equal = equal && (this.fblnMobileMode == null ? that.fblnMobileMode == null : this.fblnMobileMode.equals(that.fblnMobileMode));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ControlUsageKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64SessionUniqueKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrApplication = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFlow = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrControl = JdbcWritableBridge.readString(6, __dbResults);
    this.flngMode = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrLastViewDoc = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrLastView = JdbcWritableBridge.readString(12, __dbResults);
    this.fintLastStep = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnExecuted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMobileDevice = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnMobileMode = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ControlUsageKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64SessionUniqueKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fstrApplication = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFlow = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrControl = JdbcWritableBridge.readString(6, __dbResults);
    this.flngMode = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrLastViewDoc = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrLastView = JdbcWritableBridge.readString(12, __dbResults);
    this.fintLastStep = JdbcWritableBridge.readInteger(13, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnExecuted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMobileDevice = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnMobileMode = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ControlUsageKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SessionUniqueKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrApplication, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFlow, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrControl, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMode, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastViewDoc, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastView, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintLastStep, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExecuted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileDevice, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileMode, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ControlUsageKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SessionUniqueKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrApplication, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFlow, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrControl, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMode, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastViewDoc, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastView, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintLastStep, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExecuted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileDevice, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMobileMode, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ControlUsageKey = null;
    } else {
    this.fi64ControlUsageKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64SessionUniqueKey = null;
    } else {
    this.fi64SessionUniqueKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApplication = null;
    } else {
    this.fstrApplication = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFlow = null;
    } else {
    this.fstrFlow = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrControl = null;
    } else {
    this.fstrControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngMode = null;
    } else {
    this.flngMode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrType = null;
    } else {
    this.fstrType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEnd = null;
    } else {
    this.fdtmEnd = new Timestamp(__dataIn.readLong());
    this.fdtmEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastViewDoc = null;
    } else {
    this.fstrLastViewDoc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastView = null;
    } else {
    this.fstrLastView = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintLastStep = null;
    } else {
    this.fintLastStep = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDuration = null;
    } else {
    this.flngDuration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExecuted = null;
    } else {
    this.fblnExecuted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMobileDevice = null;
    } else {
    this.fblnMobileDevice = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMobileMode = null;
    } else {
    this.fblnMobileMode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fi64ControlUsageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageKey);
    }
    if (null == this.fi64SessionUniqueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SessionUniqueKey);
    }
    if (null == this.fstrApplication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApplication);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFlow);
    }
    if (null == this.fstrControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrControl);
    }
    if (null == this.flngMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMode);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrLastViewDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastViewDoc);
    }
    if (null == this.fstrLastView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastView);
    }
    if (null == this.fintLastStep) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintLastStep);
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.fblnExecuted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExecuted);
    }
    if (null == this.fblnMobileDevice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileDevice);
    }
    if (null == this.fblnMobileMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileMode);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fi64ControlUsageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageKey);
    }
    if (null == this.fi64SessionUniqueKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SessionUniqueKey);
    }
    if (null == this.fstrApplication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApplication);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.fstrFlow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFlow);
    }
    if (null == this.fstrControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrControl);
    }
    if (null == this.flngMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMode);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrLastViewDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastViewDoc);
    }
    if (null == this.fstrLastView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastView);
    }
    if (null == this.fintLastStep) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintLastStep);
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.fblnExecuted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExecuted);
    }
    if (null == this.fblnMobileDevice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileDevice);
    }
    if (null == this.fblnMobileMode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMobileMode);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageKey==null?"\\N":"" + fi64ControlUsageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SessionUniqueKey==null?"\\N":"" + fi64SessionUniqueKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApplication==null?"\\N":fstrApplication, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFlow==null?"\\N":fstrFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrControl==null?"\\N":fstrControl, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMode==null?"\\N":"" + flngMode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastViewDoc==null?"\\N":fstrLastViewDoc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastView==null?"\\N":fstrLastView, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintLastStep==null?"\\N":"" + fintLastStep, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExecuted==null?"\\N":"" + fblnExecuted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileDevice==null?"\\N":"" + fblnMobileDevice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileMode==null?"\\N":"" + fblnMobileMode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageKey==null?"\\N":"" + fi64ControlUsageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SessionUniqueKey==null?"\\N":"" + fi64SessionUniqueKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApplication==null?"\\N":fstrApplication, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFlow==null?"\\N":fstrFlow, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrControl==null?"\\N":fstrControl, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMode==null?"\\N":"" + flngMode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastViewDoc==null?"\\N":fstrLastViewDoc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastView==null?"\\N":fstrLastView, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintLastStep==null?"\\N":"" + fintLastStep, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExecuted==null?"\\N":"" + fblnExecuted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileDevice==null?"\\N":"" + fblnMobileDevice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMobileMode==null?"\\N":"" + fblnMobileMode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
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
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageKey = null; } else {
      this.fi64ControlUsageKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SessionUniqueKey = null; } else {
      this.fi64SessionUniqueKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApplication = null; } else {
      this.fstrApplication = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFlow = null; } else {
      this.fstrFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrControl = null; } else {
      this.fstrControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMode = null; } else {
      this.flngMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastViewDoc = null; } else {
      this.fstrLastViewDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastView = null; } else {
      this.fstrLastView = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintLastStep = null; } else {
      this.fintLastStep = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExecuted = null; } else {
      this.fblnExecuted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileDevice = null; } else {
      this.fblnMobileDevice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileMode = null; } else {
      this.fblnMobileMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageKey = null; } else {
      this.fi64ControlUsageKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SessionUniqueKey = null; } else {
      this.fi64SessionUniqueKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApplication = null; } else {
      this.fstrApplication = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFlow = null; } else {
      this.fstrFlow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrControl = null; } else {
      this.fstrControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMode = null; } else {
      this.flngMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastViewDoc = null; } else {
      this.fstrLastViewDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastView = null; } else {
      this.fstrLastView = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintLastStep = null; } else {
      this.fintLastStep = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExecuted = null; } else {
      this.fblnExecuted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileDevice = null; } else {
      this.fblnMobileDevice = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMobileMode = null; } else {
      this.fblnMobileMode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblcontrolusagelog o = (tblcontrolusagelog) super.clone();
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcontrolusagelog o) throws CloneNotSupportedException {
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ControlUsageKey", this.fi64ControlUsageKey);
    __sqoop$field_map.put("fi64SessionUniqueKey", this.fi64SessionUniqueKey);
    __sqoop$field_map.put("fstrApplication", this.fstrApplication);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrFlow", this.fstrFlow);
    __sqoop$field_map.put("fstrControl", this.fstrControl);
    __sqoop$field_map.put("flngMode", this.flngMode);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrLastViewDoc", this.fstrLastViewDoc);
    __sqoop$field_map.put("fstrLastView", this.fstrLastView);
    __sqoop$field_map.put("fintLastStep", this.fintLastStep);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("fblnExecuted", this.fblnExecuted);
    __sqoop$field_map.put("fblnMobileDevice", this.fblnMobileDevice);
    __sqoop$field_map.put("fblnMobileMode", this.fblnMobileMode);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ControlUsageKey", this.fi64ControlUsageKey);
    __sqoop$field_map.put("fi64SessionUniqueKey", this.fi64SessionUniqueKey);
    __sqoop$field_map.put("fstrApplication", this.fstrApplication);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("fstrFlow", this.fstrFlow);
    __sqoop$field_map.put("fstrControl", this.fstrControl);
    __sqoop$field_map.put("flngMode", this.flngMode);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrLastViewDoc", this.fstrLastViewDoc);
    __sqoop$field_map.put("fstrLastView", this.fstrLastView);
    __sqoop$field_map.put("fintLastStep", this.fintLastStep);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("fblnExecuted", this.fblnExecuted);
    __sqoop$field_map.put("fblnMobileDevice", this.fblnMobileDevice);
    __sqoop$field_map.put("fblnMobileMode", this.fblnMobileMode);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
