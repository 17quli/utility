// ORM class for table 'tblnz_slscustomsmovement'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:47:45 NZDT 2020
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

public class tblnz_slscustomsmovement extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomsMovementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.flngCustomsMovementKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fintSeq = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fi64MovementID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fi64MovementID = (Long)value;
      }
    });
    setters.put("fi64GatewayKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fi64GatewayKey = (Long)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrLastName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrLastName = (String)value;
      }
    });
    setters.put("fdtmDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fdtmDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrSex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrSex = (String)value;
      }
    });
    setters.put("fstrPassportNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrPassportNumber = (String)value;
      }
    });
    setters.put("fstrCitizenship", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrCitizenship = (String)value;
      }
    });
    setters.put("fdtmTravelDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fdtmTravelDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrDirection", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrDirection = (String)value;
      }
    });
    setters.put("fstrFlightNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrFlightNumber = (String)value;
      }
    });
    setters.put("fstrPort", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrPort = (String)value;
      }
    });
    setters.put("fstrOverseasPort", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrOverseasPort = (String)value;
      }
    });
    setters.put("fcurMatchPercent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fcurMatchPercent = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrSource = (String)value;
      }
    });
    setters.put("fstrIRDNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrIRDNumber = (String)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngCaseKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.flngCaseKey = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_slscustomsmovement.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_slscustomsmovement() {
    init0();
  }
  private Integer flngCustomsMovementKey;
  public Integer get_flngCustomsMovementKey() {
    return flngCustomsMovementKey;
  }
  public void set_flngCustomsMovementKey(Integer flngCustomsMovementKey) {
    this.flngCustomsMovementKey = flngCustomsMovementKey;
  }
  public tblnz_slscustomsmovement with_flngCustomsMovementKey(Integer flngCustomsMovementKey) {
    this.flngCustomsMovementKey = flngCustomsMovementKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_slscustomsmovement with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_slscustomsmovement with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_slscustomsmovement with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblnz_slscustomsmovement with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Long fi64MovementID;
  public Long get_fi64MovementID() {
    return fi64MovementID;
  }
  public void set_fi64MovementID(Long fi64MovementID) {
    this.fi64MovementID = fi64MovementID;
  }
  public tblnz_slscustomsmovement with_fi64MovementID(Long fi64MovementID) {
    this.fi64MovementID = fi64MovementID;
    return this;
  }
  private Long fi64GatewayKey;
  public Long get_fi64GatewayKey() {
    return fi64GatewayKey;
  }
  public void set_fi64GatewayKey(Long fi64GatewayKey) {
    this.fi64GatewayKey = fi64GatewayKey;
  }
  public tblnz_slscustomsmovement with_fi64GatewayKey(Long fi64GatewayKey) {
    this.fi64GatewayKey = fi64GatewayKey;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tblnz_slscustomsmovement with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrLastName;
  public String get_fstrLastName() {
    return fstrLastName;
  }
  public void set_fstrLastName(String fstrLastName) {
    this.fstrLastName = fstrLastName;
  }
  public tblnz_slscustomsmovement with_fstrLastName(String fstrLastName) {
    this.fstrLastName = fstrLastName;
    return this;
  }
  private java.sql.Timestamp fdtmDOB;
  public java.sql.Timestamp get_fdtmDOB() {
    return fdtmDOB;
  }
  public void set_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
  }
  public tblnz_slscustomsmovement with_fdtmDOB(java.sql.Timestamp fdtmDOB) {
    this.fdtmDOB = fdtmDOB;
    return this;
  }
  private String fstrSex;
  public String get_fstrSex() {
    return fstrSex;
  }
  public void set_fstrSex(String fstrSex) {
    this.fstrSex = fstrSex;
  }
  public tblnz_slscustomsmovement with_fstrSex(String fstrSex) {
    this.fstrSex = fstrSex;
    return this;
  }
  private String fstrPassportNumber;
  public String get_fstrPassportNumber() {
    return fstrPassportNumber;
  }
  public void set_fstrPassportNumber(String fstrPassportNumber) {
    this.fstrPassportNumber = fstrPassportNumber;
  }
  public tblnz_slscustomsmovement with_fstrPassportNumber(String fstrPassportNumber) {
    this.fstrPassportNumber = fstrPassportNumber;
    return this;
  }
  private String fstrCitizenship;
  public String get_fstrCitizenship() {
    return fstrCitizenship;
  }
  public void set_fstrCitizenship(String fstrCitizenship) {
    this.fstrCitizenship = fstrCitizenship;
  }
  public tblnz_slscustomsmovement with_fstrCitizenship(String fstrCitizenship) {
    this.fstrCitizenship = fstrCitizenship;
    return this;
  }
  private java.sql.Timestamp fdtmTravelDate;
  public java.sql.Timestamp get_fdtmTravelDate() {
    return fdtmTravelDate;
  }
  public void set_fdtmTravelDate(java.sql.Timestamp fdtmTravelDate) {
    this.fdtmTravelDate = fdtmTravelDate;
  }
  public tblnz_slscustomsmovement with_fdtmTravelDate(java.sql.Timestamp fdtmTravelDate) {
    this.fdtmTravelDate = fdtmTravelDate;
    return this;
  }
  private String fstrDirection;
  public String get_fstrDirection() {
    return fstrDirection;
  }
  public void set_fstrDirection(String fstrDirection) {
    this.fstrDirection = fstrDirection;
  }
  public tblnz_slscustomsmovement with_fstrDirection(String fstrDirection) {
    this.fstrDirection = fstrDirection;
    return this;
  }
  private String fstrFlightNumber;
  public String get_fstrFlightNumber() {
    return fstrFlightNumber;
  }
  public void set_fstrFlightNumber(String fstrFlightNumber) {
    this.fstrFlightNumber = fstrFlightNumber;
  }
  public tblnz_slscustomsmovement with_fstrFlightNumber(String fstrFlightNumber) {
    this.fstrFlightNumber = fstrFlightNumber;
    return this;
  }
  private String fstrPort;
  public String get_fstrPort() {
    return fstrPort;
  }
  public void set_fstrPort(String fstrPort) {
    this.fstrPort = fstrPort;
  }
  public tblnz_slscustomsmovement with_fstrPort(String fstrPort) {
    this.fstrPort = fstrPort;
    return this;
  }
  private String fstrOverseasPort;
  public String get_fstrOverseasPort() {
    return fstrOverseasPort;
  }
  public void set_fstrOverseasPort(String fstrOverseasPort) {
    this.fstrOverseasPort = fstrOverseasPort;
  }
  public tblnz_slscustomsmovement with_fstrOverseasPort(String fstrOverseasPort) {
    this.fstrOverseasPort = fstrOverseasPort;
    return this;
  }
  private java.math.BigDecimal fcurMatchPercent;
  public java.math.BigDecimal get_fcurMatchPercent() {
    return fcurMatchPercent;
  }
  public void set_fcurMatchPercent(java.math.BigDecimal fcurMatchPercent) {
    this.fcurMatchPercent = fcurMatchPercent;
  }
  public tblnz_slscustomsmovement with_fcurMatchPercent(java.math.BigDecimal fcurMatchPercent) {
    this.fcurMatchPercent = fcurMatchPercent;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblnz_slscustomsmovement with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private String fstrIRDNumber;
  public String get_fstrIRDNumber() {
    return fstrIRDNumber;
  }
  public void set_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
  }
  public tblnz_slscustomsmovement with_fstrIRDNumber(String fstrIRDNumber) {
    this.fstrIRDNumber = fstrIRDNumber;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblnz_slscustomsmovement with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private Integer flngCaseKey;
  public Integer get_flngCaseKey() {
    return flngCaseKey;
  }
  public void set_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
  }
  public tblnz_slscustomsmovement with_flngCaseKey(Integer flngCaseKey) {
    this.flngCaseKey = flngCaseKey;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_slscustomsmovement with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_slscustomsmovement with_fstrWho(String fstrWho) {
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
  public tblnz_slscustomsmovement with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_slscustomsmovement)) {
      return false;
    }
    tblnz_slscustomsmovement that = (tblnz_slscustomsmovement) o;
    boolean equal = true;
    equal = equal && (this.flngCustomsMovementKey == null ? that.flngCustomsMovementKey == null : this.flngCustomsMovementKey.equals(that.flngCustomsMovementKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64MovementID == null ? that.fi64MovementID == null : this.fi64MovementID.equals(that.fi64MovementID));
    equal = equal && (this.fi64GatewayKey == null ? that.fi64GatewayKey == null : this.fi64GatewayKey.equals(that.fi64GatewayKey));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrLastName == null ? that.fstrLastName == null : this.fstrLastName.equals(that.fstrLastName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrSex == null ? that.fstrSex == null : this.fstrSex.equals(that.fstrSex));
    equal = equal && (this.fstrPassportNumber == null ? that.fstrPassportNumber == null : this.fstrPassportNumber.equals(that.fstrPassportNumber));
    equal = equal && (this.fstrCitizenship == null ? that.fstrCitizenship == null : this.fstrCitizenship.equals(that.fstrCitizenship));
    equal = equal && (this.fdtmTravelDate == null ? that.fdtmTravelDate == null : this.fdtmTravelDate.equals(that.fdtmTravelDate));
    equal = equal && (this.fstrDirection == null ? that.fstrDirection == null : this.fstrDirection.equals(that.fstrDirection));
    equal = equal && (this.fstrFlightNumber == null ? that.fstrFlightNumber == null : this.fstrFlightNumber.equals(that.fstrFlightNumber));
    equal = equal && (this.fstrPort == null ? that.fstrPort == null : this.fstrPort.equals(that.fstrPort));
    equal = equal && (this.fstrOverseasPort == null ? that.fstrOverseasPort == null : this.fstrOverseasPort.equals(that.fstrOverseasPort));
    equal = equal && (this.fcurMatchPercent == null ? that.fcurMatchPercent == null : this.fcurMatchPercent.equals(that.fcurMatchPercent));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_slscustomsmovement)) {
      return false;
    }
    tblnz_slscustomsmovement that = (tblnz_slscustomsmovement) o;
    boolean equal = true;
    equal = equal && (this.flngCustomsMovementKey == null ? that.flngCustomsMovementKey == null : this.flngCustomsMovementKey.equals(that.flngCustomsMovementKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fi64MovementID == null ? that.fi64MovementID == null : this.fi64MovementID.equals(that.fi64MovementID));
    equal = equal && (this.fi64GatewayKey == null ? that.fi64GatewayKey == null : this.fi64GatewayKey.equals(that.fi64GatewayKey));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrLastName == null ? that.fstrLastName == null : this.fstrLastName.equals(that.fstrLastName));
    equal = equal && (this.fdtmDOB == null ? that.fdtmDOB == null : this.fdtmDOB.equals(that.fdtmDOB));
    equal = equal && (this.fstrSex == null ? that.fstrSex == null : this.fstrSex.equals(that.fstrSex));
    equal = equal && (this.fstrPassportNumber == null ? that.fstrPassportNumber == null : this.fstrPassportNumber.equals(that.fstrPassportNumber));
    equal = equal && (this.fstrCitizenship == null ? that.fstrCitizenship == null : this.fstrCitizenship.equals(that.fstrCitizenship));
    equal = equal && (this.fdtmTravelDate == null ? that.fdtmTravelDate == null : this.fdtmTravelDate.equals(that.fdtmTravelDate));
    equal = equal && (this.fstrDirection == null ? that.fstrDirection == null : this.fstrDirection.equals(that.fstrDirection));
    equal = equal && (this.fstrFlightNumber == null ? that.fstrFlightNumber == null : this.fstrFlightNumber.equals(that.fstrFlightNumber));
    equal = equal && (this.fstrPort == null ? that.fstrPort == null : this.fstrPort.equals(that.fstrPort));
    equal = equal && (this.fstrOverseasPort == null ? that.fstrOverseasPort == null : this.fstrOverseasPort.equals(that.fstrOverseasPort));
    equal = equal && (this.fcurMatchPercent == null ? that.fcurMatchPercent == null : this.fcurMatchPercent.equals(that.fcurMatchPercent));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.fstrIRDNumber == null ? that.fstrIRDNumber == null : this.fstrIRDNumber.equals(that.fstrIRDNumber));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.flngCaseKey == null ? that.flngCaseKey == null : this.flngCaseKey.equals(that.flngCaseKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomsMovementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fi64MovementID = JdbcWritableBridge.readLong(6, __dbResults);
    this.fi64GatewayKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrLastName = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrSex = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrPassportNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCitizenship = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmTravelDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrDirection = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrFlightNumber = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPort = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrOverseasPort = JdbcWritableBridge.readString(18, __dbResults);
    this.fcurMatchPercent = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(26, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomsMovementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fi64MovementID = JdbcWritableBridge.readLong(6, __dbResults);
    this.fi64GatewayKey = JdbcWritableBridge.readLong(7, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrLastName = JdbcWritableBridge.readString(9, __dbResults);
    this.fdtmDOB = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fstrSex = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrPassportNumber = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCitizenship = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmTravelDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrDirection = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrFlightNumber = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPort = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrOverseasPort = JdbcWritableBridge.readString(18, __dbResults);
    this.fcurMatchPercent = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrIRDNumber = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.flngCaseKey = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(26, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomsMovementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64MovementID, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64GatewayKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSex, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCitizenship, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTravelDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDirection, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFlightNumber, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPort, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOverseasPort, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMatchPercent, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 26 + __off, 93, __dbStmt);
    return 26;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomsMovementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64MovementID, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64GatewayKey, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDOB, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSex, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPassportNumber, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCitizenship, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmTravelDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrDirection, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFlightNumber, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPort, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOverseasPort, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMatchPercent, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDNumber, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCaseKey, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 26 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomsMovementKey = null;
    } else {
    this.flngCustomsMovementKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64MovementID = null;
    } else {
    this.fi64MovementID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64GatewayKey = null;
    } else {
    this.fi64GatewayKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastName = null;
    } else {
    this.fstrLastName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDOB = null;
    } else {
    this.fdtmDOB = new Timestamp(__dataIn.readLong());
    this.fdtmDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSex = null;
    } else {
    this.fstrSex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPassportNumber = null;
    } else {
    this.fstrPassportNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCitizenship = null;
    } else {
    this.fstrCitizenship = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmTravelDate = null;
    } else {
    this.fdtmTravelDate = new Timestamp(__dataIn.readLong());
    this.fdtmTravelDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDirection = null;
    } else {
    this.fstrDirection = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFlightNumber = null;
    } else {
    this.fstrFlightNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPort = null;
    } else {
    this.fstrPort = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOverseasPort = null;
    } else {
    this.fstrOverseasPort = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMatchPercent = null;
    } else {
    this.fcurMatchPercent = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDNumber = null;
    } else {
    this.fstrIRDNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCaseKey = null;
    } else {
    this.flngCaseKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCustomsMovementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomsMovementKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fi64MovementID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MovementID);
    }
    if (null == this.fi64GatewayKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayKey);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrSex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSex);
    }
    if (null == this.fstrPassportNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportNumber);
    }
    if (null == this.fstrCitizenship) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCitizenship);
    }
    if (null == this.fdtmTravelDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTravelDate.getTime());
    __dataOut.writeInt(this.fdtmTravelDate.getNanos());
    }
    if (null == this.fstrDirection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDirection);
    }
    if (null == this.fstrFlightNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFlightNumber);
    }
    if (null == this.fstrPort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPort);
    }
    if (null == this.fstrOverseasPort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOverseasPort);
    }
    if (null == this.fcurMatchPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMatchPercent, __dataOut);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngCustomsMovementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomsMovementKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fi64MovementID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64MovementID);
    }
    if (null == this.fi64GatewayKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64GatewayKey);
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrLastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastName);
    }
    if (null == this.fdtmDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDOB.getTime());
    __dataOut.writeInt(this.fdtmDOB.getNanos());
    }
    if (null == this.fstrSex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSex);
    }
    if (null == this.fstrPassportNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPassportNumber);
    }
    if (null == this.fstrCitizenship) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCitizenship);
    }
    if (null == this.fdtmTravelDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmTravelDate.getTime());
    __dataOut.writeInt(this.fdtmTravelDate.getNanos());
    }
    if (null == this.fstrDirection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDirection);
    }
    if (null == this.fstrFlightNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFlightNumber);
    }
    if (null == this.fstrPort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPort);
    }
    if (null == this.fstrOverseasPort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOverseasPort);
    }
    if (null == this.fcurMatchPercent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMatchPercent, __dataOut);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.fstrIRDNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDNumber);
    }
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.flngCaseKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCaseKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomsMovementKey==null?"\\N":"" + flngCustomsMovementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MovementID==null?"\\N":"" + fi64MovementID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayKey==null?"\\N":"" + fi64GatewayKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastName==null?"\\N":fstrLastName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSex==null?"\\N":fstrSex, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportNumber==null?"\\N":fstrPassportNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCitizenship==null?"\\N":fstrCitizenship, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTravelDate==null?"\\N":"" + fdtmTravelDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDirection==null?"\\N":fstrDirection, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFlightNumber==null?"\\N":fstrFlightNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPort==null?"\\N":fstrPort, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOverseasPort==null?"\\N":fstrOverseasPort, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMatchPercent==null?"\\N":fcurMatchPercent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomsMovementKey==null?"\\N":"" + flngCustomsMovementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64MovementID==null?"\\N":"" + fi64MovementID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64GatewayKey==null?"\\N":"" + fi64GatewayKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastName==null?"\\N":fstrLastName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDOB==null?"\\N":"" + fdtmDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSex==null?"\\N":fstrSex, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPassportNumber==null?"\\N":fstrPassportNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCitizenship==null?"\\N":fstrCitizenship, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmTravelDate==null?"\\N":"" + fdtmTravelDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDirection==null?"\\N":fstrDirection, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFlightNumber==null?"\\N":fstrFlightNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPort==null?"\\N":fstrPort, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOverseasPort==null?"\\N":fstrOverseasPort, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMatchPercent==null?"\\N":fcurMatchPercent.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDNumber==null?"\\N":fstrIRDNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCaseKey==null?"\\N":"" + flngCaseKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomsMovementKey = null; } else {
      this.flngCustomsMovementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MovementID = null; } else {
      this.fi64MovementID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayKey = null; } else {
      this.fi64GatewayKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastName = null; } else {
      this.fstrLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSex = null; } else {
      this.fstrSex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportNumber = null; } else {
      this.fstrPassportNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCitizenship = null; } else {
      this.fstrCitizenship = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTravelDate = null; } else {
      this.fdtmTravelDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDirection = null; } else {
      this.fstrDirection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFlightNumber = null; } else {
      this.fstrFlightNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPort = null; } else {
      this.fstrPort = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOverseasPort = null; } else {
      this.fstrOverseasPort = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMatchPercent = null; } else {
      this.fcurMatchPercent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomsMovementKey = null; } else {
      this.flngCustomsMovementKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64MovementID = null; } else {
      this.fi64MovementID = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64GatewayKey = null; } else {
      this.fi64GatewayKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastName = null; } else {
      this.fstrLastName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDOB = null; } else {
      this.fdtmDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSex = null; } else {
      this.fstrSex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPassportNumber = null; } else {
      this.fstrPassportNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCitizenship = null; } else {
      this.fstrCitizenship = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmTravelDate = null; } else {
      this.fdtmTravelDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDirection = null; } else {
      this.fstrDirection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFlightNumber = null; } else {
      this.fstrFlightNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPort = null; } else {
      this.fstrPort = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOverseasPort = null; } else {
      this.fstrOverseasPort = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMatchPercent = null; } else {
      this.fcurMatchPercent = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDNumber = null; } else {
      this.fstrIRDNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCaseKey = null; } else {
      this.flngCaseKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblnz_slscustomsmovement o = (tblnz_slscustomsmovement) super.clone();
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmTravelDate = (o.fdtmTravelDate != null) ? (java.sql.Timestamp) o.fdtmTravelDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_slscustomsmovement o) throws CloneNotSupportedException {
    o.fdtmDOB = (o.fdtmDOB != null) ? (java.sql.Timestamp) o.fdtmDOB.clone() : null;
    o.fdtmTravelDate = (o.fdtmTravelDate != null) ? (java.sql.Timestamp) o.fdtmTravelDate.clone() : null;
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomsMovementKey", this.flngCustomsMovementKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64MovementID", this.fi64MovementID);
    __sqoop$field_map.put("fi64GatewayKey", this.fi64GatewayKey);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrLastName", this.fstrLastName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrSex", this.fstrSex);
    __sqoop$field_map.put("fstrPassportNumber", this.fstrPassportNumber);
    __sqoop$field_map.put("fstrCitizenship", this.fstrCitizenship);
    __sqoop$field_map.put("fdtmTravelDate", this.fdtmTravelDate);
    __sqoop$field_map.put("fstrDirection", this.fstrDirection);
    __sqoop$field_map.put("fstrFlightNumber", this.fstrFlightNumber);
    __sqoop$field_map.put("fstrPort", this.fstrPort);
    __sqoop$field_map.put("fstrOverseasPort", this.fstrOverseasPort);
    __sqoop$field_map.put("fcurMatchPercent", this.fcurMatchPercent);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomsMovementKey", this.flngCustomsMovementKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fi64MovementID", this.fi64MovementID);
    __sqoop$field_map.put("fi64GatewayKey", this.fi64GatewayKey);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrLastName", this.fstrLastName);
    __sqoop$field_map.put("fdtmDOB", this.fdtmDOB);
    __sqoop$field_map.put("fstrSex", this.fstrSex);
    __sqoop$field_map.put("fstrPassportNumber", this.fstrPassportNumber);
    __sqoop$field_map.put("fstrCitizenship", this.fstrCitizenship);
    __sqoop$field_map.put("fdtmTravelDate", this.fdtmTravelDate);
    __sqoop$field_map.put("fstrDirection", this.fstrDirection);
    __sqoop$field_map.put("fstrFlightNumber", this.fstrFlightNumber);
    __sqoop$field_map.put("fstrPort", this.fstrPort);
    __sqoop$field_map.put("fstrOverseasPort", this.fstrOverseasPort);
    __sqoop$field_map.put("fcurMatchPercent", this.fcurMatchPercent);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("fstrIRDNumber", this.fstrIRDNumber);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("flngCaseKey", this.flngCaseKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
