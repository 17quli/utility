// ORM class for table 'tblnz_rtnprs'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:44:27 NZDT 2020
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

public class tblnz_rtnprs extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngReturnKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.flngReturnKey = (Integer)value;
      }
    });
    setters.put("flngItemNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.flngItemNumber = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fblnInError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnInError = (Integer)value;
      }
    });
    setters.put("fstrEmployerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fstrEmployerIRD = (String)value;
      }
    });
    setters.put("fstrEmployerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fstrEmployerName = (String)value;
      }
    });
    setters.put("fstrEmployeeIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fstrEmployeeIRD = (String)value;
      }
    });
    setters.put("fstrEmployeeName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fstrEmployeeName = (String)value;
      }
    });
    setters.put("flngTimesPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.flngTimesPaid = (Integer)value;
      }
    });
    setters.put("fblnOverrideValidation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnOverrideValidation = (Integer)value;
      }
    });
    setters.put("fblnInvalidFilingHistory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnInvalidFilingHistory = (Integer)value;
      }
    });
    setters.put("fblnDuplicate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnDuplicate = (Integer)value;
      }
    });
    setters.put("fblnInvalidNumberEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnInvalidNumberEmployees = (Integer)value;
      }
    });
    setters.put("fblnNoPILink", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnNoPILink = (Integer)value;
      }
    });
    setters.put("fblnNoReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnNoReturn = (Integer)value;
      }
    });
    setters.put("fblnNoPayment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnNoPayment = (Integer)value;
      }
    });
    setters.put("fblnLateReturn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnLateReturn = (Integer)value;
      }
    });
    setters.put("fblnLargeEmployer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fblnLargeEmployer = (Integer)value;
      }
    });
    setters.put("fdtmDeleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fdtmDeleted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fdtmProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnprs.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnprs() {
    init0();
  }
  private Integer flngReturnKey;
  public Integer get_flngReturnKey() {
    return flngReturnKey;
  }
  public void set_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
  }
  public tblnz_rtnprs with_flngReturnKey(Integer flngReturnKey) {
    this.flngReturnKey = flngReturnKey;
    return this;
  }
  private Integer flngItemNumber;
  public Integer get_flngItemNumber() {
    return flngItemNumber;
  }
  public void set_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
  }
  public tblnz_rtnprs with_flngItemNumber(Integer flngItemNumber) {
    this.flngItemNumber = flngItemNumber;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnprs with_flngVer(Integer flngVer) {
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
  public tblnz_rtnprs with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer fblnInError;
  public Integer get_fblnInError() {
    return fblnInError;
  }
  public void set_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
  }
  public tblnz_rtnprs with_fblnInError(Integer fblnInError) {
    this.fblnInError = fblnInError;
    return this;
  }
  private String fstrEmployerIRD;
  public String get_fstrEmployerIRD() {
    return fstrEmployerIRD;
  }
  public void set_fstrEmployerIRD(String fstrEmployerIRD) {
    this.fstrEmployerIRD = fstrEmployerIRD;
  }
  public tblnz_rtnprs with_fstrEmployerIRD(String fstrEmployerIRD) {
    this.fstrEmployerIRD = fstrEmployerIRD;
    return this;
  }
  private String fstrEmployerName;
  public String get_fstrEmployerName() {
    return fstrEmployerName;
  }
  public void set_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
  }
  public tblnz_rtnprs with_fstrEmployerName(String fstrEmployerName) {
    this.fstrEmployerName = fstrEmployerName;
    return this;
  }
  private String fstrEmployeeIRD;
  public String get_fstrEmployeeIRD() {
    return fstrEmployeeIRD;
  }
  public void set_fstrEmployeeIRD(String fstrEmployeeIRD) {
    this.fstrEmployeeIRD = fstrEmployeeIRD;
  }
  public tblnz_rtnprs with_fstrEmployeeIRD(String fstrEmployeeIRD) {
    this.fstrEmployeeIRD = fstrEmployeeIRD;
    return this;
  }
  private String fstrEmployeeName;
  public String get_fstrEmployeeName() {
    return fstrEmployeeName;
  }
  public void set_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
  }
  public tblnz_rtnprs with_fstrEmployeeName(String fstrEmployeeName) {
    this.fstrEmployeeName = fstrEmployeeName;
    return this;
  }
  private Integer flngTimesPaid;
  public Integer get_flngTimesPaid() {
    return flngTimesPaid;
  }
  public void set_flngTimesPaid(Integer flngTimesPaid) {
    this.flngTimesPaid = flngTimesPaid;
  }
  public tblnz_rtnprs with_flngTimesPaid(Integer flngTimesPaid) {
    this.flngTimesPaid = flngTimesPaid;
    return this;
  }
  private Integer fblnOverrideValidation;
  public Integer get_fblnOverrideValidation() {
    return fblnOverrideValidation;
  }
  public void set_fblnOverrideValidation(Integer fblnOverrideValidation) {
    this.fblnOverrideValidation = fblnOverrideValidation;
  }
  public tblnz_rtnprs with_fblnOverrideValidation(Integer fblnOverrideValidation) {
    this.fblnOverrideValidation = fblnOverrideValidation;
    return this;
  }
  private Integer fblnInvalidFilingHistory;
  public Integer get_fblnInvalidFilingHistory() {
    return fblnInvalidFilingHistory;
  }
  public void set_fblnInvalidFilingHistory(Integer fblnInvalidFilingHistory) {
    this.fblnInvalidFilingHistory = fblnInvalidFilingHistory;
  }
  public tblnz_rtnprs with_fblnInvalidFilingHistory(Integer fblnInvalidFilingHistory) {
    this.fblnInvalidFilingHistory = fblnInvalidFilingHistory;
    return this;
  }
  private Integer fblnDuplicate;
  public Integer get_fblnDuplicate() {
    return fblnDuplicate;
  }
  public void set_fblnDuplicate(Integer fblnDuplicate) {
    this.fblnDuplicate = fblnDuplicate;
  }
  public tblnz_rtnprs with_fblnDuplicate(Integer fblnDuplicate) {
    this.fblnDuplicate = fblnDuplicate;
    return this;
  }
  private Integer fblnInvalidNumberEmployees;
  public Integer get_fblnInvalidNumberEmployees() {
    return fblnInvalidNumberEmployees;
  }
  public void set_fblnInvalidNumberEmployees(Integer fblnInvalidNumberEmployees) {
    this.fblnInvalidNumberEmployees = fblnInvalidNumberEmployees;
  }
  public tblnz_rtnprs with_fblnInvalidNumberEmployees(Integer fblnInvalidNumberEmployees) {
    this.fblnInvalidNumberEmployees = fblnInvalidNumberEmployees;
    return this;
  }
  private Integer fblnNoPILink;
  public Integer get_fblnNoPILink() {
    return fblnNoPILink;
  }
  public void set_fblnNoPILink(Integer fblnNoPILink) {
    this.fblnNoPILink = fblnNoPILink;
  }
  public tblnz_rtnprs with_fblnNoPILink(Integer fblnNoPILink) {
    this.fblnNoPILink = fblnNoPILink;
    return this;
  }
  private Integer fblnNoReturn;
  public Integer get_fblnNoReturn() {
    return fblnNoReturn;
  }
  public void set_fblnNoReturn(Integer fblnNoReturn) {
    this.fblnNoReturn = fblnNoReturn;
  }
  public tblnz_rtnprs with_fblnNoReturn(Integer fblnNoReturn) {
    this.fblnNoReturn = fblnNoReturn;
    return this;
  }
  private Integer fblnNoPayment;
  public Integer get_fblnNoPayment() {
    return fblnNoPayment;
  }
  public void set_fblnNoPayment(Integer fblnNoPayment) {
    this.fblnNoPayment = fblnNoPayment;
  }
  public tblnz_rtnprs with_fblnNoPayment(Integer fblnNoPayment) {
    this.fblnNoPayment = fblnNoPayment;
    return this;
  }
  private Integer fblnLateReturn;
  public Integer get_fblnLateReturn() {
    return fblnLateReturn;
  }
  public void set_fblnLateReturn(Integer fblnLateReturn) {
    this.fblnLateReturn = fblnLateReturn;
  }
  public tblnz_rtnprs with_fblnLateReturn(Integer fblnLateReturn) {
    this.fblnLateReturn = fblnLateReturn;
    return this;
  }
  private Integer fblnLargeEmployer;
  public Integer get_fblnLargeEmployer() {
    return fblnLargeEmployer;
  }
  public void set_fblnLargeEmployer(Integer fblnLargeEmployer) {
    this.fblnLargeEmployer = fblnLargeEmployer;
  }
  public tblnz_rtnprs with_fblnLargeEmployer(Integer fblnLargeEmployer) {
    this.fblnLargeEmployer = fblnLargeEmployer;
    return this;
  }
  private java.sql.Timestamp fdtmDeleted;
  public java.sql.Timestamp get_fdtmDeleted() {
    return fdtmDeleted;
  }
  public void set_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
  }
  public tblnz_rtnprs with_fdtmDeleted(java.sql.Timestamp fdtmDeleted) {
    this.fdtmDeleted = fdtmDeleted;
    return this;
  }
  private java.sql.Timestamp fdtmProcessed;
  public java.sql.Timestamp get_fdtmProcessed() {
    return fdtmProcessed;
  }
  public void set_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
  }
  public tblnz_rtnprs with_fdtmProcessed(java.sql.Timestamp fdtmProcessed) {
    this.fdtmProcessed = fdtmProcessed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnprs with_fstrWho(String fstrWho) {
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
  public tblnz_rtnprs with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnprs)) {
      return false;
    }
    tblnz_rtnprs that = (tblnz_rtnprs) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrEmployeeIRD == null ? that.fstrEmployeeIRD == null : this.fstrEmployeeIRD.equals(that.fstrEmployeeIRD));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.flngTimesPaid == null ? that.flngTimesPaid == null : this.flngTimesPaid.equals(that.flngTimesPaid));
    equal = equal && (this.fblnOverrideValidation == null ? that.fblnOverrideValidation == null : this.fblnOverrideValidation.equals(that.fblnOverrideValidation));
    equal = equal && (this.fblnInvalidFilingHistory == null ? that.fblnInvalidFilingHistory == null : this.fblnInvalidFilingHistory.equals(that.fblnInvalidFilingHistory));
    equal = equal && (this.fblnDuplicate == null ? that.fblnDuplicate == null : this.fblnDuplicate.equals(that.fblnDuplicate));
    equal = equal && (this.fblnInvalidNumberEmployees == null ? that.fblnInvalidNumberEmployees == null : this.fblnInvalidNumberEmployees.equals(that.fblnInvalidNumberEmployees));
    equal = equal && (this.fblnNoPILink == null ? that.fblnNoPILink == null : this.fblnNoPILink.equals(that.fblnNoPILink));
    equal = equal && (this.fblnNoReturn == null ? that.fblnNoReturn == null : this.fblnNoReturn.equals(that.fblnNoReturn));
    equal = equal && (this.fblnNoPayment == null ? that.fblnNoPayment == null : this.fblnNoPayment.equals(that.fblnNoPayment));
    equal = equal && (this.fblnLateReturn == null ? that.fblnLateReturn == null : this.fblnLateReturn.equals(that.fblnLateReturn));
    equal = equal && (this.fblnLargeEmployer == null ? that.fblnLargeEmployer == null : this.fblnLargeEmployer.equals(that.fblnLargeEmployer));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnprs)) {
      return false;
    }
    tblnz_rtnprs that = (tblnz_rtnprs) o;
    boolean equal = true;
    equal = equal && (this.flngReturnKey == null ? that.flngReturnKey == null : this.flngReturnKey.equals(that.flngReturnKey));
    equal = equal && (this.flngItemNumber == null ? that.flngItemNumber == null : this.flngItemNumber.equals(that.flngItemNumber));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fblnInError == null ? that.fblnInError == null : this.fblnInError.equals(that.fblnInError));
    equal = equal && (this.fstrEmployerIRD == null ? that.fstrEmployerIRD == null : this.fstrEmployerIRD.equals(that.fstrEmployerIRD));
    equal = equal && (this.fstrEmployerName == null ? that.fstrEmployerName == null : this.fstrEmployerName.equals(that.fstrEmployerName));
    equal = equal && (this.fstrEmployeeIRD == null ? that.fstrEmployeeIRD == null : this.fstrEmployeeIRD.equals(that.fstrEmployeeIRD));
    equal = equal && (this.fstrEmployeeName == null ? that.fstrEmployeeName == null : this.fstrEmployeeName.equals(that.fstrEmployeeName));
    equal = equal && (this.flngTimesPaid == null ? that.flngTimesPaid == null : this.flngTimesPaid.equals(that.flngTimesPaid));
    equal = equal && (this.fblnOverrideValidation == null ? that.fblnOverrideValidation == null : this.fblnOverrideValidation.equals(that.fblnOverrideValidation));
    equal = equal && (this.fblnInvalidFilingHistory == null ? that.fblnInvalidFilingHistory == null : this.fblnInvalidFilingHistory.equals(that.fblnInvalidFilingHistory));
    equal = equal && (this.fblnDuplicate == null ? that.fblnDuplicate == null : this.fblnDuplicate.equals(that.fblnDuplicate));
    equal = equal && (this.fblnInvalidNumberEmployees == null ? that.fblnInvalidNumberEmployees == null : this.fblnInvalidNumberEmployees.equals(that.fblnInvalidNumberEmployees));
    equal = equal && (this.fblnNoPILink == null ? that.fblnNoPILink == null : this.fblnNoPILink.equals(that.fblnNoPILink));
    equal = equal && (this.fblnNoReturn == null ? that.fblnNoReturn == null : this.fblnNoReturn.equals(that.fblnNoReturn));
    equal = equal && (this.fblnNoPayment == null ? that.fblnNoPayment == null : this.fblnNoPayment.equals(that.fblnNoPayment));
    equal = equal && (this.fblnLateReturn == null ? that.fblnLateReturn == null : this.fblnLateReturn.equals(that.fblnLateReturn));
    equal = equal && (this.fblnLargeEmployer == null ? that.fblnLargeEmployer == null : this.fblnLargeEmployer.equals(that.fblnLargeEmployer));
    equal = equal && (this.fdtmDeleted == null ? that.fdtmDeleted == null : this.fdtmDeleted.equals(that.fdtmDeleted));
    equal = equal && (this.fdtmProcessed == null ? that.fdtmProcessed == null : this.fdtmProcessed.equals(that.fdtmProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployeeIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(9, __dbResults);
    this.flngTimesPaid = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnOverrideValidation = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnInvalidFilingHistory = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnDuplicate = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnInvalidNumberEmployees = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnNoPILink = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnNoReturn = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnNoPayment = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnLateReturn = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnLargeEmployer = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngReturnKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngItemNumber = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnInError = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrEmployerIRD = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrEmployerName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrEmployeeIRD = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrEmployeeName = JdbcWritableBridge.readString(9, __dbResults);
    this.flngTimesPaid = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnOverrideValidation = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnInvalidFilingHistory = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnDuplicate = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnInvalidNumberEmployees = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnNoPILink = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnNoReturn = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnNoPayment = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnLateReturn = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnLargeEmployer = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fdtmDeleted = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fdtmProcessed = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(22, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(23, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTimesPaid, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideValidation, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvalidFilingHistory, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicate, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvalidNumberEmployees, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoPILink, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoReturn, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoPayment, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLateReturn, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLargeEmployer, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngReturnKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngItemNumber, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInError, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerIRD, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeIRD, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployeeName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTimesPaid, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideValidation, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvalidFilingHistory, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplicate, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInvalidNumberEmployees, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoPILink, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoReturn, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNoPayment, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLateReturn, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLargeEmployer, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDeleted, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessed, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 23 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngReturnKey = null;
    } else {
    this.flngReturnKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngItemNumber = null;
    } else {
    this.flngItemNumber = Integer.valueOf(__dataIn.readInt());
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
        this.fblnInError = null;
    } else {
    this.fblnInError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerIRD = null;
    } else {
    this.fstrEmployerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerName = null;
    } else {
    this.fstrEmployerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeIRD = null;
    } else {
    this.fstrEmployeeIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployeeName = null;
    } else {
    this.fstrEmployeeName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTimesPaid = null;
    } else {
    this.flngTimesPaid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverrideValidation = null;
    } else {
    this.fblnOverrideValidation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInvalidFilingHistory = null;
    } else {
    this.fblnInvalidFilingHistory = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDuplicate = null;
    } else {
    this.fblnDuplicate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInvalidNumberEmployees = null;
    } else {
    this.fblnInvalidNumberEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNoPILink = null;
    } else {
    this.fblnNoPILink = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNoReturn = null;
    } else {
    this.fblnNoReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNoPayment = null;
    } else {
    this.fblnNoPayment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLateReturn = null;
    } else {
    this.fblnLateReturn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLargeEmployer = null;
    } else {
    this.fblnLargeEmployer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDeleted = null;
    } else {
    this.fdtmDeleted = new Timestamp(__dataIn.readLong());
    this.fdtmDeleted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessed = null;
    } else {
    this.fdtmProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmProcessed.setNanos(__dataIn.readInt());
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
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
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fstrEmployerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRD);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fstrEmployeeIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeIRD);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.flngTimesPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTimesPaid);
    }
    if (null == this.fblnOverrideValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideValidation);
    }
    if (null == this.fblnInvalidFilingHistory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvalidFilingHistory);
    }
    if (null == this.fblnDuplicate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicate);
    }
    if (null == this.fblnInvalidNumberEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvalidNumberEmployees);
    }
    if (null == this.fblnNoPILink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoPILink);
    }
    if (null == this.fblnNoReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoReturn);
    }
    if (null == this.fblnNoPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoPayment);
    }
    if (null == this.fblnLateReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLateReturn);
    }
    if (null == this.fblnLargeEmployer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLargeEmployer);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
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
    if (null == this.flngReturnKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReturnKey);
    }
    if (null == this.flngItemNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngItemNumber);
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
    if (null == this.fblnInError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInError);
    }
    if (null == this.fstrEmployerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerIRD);
    }
    if (null == this.fstrEmployerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerName);
    }
    if (null == this.fstrEmployeeIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeIRD);
    }
    if (null == this.fstrEmployeeName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployeeName);
    }
    if (null == this.flngTimesPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTimesPaid);
    }
    if (null == this.fblnOverrideValidation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideValidation);
    }
    if (null == this.fblnInvalidFilingHistory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvalidFilingHistory);
    }
    if (null == this.fblnDuplicate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplicate);
    }
    if (null == this.fblnInvalidNumberEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInvalidNumberEmployees);
    }
    if (null == this.fblnNoPILink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoPILink);
    }
    if (null == this.fblnNoReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoReturn);
    }
    if (null == this.fblnNoPayment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNoPayment);
    }
    if (null == this.fblnLateReturn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLateReturn);
    }
    if (null == this.fblnLargeEmployer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLargeEmployer);
    }
    if (null == this.fdtmDeleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDeleted.getTime());
    __dataOut.writeInt(this.fdtmDeleted.getNanos());
    }
    if (null == this.fdtmProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessed.getTime());
    __dataOut.writeInt(this.fdtmProcessed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeIRD==null?"\\N":fstrEmployeeIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTimesPaid==null?"\\N":"" + flngTimesPaid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideValidation==null?"\\N":"" + fblnOverrideValidation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvalidFilingHistory==null?"\\N":"" + fblnInvalidFilingHistory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicate==null?"\\N":"" + fblnDuplicate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvalidNumberEmployees==null?"\\N":"" + fblnInvalidNumberEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoPILink==null?"\\N":"" + fblnNoPILink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoReturn==null?"\\N":"" + fblnNoReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoPayment==null?"\\N":"" + fblnNoPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLateReturn==null?"\\N":"" + fblnLateReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLargeEmployer==null?"\\N":"" + fblnLargeEmployer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngReturnKey==null?"\\N":"" + flngReturnKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngItemNumber==null?"\\N":"" + flngItemNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInError==null?"\\N":"" + fblnInError, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerIRD==null?"\\N":fstrEmployerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerName==null?"\\N":fstrEmployerName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeIRD==null?"\\N":fstrEmployeeIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployeeName==null?"\\N":fstrEmployeeName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTimesPaid==null?"\\N":"" + flngTimesPaid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideValidation==null?"\\N":"" + fblnOverrideValidation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvalidFilingHistory==null?"\\N":"" + fblnInvalidFilingHistory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplicate==null?"\\N":"" + fblnDuplicate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInvalidNumberEmployees==null?"\\N":"" + fblnInvalidNumberEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoPILink==null?"\\N":"" + fblnNoPILink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoReturn==null?"\\N":"" + fblnNoReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNoPayment==null?"\\N":"" + fblnNoPayment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLateReturn==null?"\\N":"" + fblnLateReturn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLargeEmployer==null?"\\N":"" + fblnLargeEmployer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDeleted==null?"\\N":"" + fdtmDeleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessed==null?"\\N":"" + fdtmProcessed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRD = null; } else {
      this.fstrEmployerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeIRD = null; } else {
      this.fstrEmployeeIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTimesPaid = null; } else {
      this.flngTimesPaid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideValidation = null; } else {
      this.fblnOverrideValidation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvalidFilingHistory = null; } else {
      this.fblnInvalidFilingHistory = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicate = null; } else {
      this.fblnDuplicate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvalidNumberEmployees = null; } else {
      this.fblnInvalidNumberEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoPILink = null; } else {
      this.fblnNoPILink = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoReturn = null; } else {
      this.fblnNoReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoPayment = null; } else {
      this.fblnNoPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLateReturn = null; } else {
      this.fblnLateReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLargeEmployer = null; } else {
      this.fblnLargeEmployer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReturnKey = null; } else {
      this.flngReturnKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngItemNumber = null; } else {
      this.flngItemNumber = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInError = null; } else {
      this.fblnInError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerIRD = null; } else {
      this.fstrEmployerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerName = null; } else {
      this.fstrEmployerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeIRD = null; } else {
      this.fstrEmployeeIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployeeName = null; } else {
      this.fstrEmployeeName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTimesPaid = null; } else {
      this.flngTimesPaid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideValidation = null; } else {
      this.fblnOverrideValidation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvalidFilingHistory = null; } else {
      this.fblnInvalidFilingHistory = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplicate = null; } else {
      this.fblnDuplicate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInvalidNumberEmployees = null; } else {
      this.fblnInvalidNumberEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoPILink = null; } else {
      this.fblnNoPILink = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoReturn = null; } else {
      this.fblnNoReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNoPayment = null; } else {
      this.fblnNoPayment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLateReturn = null; } else {
      this.fblnLateReturn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLargeEmployer = null; } else {
      this.fblnLargeEmployer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDeleted = null; } else {
      this.fdtmDeleted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessed = null; } else {
      this.fdtmProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_rtnprs o = (tblnz_rtnprs) super.clone();
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnprs o) throws CloneNotSupportedException {
    o.fdtmDeleted = (o.fdtmDeleted != null) ? (java.sql.Timestamp) o.fdtmDeleted.clone() : null;
    o.fdtmProcessed = (o.fdtmProcessed != null) ? (java.sql.Timestamp) o.fdtmProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fstrEmployeeIRD", this.fstrEmployeeIRD);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("flngTimesPaid", this.flngTimesPaid);
    __sqoop$field_map.put("fblnOverrideValidation", this.fblnOverrideValidation);
    __sqoop$field_map.put("fblnInvalidFilingHistory", this.fblnInvalidFilingHistory);
    __sqoop$field_map.put("fblnDuplicate", this.fblnDuplicate);
    __sqoop$field_map.put("fblnInvalidNumberEmployees", this.fblnInvalidNumberEmployees);
    __sqoop$field_map.put("fblnNoPILink", this.fblnNoPILink);
    __sqoop$field_map.put("fblnNoReturn", this.fblnNoReturn);
    __sqoop$field_map.put("fblnNoPayment", this.fblnNoPayment);
    __sqoop$field_map.put("fblnLateReturn", this.fblnLateReturn);
    __sqoop$field_map.put("fblnLargeEmployer", this.fblnLargeEmployer);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngReturnKey", this.flngReturnKey);
    __sqoop$field_map.put("flngItemNumber", this.flngItemNumber);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fblnInError", this.fblnInError);
    __sqoop$field_map.put("fstrEmployerIRD", this.fstrEmployerIRD);
    __sqoop$field_map.put("fstrEmployerName", this.fstrEmployerName);
    __sqoop$field_map.put("fstrEmployeeIRD", this.fstrEmployeeIRD);
    __sqoop$field_map.put("fstrEmployeeName", this.fstrEmployeeName);
    __sqoop$field_map.put("flngTimesPaid", this.flngTimesPaid);
    __sqoop$field_map.put("fblnOverrideValidation", this.fblnOverrideValidation);
    __sqoop$field_map.put("fblnInvalidFilingHistory", this.fblnInvalidFilingHistory);
    __sqoop$field_map.put("fblnDuplicate", this.fblnDuplicate);
    __sqoop$field_map.put("fblnInvalidNumberEmployees", this.fblnInvalidNumberEmployees);
    __sqoop$field_map.put("fblnNoPILink", this.fblnNoPILink);
    __sqoop$field_map.put("fblnNoReturn", this.fblnNoReturn);
    __sqoop$field_map.put("fblnNoPayment", this.fblnNoPayment);
    __sqoop$field_map.put("fblnLateReturn", this.fblnLateReturn);
    __sqoop$field_map.put("fblnLargeEmployer", this.fblnLargeEmployer);
    __sqoop$field_map.put("fdtmDeleted", this.fdtmDeleted);
    __sqoop$field_map.put("fdtmProcessed", this.fdtmProcessed);
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
