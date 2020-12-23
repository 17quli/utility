// ORM class for table 'tblnz_lnkksfadm'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:22:19 NZDT 2020
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

public class tblnz_lnkksfadm extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrContactName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrContactName = (String)value;
      }
    });
    setters.put("fstrContactEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrContactEmail = (String)value;
      }
    });
    setters.put("fstrPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrPhoneNumber = (String)value;
      }
    });
    setters.put("fstrPhoneNumber2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrPhoneNumber2 = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fblnOverridden", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fblnOverridden = (Integer)value;
      }
    });
    setters.put("fstrRowID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrRowID = (String)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrSuburb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrSuburb = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fblnVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fblnVerified = (Integer)value;
      }
    });
    setters.put("fdtmVerifiredDt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fdtmVerifiredDt = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_lnkksfadm.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_lnkksfadm() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_lnkksfadm with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrContactName;
  public String get_fstrContactName() {
    return fstrContactName;
  }
  public void set_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
  }
  public tblnz_lnkksfadm with_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
    return this;
  }
  private String fstrContactEmail;
  public String get_fstrContactEmail() {
    return fstrContactEmail;
  }
  public void set_fstrContactEmail(String fstrContactEmail) {
    this.fstrContactEmail = fstrContactEmail;
  }
  public tblnz_lnkksfadm with_fstrContactEmail(String fstrContactEmail) {
    this.fstrContactEmail = fstrContactEmail;
    return this;
  }
  private String fstrPhoneNumber;
  public String get_fstrPhoneNumber() {
    return fstrPhoneNumber;
  }
  public void set_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
  }
  public tblnz_lnkksfadm with_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
    return this;
  }
  private String fstrPhoneNumber2;
  public String get_fstrPhoneNumber2() {
    return fstrPhoneNumber2;
  }
  public void set_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
  }
  public tblnz_lnkksfadm with_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
    return this;
  }
  private String fstrAttention;
  public String get_fstrAttention() {
    return fstrAttention;
  }
  public void set_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
  }
  public tblnz_lnkksfadm with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblnz_lnkksfadm with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrDistrict;
  public String get_fstrDistrict() {
    return fstrDistrict;
  }
  public void set_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
  }
  public tblnz_lnkksfadm with_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
    return this;
  }
  private Integer fblnOverridden;
  public Integer get_fblnOverridden() {
    return fblnOverridden;
  }
  public void set_fblnOverridden(Integer fblnOverridden) {
    this.fblnOverridden = fblnOverridden;
  }
  public tblnz_lnkksfadm with_fblnOverridden(Integer fblnOverridden) {
    this.fblnOverridden = fblnOverridden;
    return this;
  }
  private String fstrRowID;
  public String get_fstrRowID() {
    return fstrRowID;
  }
  public void set_fstrRowID(String fstrRowID) {
    this.fstrRowID = fstrRowID;
  }
  public tblnz_lnkksfadm with_fstrRowID(String fstrRowID) {
    this.fstrRowID = fstrRowID;
    return this;
  }
  private String fstrStreet;
  public String get_fstrStreet() {
    return fstrStreet;
  }
  public void set_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
  }
  public tblnz_lnkksfadm with_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
    return this;
  }
  private String fstrSubDistrict;
  public String get_fstrSubDistrict() {
    return fstrSubDistrict;
  }
  public void set_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
  }
  public tblnz_lnkksfadm with_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
    return this;
  }
  private String fstrSubProvince;
  public String get_fstrSubProvince() {
    return fstrSubProvince;
  }
  public void set_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
  }
  public tblnz_lnkksfadm with_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
    return this;
  }
  private String fstrSuburb;
  public String get_fstrSuburb() {
    return fstrSuburb;
  }
  public void set_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
  }
  public tblnz_lnkksfadm with_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
    return this;
  }
  private String fstrUnit;
  public String get_fstrUnit() {
    return fstrUnit;
  }
  public void set_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
  }
  public tblnz_lnkksfadm with_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tblnz_lnkksfadm with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private Integer fblnVerified;
  public Integer get_fblnVerified() {
    return fblnVerified;
  }
  public void set_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
  }
  public tblnz_lnkksfadm with_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
    return this;
  }
  private java.sql.Timestamp fdtmVerifiredDt;
  public java.sql.Timestamp get_fdtmVerifiredDt() {
    return fdtmVerifiredDt;
  }
  public void set_fdtmVerifiredDt(java.sql.Timestamp fdtmVerifiredDt) {
    this.fdtmVerifiredDt = fdtmVerifiredDt;
  }
  public tblnz_lnkksfadm with_fdtmVerifiredDt(java.sql.Timestamp fdtmVerifiredDt) {
    this.fdtmVerifiredDt = fdtmVerifiredDt;
    return this;
  }
  private String fstrZip;
  public String get_fstrZip() {
    return fstrZip;
  }
  public void set_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
  }
  public tblnz_lnkksfadm with_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_lnkksfadm with_fstrWho(String fstrWho) {
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
  public tblnz_lnkksfadm with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_lnkksfadm)) {
      return false;
    }
    tblnz_lnkksfadm that = (tblnz_lnkksfadm) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrContactEmail == null ? that.fstrContactEmail == null : this.fstrContactEmail.equals(that.fstrContactEmail));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fblnOverridden == null ? that.fblnOverridden == null : this.fblnOverridden.equals(that.fblnOverridden));
    equal = equal && (this.fstrRowID == null ? that.fstrRowID == null : this.fstrRowID.equals(that.fstrRowID));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerifiredDt == null ? that.fdtmVerifiredDt == null : this.fdtmVerifiredDt.equals(that.fdtmVerifiredDt));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_lnkksfadm)) {
      return false;
    }
    tblnz_lnkksfadm that = (tblnz_lnkksfadm) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrContactEmail == null ? that.fstrContactEmail == null : this.fstrContactEmail.equals(that.fstrContactEmail));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fblnOverridden == null ? that.fblnOverridden == null : this.fblnOverridden.equals(that.fblnOverridden));
    equal = equal && (this.fstrRowID == null ? that.fstrRowID == null : this.fstrRowID.equals(that.fstrRowID));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerifiredDt == null ? that.fdtmVerifiredDt == null : this.fdtmVerifiredDt.equals(that.fdtmVerifiredDt));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrContactEmail = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnOverridden = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrRowID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmVerifiredDt = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrContactEmail = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(8, __dbResults);
    this.fblnOverridden = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrRowID = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(16, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmVerifiredDt = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactEmail, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridden, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerifiredDt, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactEmail, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverridden, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowID, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerifiredDt, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactName = null;
    } else {
    this.fstrContactName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactEmail = null;
    } else {
    this.fstrContactEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber = null;
    } else {
    this.fstrPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber2 = null;
    } else {
    this.fstrPhoneNumber2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttention = null;
    } else {
    this.fstrAttention = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrict = null;
    } else {
    this.fstrDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverridden = null;
    } else {
    this.fblnOverridden = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRowID = null;
    } else {
    this.fstrRowID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet = null;
    } else {
    this.fstrStreet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubDistrict = null;
    } else {
    this.fstrSubDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubProvince = null;
    } else {
    this.fstrSubProvince = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSuburb = null;
    } else {
    this.fstrSuburb = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnit = null;
    } else {
    this.fstrUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVerified = null;
    } else {
    this.fblnVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVerifiredDt = null;
    } else {
    this.fdtmVerifiredDt = new Timestamp(__dataIn.readLong());
    this.fdtmVerifiredDt.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZip = null;
    } else {
    this.fstrZip = Text.readString(__dataIn);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrContactEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactEmail);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fblnOverridden) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridden);
    }
    if (null == this.fstrRowID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowID);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerifiredDt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerifiredDt.getTime());
    __dataOut.writeInt(this.fdtmVerifiredDt.getNanos());
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrContactEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactEmail);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fblnOverridden) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverridden);
    }
    if (null == this.fstrRowID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowID);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerifiredDt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerifiredDt.getTime());
    __dataOut.writeInt(this.fdtmVerifiredDt.getNanos());
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactEmail==null?"\\N":fstrContactEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridden==null?"\\N":"" + fblnOverridden, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowID==null?"\\N":fstrRowID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerifiredDt==null?"\\N":"" + fdtmVerifiredDt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactEmail==null?"\\N":fstrContactEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverridden==null?"\\N":"" + fblnOverridden, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowID==null?"\\N":fstrRowID, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerifiredDt==null?"\\N":"" + fdtmVerifiredDt, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactEmail = null; } else {
      this.fstrContactEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverridden = null; } else {
      this.fblnOverridden = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRowID = null; } else {
      this.fstrRowID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuburb = null; } else {
      this.fstrSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerifiredDt = null; } else {
      this.fdtmVerifiredDt = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactEmail = null; } else {
      this.fstrContactEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverridden = null; } else {
      this.fblnOverridden = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRowID = null; } else {
      this.fstrRowID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSuburb = null; } else {
      this.fstrSuburb = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerifiredDt = null; } else {
      this.fdtmVerifiredDt = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
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
    tblnz_lnkksfadm o = (tblnz_lnkksfadm) super.clone();
    o.fdtmVerifiredDt = (o.fdtmVerifiredDt != null) ? (java.sql.Timestamp) o.fdtmVerifiredDt.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_lnkksfadm o) throws CloneNotSupportedException {
    o.fdtmVerifiredDt = (o.fdtmVerifiredDt != null) ? (java.sql.Timestamp) o.fdtmVerifiredDt.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrContactEmail", this.fstrContactEmail);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fblnOverridden", this.fblnOverridden);
    __sqoop$field_map.put("fstrRowID", this.fstrRowID);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerifiredDt", this.fdtmVerifiredDt);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrContactEmail", this.fstrContactEmail);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fblnOverridden", this.fblnOverridden);
    __sqoop$field_map.put("fstrRowID", this.fstrRowID);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerifiredDt", this.fdtmVerifiredDt);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
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
