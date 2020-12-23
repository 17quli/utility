// ORM class for table 'tblnz_accksfinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:52:54 NZDT 2020
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

public class tblnz_accksfinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrSchemeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrSchemeType = (String)value;
      }
    });
    setters.put("fstrWebsite", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrWebsite = (String)value;
      }
    });
    setters.put("fstr0800Number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstr0800Number = (String)value;
      }
    });
    setters.put("fblnCheckDefault", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnCheckDefault = (Integer)value;
      }
    });
    setters.put("fblnCheckRestricted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnCheckRestricted = (Integer)value;
      }
    });
    setters.put("fblnCheckWebsite", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnCheckWebsite = (Integer)value;
      }
    });
    setters.put("fstrInvestmentProduct", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrInvestmentProduct = (String)value;
      }
    });
    setters.put("fstrTradingPartner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrTradingPartner = (String)value;
      }
    });
    setters.put("fstrB2BType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrB2BType = (String)value;
      }
    });
    setters.put("flngB2BBatchSize", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.flngB2BBatchSize = (Integer)value;
      }
    });
    setters.put("fblnThrottle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnThrottle = (Integer)value;
      }
    });
    setters.put("flngThrottle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.flngThrottle = (Integer)value;
      }
    });
    setters.put("fblnStopRefunds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnStopRefunds = (Integer)value;
      }
    });
    setters.put("fblnStopAllMessages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fblnStopAllMessages = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accksfinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accksfinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accksfinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrSchemeType;
  public String get_fstrSchemeType() {
    return fstrSchemeType;
  }
  public void set_fstrSchemeType(String fstrSchemeType) {
    this.fstrSchemeType = fstrSchemeType;
  }
  public tblnz_accksfinfo with_fstrSchemeType(String fstrSchemeType) {
    this.fstrSchemeType = fstrSchemeType;
    return this;
  }
  private String fstrWebsite;
  public String get_fstrWebsite() {
    return fstrWebsite;
  }
  public void set_fstrWebsite(String fstrWebsite) {
    this.fstrWebsite = fstrWebsite;
  }
  public tblnz_accksfinfo with_fstrWebsite(String fstrWebsite) {
    this.fstrWebsite = fstrWebsite;
    return this;
  }
  private String fstr0800Number;
  public String get_fstr0800Number() {
    return fstr0800Number;
  }
  public void set_fstr0800Number(String fstr0800Number) {
    this.fstr0800Number = fstr0800Number;
  }
  public tblnz_accksfinfo with_fstr0800Number(String fstr0800Number) {
    this.fstr0800Number = fstr0800Number;
    return this;
  }
  private Integer fblnCheckDefault;
  public Integer get_fblnCheckDefault() {
    return fblnCheckDefault;
  }
  public void set_fblnCheckDefault(Integer fblnCheckDefault) {
    this.fblnCheckDefault = fblnCheckDefault;
  }
  public tblnz_accksfinfo with_fblnCheckDefault(Integer fblnCheckDefault) {
    this.fblnCheckDefault = fblnCheckDefault;
    return this;
  }
  private Integer fblnCheckRestricted;
  public Integer get_fblnCheckRestricted() {
    return fblnCheckRestricted;
  }
  public void set_fblnCheckRestricted(Integer fblnCheckRestricted) {
    this.fblnCheckRestricted = fblnCheckRestricted;
  }
  public tblnz_accksfinfo with_fblnCheckRestricted(Integer fblnCheckRestricted) {
    this.fblnCheckRestricted = fblnCheckRestricted;
    return this;
  }
  private Integer fblnCheckWebsite;
  public Integer get_fblnCheckWebsite() {
    return fblnCheckWebsite;
  }
  public void set_fblnCheckWebsite(Integer fblnCheckWebsite) {
    this.fblnCheckWebsite = fblnCheckWebsite;
  }
  public tblnz_accksfinfo with_fblnCheckWebsite(Integer fblnCheckWebsite) {
    this.fblnCheckWebsite = fblnCheckWebsite;
    return this;
  }
  private String fstrInvestmentProduct;
  public String get_fstrInvestmentProduct() {
    return fstrInvestmentProduct;
  }
  public void set_fstrInvestmentProduct(String fstrInvestmentProduct) {
    this.fstrInvestmentProduct = fstrInvestmentProduct;
  }
  public tblnz_accksfinfo with_fstrInvestmentProduct(String fstrInvestmentProduct) {
    this.fstrInvestmentProduct = fstrInvestmentProduct;
    return this;
  }
  private String fstrTradingPartner;
  public String get_fstrTradingPartner() {
    return fstrTradingPartner;
  }
  public void set_fstrTradingPartner(String fstrTradingPartner) {
    this.fstrTradingPartner = fstrTradingPartner;
  }
  public tblnz_accksfinfo with_fstrTradingPartner(String fstrTradingPartner) {
    this.fstrTradingPartner = fstrTradingPartner;
    return this;
  }
  private String fstrB2BType;
  public String get_fstrB2BType() {
    return fstrB2BType;
  }
  public void set_fstrB2BType(String fstrB2BType) {
    this.fstrB2BType = fstrB2BType;
  }
  public tblnz_accksfinfo with_fstrB2BType(String fstrB2BType) {
    this.fstrB2BType = fstrB2BType;
    return this;
  }
  private Integer flngB2BBatchSize;
  public Integer get_flngB2BBatchSize() {
    return flngB2BBatchSize;
  }
  public void set_flngB2BBatchSize(Integer flngB2BBatchSize) {
    this.flngB2BBatchSize = flngB2BBatchSize;
  }
  public tblnz_accksfinfo with_flngB2BBatchSize(Integer flngB2BBatchSize) {
    this.flngB2BBatchSize = flngB2BBatchSize;
    return this;
  }
  private Integer fblnThrottle;
  public Integer get_fblnThrottle() {
    return fblnThrottle;
  }
  public void set_fblnThrottle(Integer fblnThrottle) {
    this.fblnThrottle = fblnThrottle;
  }
  public tblnz_accksfinfo with_fblnThrottle(Integer fblnThrottle) {
    this.fblnThrottle = fblnThrottle;
    return this;
  }
  private Integer flngThrottle;
  public Integer get_flngThrottle() {
    return flngThrottle;
  }
  public void set_flngThrottle(Integer flngThrottle) {
    this.flngThrottle = flngThrottle;
  }
  public tblnz_accksfinfo with_flngThrottle(Integer flngThrottle) {
    this.flngThrottle = flngThrottle;
    return this;
  }
  private Integer fblnStopRefunds;
  public Integer get_fblnStopRefunds() {
    return fblnStopRefunds;
  }
  public void set_fblnStopRefunds(Integer fblnStopRefunds) {
    this.fblnStopRefunds = fblnStopRefunds;
  }
  public tblnz_accksfinfo with_fblnStopRefunds(Integer fblnStopRefunds) {
    this.fblnStopRefunds = fblnStopRefunds;
    return this;
  }
  private Integer fblnStopAllMessages;
  public Integer get_fblnStopAllMessages() {
    return fblnStopAllMessages;
  }
  public void set_fblnStopAllMessages(Integer fblnStopAllMessages) {
    this.fblnStopAllMessages = fblnStopAllMessages;
  }
  public tblnz_accksfinfo with_fblnStopAllMessages(Integer fblnStopAllMessages) {
    this.fblnStopAllMessages = fblnStopAllMessages;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accksfinfo with_fstrWho(String fstrWho) {
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
  public tblnz_accksfinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accksfinfo)) {
      return false;
    }
    tblnz_accksfinfo that = (tblnz_accksfinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrSchemeType == null ? that.fstrSchemeType == null : this.fstrSchemeType.equals(that.fstrSchemeType));
    equal = equal && (this.fstrWebsite == null ? that.fstrWebsite == null : this.fstrWebsite.equals(that.fstrWebsite));
    equal = equal && (this.fstr0800Number == null ? that.fstr0800Number == null : this.fstr0800Number.equals(that.fstr0800Number));
    equal = equal && (this.fblnCheckDefault == null ? that.fblnCheckDefault == null : this.fblnCheckDefault.equals(that.fblnCheckDefault));
    equal = equal && (this.fblnCheckRestricted == null ? that.fblnCheckRestricted == null : this.fblnCheckRestricted.equals(that.fblnCheckRestricted));
    equal = equal && (this.fblnCheckWebsite == null ? that.fblnCheckWebsite == null : this.fblnCheckWebsite.equals(that.fblnCheckWebsite));
    equal = equal && (this.fstrInvestmentProduct == null ? that.fstrInvestmentProduct == null : this.fstrInvestmentProduct.equals(that.fstrInvestmentProduct));
    equal = equal && (this.fstrTradingPartner == null ? that.fstrTradingPartner == null : this.fstrTradingPartner.equals(that.fstrTradingPartner));
    equal = equal && (this.fstrB2BType == null ? that.fstrB2BType == null : this.fstrB2BType.equals(that.fstrB2BType));
    equal = equal && (this.flngB2BBatchSize == null ? that.flngB2BBatchSize == null : this.flngB2BBatchSize.equals(that.flngB2BBatchSize));
    equal = equal && (this.fblnThrottle == null ? that.fblnThrottle == null : this.fblnThrottle.equals(that.fblnThrottle));
    equal = equal && (this.flngThrottle == null ? that.flngThrottle == null : this.flngThrottle.equals(that.flngThrottle));
    equal = equal && (this.fblnStopRefunds == null ? that.fblnStopRefunds == null : this.fblnStopRefunds.equals(that.fblnStopRefunds));
    equal = equal && (this.fblnStopAllMessages == null ? that.fblnStopAllMessages == null : this.fblnStopAllMessages.equals(that.fblnStopAllMessages));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accksfinfo)) {
      return false;
    }
    tblnz_accksfinfo that = (tblnz_accksfinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrSchemeType == null ? that.fstrSchemeType == null : this.fstrSchemeType.equals(that.fstrSchemeType));
    equal = equal && (this.fstrWebsite == null ? that.fstrWebsite == null : this.fstrWebsite.equals(that.fstrWebsite));
    equal = equal && (this.fstr0800Number == null ? that.fstr0800Number == null : this.fstr0800Number.equals(that.fstr0800Number));
    equal = equal && (this.fblnCheckDefault == null ? that.fblnCheckDefault == null : this.fblnCheckDefault.equals(that.fblnCheckDefault));
    equal = equal && (this.fblnCheckRestricted == null ? that.fblnCheckRestricted == null : this.fblnCheckRestricted.equals(that.fblnCheckRestricted));
    equal = equal && (this.fblnCheckWebsite == null ? that.fblnCheckWebsite == null : this.fblnCheckWebsite.equals(that.fblnCheckWebsite));
    equal = equal && (this.fstrInvestmentProduct == null ? that.fstrInvestmentProduct == null : this.fstrInvestmentProduct.equals(that.fstrInvestmentProduct));
    equal = equal && (this.fstrTradingPartner == null ? that.fstrTradingPartner == null : this.fstrTradingPartner.equals(that.fstrTradingPartner));
    equal = equal && (this.fstrB2BType == null ? that.fstrB2BType == null : this.fstrB2BType.equals(that.fstrB2BType));
    equal = equal && (this.flngB2BBatchSize == null ? that.flngB2BBatchSize == null : this.flngB2BBatchSize.equals(that.flngB2BBatchSize));
    equal = equal && (this.fblnThrottle == null ? that.fblnThrottle == null : this.fblnThrottle.equals(that.fblnThrottle));
    equal = equal && (this.flngThrottle == null ? that.flngThrottle == null : this.flngThrottle.equals(that.flngThrottle));
    equal = equal && (this.fblnStopRefunds == null ? that.fblnStopRefunds == null : this.fblnStopRefunds.equals(that.fblnStopRefunds));
    equal = equal && (this.fblnStopAllMessages == null ? that.fblnStopAllMessages == null : this.fblnStopAllMessages.equals(that.fblnStopAllMessages));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrSchemeType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrWebsite = JdbcWritableBridge.readString(3, __dbResults);
    this.fstr0800Number = JdbcWritableBridge.readString(4, __dbResults);
    this.fblnCheckDefault = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnCheckRestricted = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnCheckWebsite = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrInvestmentProduct = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrTradingPartner = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrB2BType = JdbcWritableBridge.readString(10, __dbResults);
    this.flngB2BBatchSize = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnThrottle = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngThrottle = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnStopRefunds = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnStopAllMessages = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrSchemeType = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrWebsite = JdbcWritableBridge.readString(3, __dbResults);
    this.fstr0800Number = JdbcWritableBridge.readString(4, __dbResults);
    this.fblnCheckDefault = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnCheckRestricted = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnCheckWebsite = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrInvestmentProduct = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrTradingPartner = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrB2BType = JdbcWritableBridge.readString(10, __dbResults);
    this.flngB2BBatchSize = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnThrottle = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngThrottle = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnStopRefunds = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnStopAllMessages = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeString(fstrSchemeType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebsite, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstr0800Number, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckDefault, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckRestricted, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckWebsite, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestmentProduct, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTradingPartner, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngB2BBatchSize, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnThrottle, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngThrottle, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStopRefunds, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStopAllMessages, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSchemeType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWebsite, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstr0800Number, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckDefault, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckRestricted, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCheckWebsite, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrInvestmentProduct, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTradingPartner, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrB2BType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngB2BBatchSize, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnThrottle, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngThrottle, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStopRefunds, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnStopAllMessages, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
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
        this.fstrSchemeType = null;
    } else {
    this.fstrSchemeType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWebsite = null;
    } else {
    this.fstrWebsite = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstr0800Number = null;
    } else {
    this.fstr0800Number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCheckDefault = null;
    } else {
    this.fblnCheckDefault = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCheckRestricted = null;
    } else {
    this.fblnCheckRestricted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCheckWebsite = null;
    } else {
    this.fblnCheckWebsite = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInvestmentProduct = null;
    } else {
    this.fstrInvestmentProduct = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTradingPartner = null;
    } else {
    this.fstrTradingPartner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrB2BType = null;
    } else {
    this.fstrB2BType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngB2BBatchSize = null;
    } else {
    this.flngB2BBatchSize = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnThrottle = null;
    } else {
    this.fblnThrottle = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngThrottle = null;
    } else {
    this.flngThrottle = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnStopRefunds = null;
    } else {
    this.fblnStopRefunds = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnStopAllMessages = null;
    } else {
    this.fblnStopAllMessages = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrSchemeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeType);
    }
    if (null == this.fstrWebsite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebsite);
    }
    if (null == this.fstr0800Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstr0800Number);
    }
    if (null == this.fblnCheckDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckDefault);
    }
    if (null == this.fblnCheckRestricted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckRestricted);
    }
    if (null == this.fblnCheckWebsite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckWebsite);
    }
    if (null == this.fstrInvestmentProduct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestmentProduct);
    }
    if (null == this.fstrTradingPartner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTradingPartner);
    }
    if (null == this.fstrB2BType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BType);
    }
    if (null == this.flngB2BBatchSize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngB2BBatchSize);
    }
    if (null == this.fblnThrottle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnThrottle);
    }
    if (null == this.flngThrottle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngThrottle);
    }
    if (null == this.fblnStopRefunds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStopRefunds);
    }
    if (null == this.fblnStopAllMessages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStopAllMessages);
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
    if (null == this.fstrSchemeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSchemeType);
    }
    if (null == this.fstrWebsite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebsite);
    }
    if (null == this.fstr0800Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstr0800Number);
    }
    if (null == this.fblnCheckDefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckDefault);
    }
    if (null == this.fblnCheckRestricted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckRestricted);
    }
    if (null == this.fblnCheckWebsite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCheckWebsite);
    }
    if (null == this.fstrInvestmentProduct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInvestmentProduct);
    }
    if (null == this.fstrTradingPartner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTradingPartner);
    }
    if (null == this.fstrB2BType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrB2BType);
    }
    if (null == this.flngB2BBatchSize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngB2BBatchSize);
    }
    if (null == this.fblnThrottle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnThrottle);
    }
    if (null == this.flngThrottle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngThrottle);
    }
    if (null == this.fblnStopRefunds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStopRefunds);
    }
    if (null == this.fblnStopAllMessages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnStopAllMessages);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeType==null?"\\N":fstrSchemeType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebsite==null?"\\N":fstrWebsite, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstr0800Number==null?"\\N":fstr0800Number, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckDefault==null?"\\N":"" + fblnCheckDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckRestricted==null?"\\N":"" + fblnCheckRestricted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckWebsite==null?"\\N":"" + fblnCheckWebsite, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestmentProduct==null?"\\N":fstrInvestmentProduct, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTradingPartner==null?"\\N":fstrTradingPartner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BType==null?"\\N":fstrB2BType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngB2BBatchSize==null?"\\N":"" + flngB2BBatchSize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnThrottle==null?"\\N":"" + fblnThrottle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngThrottle==null?"\\N":"" + flngThrottle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStopRefunds==null?"\\N":"" + fblnStopRefunds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStopAllMessages==null?"\\N":"" + fblnStopAllMessages, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSchemeType==null?"\\N":fstrSchemeType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebsite==null?"\\N":fstrWebsite, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstr0800Number==null?"\\N":fstr0800Number, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckDefault==null?"\\N":"" + fblnCheckDefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckRestricted==null?"\\N":"" + fblnCheckRestricted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCheckWebsite==null?"\\N":"" + fblnCheckWebsite, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInvestmentProduct==null?"\\N":fstrInvestmentProduct, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTradingPartner==null?"\\N":fstrTradingPartner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrB2BType==null?"\\N":fstrB2BType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngB2BBatchSize==null?"\\N":"" + flngB2BBatchSize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnThrottle==null?"\\N":"" + fblnThrottle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngThrottle==null?"\\N":"" + flngThrottle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStopRefunds==null?"\\N":"" + fblnStopRefunds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnStopAllMessages==null?"\\N":"" + fblnStopAllMessages, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrSchemeType = null; } else {
      this.fstrSchemeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebsite = null; } else {
      this.fstrWebsite = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstr0800Number = null; } else {
      this.fstr0800Number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckDefault = null; } else {
      this.fblnCheckDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckRestricted = null; } else {
      this.fblnCheckRestricted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckWebsite = null; } else {
      this.fblnCheckWebsite = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestmentProduct = null; } else {
      this.fstrInvestmentProduct = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTradingPartner = null; } else {
      this.fstrTradingPartner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BType = null; } else {
      this.fstrB2BType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngB2BBatchSize = null; } else {
      this.flngB2BBatchSize = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnThrottle = null; } else {
      this.fblnThrottle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngThrottle = null; } else {
      this.flngThrottle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStopRefunds = null; } else {
      this.fblnStopRefunds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStopAllMessages = null; } else {
      this.fblnStopAllMessages = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrSchemeType = null; } else {
      this.fstrSchemeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWebsite = null; } else {
      this.fstrWebsite = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstr0800Number = null; } else {
      this.fstr0800Number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckDefault = null; } else {
      this.fblnCheckDefault = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckRestricted = null; } else {
      this.fblnCheckRestricted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCheckWebsite = null; } else {
      this.fblnCheckWebsite = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInvestmentProduct = null; } else {
      this.fstrInvestmentProduct = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTradingPartner = null; } else {
      this.fstrTradingPartner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrB2BType = null; } else {
      this.fstrB2BType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngB2BBatchSize = null; } else {
      this.flngB2BBatchSize = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnThrottle = null; } else {
      this.fblnThrottle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngThrottle = null; } else {
      this.flngThrottle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStopRefunds = null; } else {
      this.fblnStopRefunds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnStopAllMessages = null; } else {
      this.fblnStopAllMessages = Integer.valueOf(__cur_str);
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
    tblnz_accksfinfo o = (tblnz_accksfinfo) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accksfinfo o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrSchemeType", this.fstrSchemeType);
    __sqoop$field_map.put("fstrWebsite", this.fstrWebsite);
    __sqoop$field_map.put("fstr0800Number", this.fstr0800Number);
    __sqoop$field_map.put("fblnCheckDefault", this.fblnCheckDefault);
    __sqoop$field_map.put("fblnCheckRestricted", this.fblnCheckRestricted);
    __sqoop$field_map.put("fblnCheckWebsite", this.fblnCheckWebsite);
    __sqoop$field_map.put("fstrInvestmentProduct", this.fstrInvestmentProduct);
    __sqoop$field_map.put("fstrTradingPartner", this.fstrTradingPartner);
    __sqoop$field_map.put("fstrB2BType", this.fstrB2BType);
    __sqoop$field_map.put("flngB2BBatchSize", this.flngB2BBatchSize);
    __sqoop$field_map.put("fblnThrottle", this.fblnThrottle);
    __sqoop$field_map.put("flngThrottle", this.flngThrottle);
    __sqoop$field_map.put("fblnStopRefunds", this.fblnStopRefunds);
    __sqoop$field_map.put("fblnStopAllMessages", this.fblnStopAllMessages);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrSchemeType", this.fstrSchemeType);
    __sqoop$field_map.put("fstrWebsite", this.fstrWebsite);
    __sqoop$field_map.put("fstr0800Number", this.fstr0800Number);
    __sqoop$field_map.put("fblnCheckDefault", this.fblnCheckDefault);
    __sqoop$field_map.put("fblnCheckRestricted", this.fblnCheckRestricted);
    __sqoop$field_map.put("fblnCheckWebsite", this.fblnCheckWebsite);
    __sqoop$field_map.put("fstrInvestmentProduct", this.fstrInvestmentProduct);
    __sqoop$field_map.put("fstrTradingPartner", this.fstrTradingPartner);
    __sqoop$field_map.put("fstrB2BType", this.fstrB2BType);
    __sqoop$field_map.put("flngB2BBatchSize", this.flngB2BBatchSize);
    __sqoop$field_map.put("fblnThrottle", this.fblnThrottle);
    __sqoop$field_map.put("flngThrottle", this.flngThrottle);
    __sqoop$field_map.put("fblnStopRefunds", this.fblnStopRefunds);
    __sqoop$field_map.put("fblnStopAllMessages", this.fblnStopAllMessages);
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
