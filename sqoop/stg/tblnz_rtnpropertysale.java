// ORM class for table 'tblnz_rtnpropertysale'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:44:49 NZDT 2020
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

public class tblnz_rtnpropertysale extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnBrightLineTest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fblnBrightLineTest = (Integer)value;
      }
    });
    setters.put("fstrPropertyTitleNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrPropertyTitleNumber = (String)value;
      }
    });
    setters.put("fstrAddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrAddressLine1 = (String)value;
      }
    });
    setters.put("fstrAddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrAddressLine2 = (String)value;
      }
    });
    setters.put("fstrSuburb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrSuburb = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrPostCode = (String)value;
      }
    });
    setters.put("fdtmDateOfPurchase", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fdtmDateOfPurchase = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDateOfSale", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fdtmDateOfSale = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurSalePrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurSalePrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPurchasePrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurPurchasePrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDeductibleCosts", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurDeductibleCosts = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalCosts", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurTotalCosts = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurNetProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdblPercentageOwnership", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fdblPercentageOwnership = (Double)value;
      }
    });
    setters.put("fcurShareOfNetProfitLoss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fcurShareOfNetProfitLoss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnpropertysale.this.fstrWho = (String)value;
      }
    });
  }
  public tblnz_rtnpropertysale() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnpropertysale with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnBrightLineTest;
  public Integer get_fblnBrightLineTest() {
    return fblnBrightLineTest;
  }
  public void set_fblnBrightLineTest(Integer fblnBrightLineTest) {
    this.fblnBrightLineTest = fblnBrightLineTest;
  }
  public tblnz_rtnpropertysale with_fblnBrightLineTest(Integer fblnBrightLineTest) {
    this.fblnBrightLineTest = fblnBrightLineTest;
    return this;
  }
  private String fstrPropertyTitleNumber;
  public String get_fstrPropertyTitleNumber() {
    return fstrPropertyTitleNumber;
  }
  public void set_fstrPropertyTitleNumber(String fstrPropertyTitleNumber) {
    this.fstrPropertyTitleNumber = fstrPropertyTitleNumber;
  }
  public tblnz_rtnpropertysale with_fstrPropertyTitleNumber(String fstrPropertyTitleNumber) {
    this.fstrPropertyTitleNumber = fstrPropertyTitleNumber;
    return this;
  }
  private String fstrAddressLine1;
  public String get_fstrAddressLine1() {
    return fstrAddressLine1;
  }
  public void set_fstrAddressLine1(String fstrAddressLine1) {
    this.fstrAddressLine1 = fstrAddressLine1;
  }
  public tblnz_rtnpropertysale with_fstrAddressLine1(String fstrAddressLine1) {
    this.fstrAddressLine1 = fstrAddressLine1;
    return this;
  }
  private String fstrAddressLine2;
  public String get_fstrAddressLine2() {
    return fstrAddressLine2;
  }
  public void set_fstrAddressLine2(String fstrAddressLine2) {
    this.fstrAddressLine2 = fstrAddressLine2;
  }
  public tblnz_rtnpropertysale with_fstrAddressLine2(String fstrAddressLine2) {
    this.fstrAddressLine2 = fstrAddressLine2;
    return this;
  }
  private String fstrSuburb;
  public String get_fstrSuburb() {
    return fstrSuburb;
  }
  public void set_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
  }
  public tblnz_rtnpropertysale with_fstrSuburb(String fstrSuburb) {
    this.fstrSuburb = fstrSuburb;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblnz_rtnpropertysale with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrPostCode;
  public String get_fstrPostCode() {
    return fstrPostCode;
  }
  public void set_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
  }
  public tblnz_rtnpropertysale with_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
    return this;
  }
  private java.sql.Timestamp fdtmDateOfPurchase;
  public java.sql.Timestamp get_fdtmDateOfPurchase() {
    return fdtmDateOfPurchase;
  }
  public void set_fdtmDateOfPurchase(java.sql.Timestamp fdtmDateOfPurchase) {
    this.fdtmDateOfPurchase = fdtmDateOfPurchase;
  }
  public tblnz_rtnpropertysale with_fdtmDateOfPurchase(java.sql.Timestamp fdtmDateOfPurchase) {
    this.fdtmDateOfPurchase = fdtmDateOfPurchase;
    return this;
  }
  private java.sql.Timestamp fdtmDateOfSale;
  public java.sql.Timestamp get_fdtmDateOfSale() {
    return fdtmDateOfSale;
  }
  public void set_fdtmDateOfSale(java.sql.Timestamp fdtmDateOfSale) {
    this.fdtmDateOfSale = fdtmDateOfSale;
  }
  public tblnz_rtnpropertysale with_fdtmDateOfSale(java.sql.Timestamp fdtmDateOfSale) {
    this.fdtmDateOfSale = fdtmDateOfSale;
    return this;
  }
  private java.math.BigDecimal fcurSalePrice;
  public java.math.BigDecimal get_fcurSalePrice() {
    return fcurSalePrice;
  }
  public void set_fcurSalePrice(java.math.BigDecimal fcurSalePrice) {
    this.fcurSalePrice = fcurSalePrice;
  }
  public tblnz_rtnpropertysale with_fcurSalePrice(java.math.BigDecimal fcurSalePrice) {
    this.fcurSalePrice = fcurSalePrice;
    return this;
  }
  private java.math.BigDecimal fcurPurchasePrice;
  public java.math.BigDecimal get_fcurPurchasePrice() {
    return fcurPurchasePrice;
  }
  public void set_fcurPurchasePrice(java.math.BigDecimal fcurPurchasePrice) {
    this.fcurPurchasePrice = fcurPurchasePrice;
  }
  public tblnz_rtnpropertysale with_fcurPurchasePrice(java.math.BigDecimal fcurPurchasePrice) {
    this.fcurPurchasePrice = fcurPurchasePrice;
    return this;
  }
  private java.math.BigDecimal fcurDeductibleCosts;
  public java.math.BigDecimal get_fcurDeductibleCosts() {
    return fcurDeductibleCosts;
  }
  public void set_fcurDeductibleCosts(java.math.BigDecimal fcurDeductibleCosts) {
    this.fcurDeductibleCosts = fcurDeductibleCosts;
  }
  public tblnz_rtnpropertysale with_fcurDeductibleCosts(java.math.BigDecimal fcurDeductibleCosts) {
    this.fcurDeductibleCosts = fcurDeductibleCosts;
    return this;
  }
  private java.math.BigDecimal fcurTotalCosts;
  public java.math.BigDecimal get_fcurTotalCosts() {
    return fcurTotalCosts;
  }
  public void set_fcurTotalCosts(java.math.BigDecimal fcurTotalCosts) {
    this.fcurTotalCosts = fcurTotalCosts;
  }
  public tblnz_rtnpropertysale with_fcurTotalCosts(java.math.BigDecimal fcurTotalCosts) {
    this.fcurTotalCosts = fcurTotalCosts;
    return this;
  }
  private java.math.BigDecimal fcurNetProfitLoss;
  public java.math.BigDecimal get_fcurNetProfitLoss() {
    return fcurNetProfitLoss;
  }
  public void set_fcurNetProfitLoss(java.math.BigDecimal fcurNetProfitLoss) {
    this.fcurNetProfitLoss = fcurNetProfitLoss;
  }
  public tblnz_rtnpropertysale with_fcurNetProfitLoss(java.math.BigDecimal fcurNetProfitLoss) {
    this.fcurNetProfitLoss = fcurNetProfitLoss;
    return this;
  }
  private Double fdblPercentageOwnership;
  public Double get_fdblPercentageOwnership() {
    return fdblPercentageOwnership;
  }
  public void set_fdblPercentageOwnership(Double fdblPercentageOwnership) {
    this.fdblPercentageOwnership = fdblPercentageOwnership;
  }
  public tblnz_rtnpropertysale with_fdblPercentageOwnership(Double fdblPercentageOwnership) {
    this.fdblPercentageOwnership = fdblPercentageOwnership;
    return this;
  }
  private java.math.BigDecimal fcurShareOfNetProfitLoss;
  public java.math.BigDecimal get_fcurShareOfNetProfitLoss() {
    return fcurShareOfNetProfitLoss;
  }
  public void set_fcurShareOfNetProfitLoss(java.math.BigDecimal fcurShareOfNetProfitLoss) {
    this.fcurShareOfNetProfitLoss = fcurShareOfNetProfitLoss;
  }
  public tblnz_rtnpropertysale with_fcurShareOfNetProfitLoss(java.math.BigDecimal fcurShareOfNetProfitLoss) {
    this.fcurShareOfNetProfitLoss = fcurShareOfNetProfitLoss;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblnz_rtnpropertysale with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnpropertysale with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpropertysale)) {
      return false;
    }
    tblnz_rtnpropertysale that = (tblnz_rtnpropertysale) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnBrightLineTest == null ? that.fblnBrightLineTest == null : this.fblnBrightLineTest.equals(that.fblnBrightLineTest));
    equal = equal && (this.fstrPropertyTitleNumber == null ? that.fstrPropertyTitleNumber == null : this.fstrPropertyTitleNumber.equals(that.fstrPropertyTitleNumber));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fdtmDateOfPurchase == null ? that.fdtmDateOfPurchase == null : this.fdtmDateOfPurchase.equals(that.fdtmDateOfPurchase));
    equal = equal && (this.fdtmDateOfSale == null ? that.fdtmDateOfSale == null : this.fdtmDateOfSale.equals(that.fdtmDateOfSale));
    equal = equal && (this.fcurSalePrice == null ? that.fcurSalePrice == null : this.fcurSalePrice.equals(that.fcurSalePrice));
    equal = equal && (this.fcurPurchasePrice == null ? that.fcurPurchasePrice == null : this.fcurPurchasePrice.equals(that.fcurPurchasePrice));
    equal = equal && (this.fcurDeductibleCosts == null ? that.fcurDeductibleCosts == null : this.fcurDeductibleCosts.equals(that.fcurDeductibleCosts));
    equal = equal && (this.fcurTotalCosts == null ? that.fcurTotalCosts == null : this.fcurTotalCosts.equals(that.fcurTotalCosts));
    equal = equal && (this.fcurNetProfitLoss == null ? that.fcurNetProfitLoss == null : this.fcurNetProfitLoss.equals(that.fcurNetProfitLoss));
    equal = equal && (this.fdblPercentageOwnership == null ? that.fdblPercentageOwnership == null : this.fdblPercentageOwnership.equals(that.fdblPercentageOwnership));
    equal = equal && (this.fcurShareOfNetProfitLoss == null ? that.fcurShareOfNetProfitLoss == null : this.fcurShareOfNetProfitLoss.equals(that.fcurShareOfNetProfitLoss));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnpropertysale)) {
      return false;
    }
    tblnz_rtnpropertysale that = (tblnz_rtnpropertysale) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnBrightLineTest == null ? that.fblnBrightLineTest == null : this.fblnBrightLineTest.equals(that.fblnBrightLineTest));
    equal = equal && (this.fstrPropertyTitleNumber == null ? that.fstrPropertyTitleNumber == null : this.fstrPropertyTitleNumber.equals(that.fstrPropertyTitleNumber));
    equal = equal && (this.fstrAddressLine1 == null ? that.fstrAddressLine1 == null : this.fstrAddressLine1.equals(that.fstrAddressLine1));
    equal = equal && (this.fstrAddressLine2 == null ? that.fstrAddressLine2 == null : this.fstrAddressLine2.equals(that.fstrAddressLine2));
    equal = equal && (this.fstrSuburb == null ? that.fstrSuburb == null : this.fstrSuburb.equals(that.fstrSuburb));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fdtmDateOfPurchase == null ? that.fdtmDateOfPurchase == null : this.fdtmDateOfPurchase.equals(that.fdtmDateOfPurchase));
    equal = equal && (this.fdtmDateOfSale == null ? that.fdtmDateOfSale == null : this.fdtmDateOfSale.equals(that.fdtmDateOfSale));
    equal = equal && (this.fcurSalePrice == null ? that.fcurSalePrice == null : this.fcurSalePrice.equals(that.fcurSalePrice));
    equal = equal && (this.fcurPurchasePrice == null ? that.fcurPurchasePrice == null : this.fcurPurchasePrice.equals(that.fcurPurchasePrice));
    equal = equal && (this.fcurDeductibleCosts == null ? that.fcurDeductibleCosts == null : this.fcurDeductibleCosts.equals(that.fcurDeductibleCosts));
    equal = equal && (this.fcurTotalCosts == null ? that.fcurTotalCosts == null : this.fcurTotalCosts.equals(that.fcurTotalCosts));
    equal = equal && (this.fcurNetProfitLoss == null ? that.fcurNetProfitLoss == null : this.fcurNetProfitLoss.equals(that.fcurNetProfitLoss));
    equal = equal && (this.fdblPercentageOwnership == null ? that.fdblPercentageOwnership == null : this.fdblPercentageOwnership.equals(that.fdblPercentageOwnership));
    equal = equal && (this.fcurShareOfNetProfitLoss == null ? that.fcurShareOfNetProfitLoss == null : this.fcurShareOfNetProfitLoss.equals(that.fcurShareOfNetProfitLoss));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnBrightLineTest = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPropertyTitleNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmDateOfPurchase = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDateOfSale = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurSalePrice = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPurchasePrice = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurDeductibleCosts = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalCosts = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurNetProfitLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fdblPercentageOwnership = JdbcWritableBridge.readDouble(16, __dbResults);
    this.fcurShareOfNetProfitLoss = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnBrightLineTest = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPropertyTitleNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAddressLine1 = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrAddressLine2 = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrSuburb = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmDateOfPurchase = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmDateOfSale = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fcurSalePrice = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurPurchasePrice = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurDeductibleCosts = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalCosts = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurNetProfitLoss = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fdblPercentageOwnership = JdbcWritableBridge.readDouble(16, __dbResults);
    this.fcurShareOfNetProfitLoss = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnBrightLineTest, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPropertyTitleNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateOfPurchase, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateOfSale, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalePrice, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPurchasePrice, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductibleCosts, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCosts, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblPercentageOwnership, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfNetProfitLoss, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBrightLineTest, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPropertyTitleNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine1, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressLine2, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSuburb, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateOfPurchase, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateOfSale, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurSalePrice, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPurchasePrice, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDeductibleCosts, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalCosts, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetProfitLoss, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(fdblPercentageOwnership, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurShareOfNetProfitLoss, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 19 + __off, -9, __dbStmt);
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
        this.fblnBrightLineTest = null;
    } else {
    this.fblnBrightLineTest = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPropertyTitleNumber = null;
    } else {
    this.fstrPropertyTitleNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressLine1 = null;
    } else {
    this.fstrAddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressLine2 = null;
    } else {
    this.fstrAddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSuburb = null;
    } else {
    this.fstrSuburb = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostCode = null;
    } else {
    this.fstrPostCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateOfPurchase = null;
    } else {
    this.fdtmDateOfPurchase = new Timestamp(__dataIn.readLong());
    this.fdtmDateOfPurchase.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateOfSale = null;
    } else {
    this.fdtmDateOfSale = new Timestamp(__dataIn.readLong());
    this.fdtmDateOfSale.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurSalePrice = null;
    } else {
    this.fcurSalePrice = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPurchasePrice = null;
    } else {
    this.fcurPurchasePrice = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDeductibleCosts = null;
    } else {
    this.fcurDeductibleCosts = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalCosts = null;
    } else {
    this.fcurTotalCosts = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetProfitLoss = null;
    } else {
    this.fcurNetProfitLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdblPercentageOwnership = null;
    } else {
    this.fdblPercentageOwnership = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurShareOfNetProfitLoss = null;
    } else {
    this.fcurShareOfNetProfitLoss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnBrightLineTest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBrightLineTest);
    }
    if (null == this.fstrPropertyTitleNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPropertyTitleNumber);
    }
    if (null == this.fstrAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine1);
    }
    if (null == this.fstrAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine2);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fdtmDateOfPurchase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateOfPurchase.getTime());
    __dataOut.writeInt(this.fdtmDateOfPurchase.getNanos());
    }
    if (null == this.fdtmDateOfSale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateOfSale.getTime());
    __dataOut.writeInt(this.fdtmDateOfSale.getNanos());
    }
    if (null == this.fcurSalePrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalePrice, __dataOut);
    }
    if (null == this.fcurPurchasePrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPurchasePrice, __dataOut);
    }
    if (null == this.fcurDeductibleCosts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductibleCosts, __dataOut);
    }
    if (null == this.fcurTotalCosts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCosts, __dataOut);
    }
    if (null == this.fcurNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitLoss, __dataOut);
    }
    if (null == this.fdblPercentageOwnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblPercentageOwnership);
    }
    if (null == this.fcurShareOfNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfNetProfitLoss, __dataOut);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fblnBrightLineTest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBrightLineTest);
    }
    if (null == this.fstrPropertyTitleNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPropertyTitleNumber);
    }
    if (null == this.fstrAddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine1);
    }
    if (null == this.fstrAddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressLine2);
    }
    if (null == this.fstrSuburb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSuburb);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fdtmDateOfPurchase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateOfPurchase.getTime());
    __dataOut.writeInt(this.fdtmDateOfPurchase.getNanos());
    }
    if (null == this.fdtmDateOfSale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateOfSale.getTime());
    __dataOut.writeInt(this.fdtmDateOfSale.getNanos());
    }
    if (null == this.fcurSalePrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurSalePrice, __dataOut);
    }
    if (null == this.fcurPurchasePrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPurchasePrice, __dataOut);
    }
    if (null == this.fcurDeductibleCosts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDeductibleCosts, __dataOut);
    }
    if (null == this.fcurTotalCosts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalCosts, __dataOut);
    }
    if (null == this.fcurNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetProfitLoss, __dataOut);
    }
    if (null == this.fdblPercentageOwnership) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fdblPercentageOwnership);
    }
    if (null == this.fcurShareOfNetProfitLoss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurShareOfNetProfitLoss, __dataOut);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBrightLineTest==null?"\\N":"" + fblnBrightLineTest, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPropertyTitleNumber==null?"\\N":fstrPropertyTitleNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine1==null?"\\N":fstrAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine2==null?"\\N":fstrAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateOfPurchase==null?"\\N":"" + fdtmDateOfPurchase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateOfSale==null?"\\N":"" + fdtmDateOfSale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalePrice==null?"\\N":fcurSalePrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPurchasePrice==null?"\\N":fcurPurchasePrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductibleCosts==null?"\\N":fcurDeductibleCosts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCosts==null?"\\N":fcurTotalCosts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitLoss==null?"\\N":fcurNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblPercentageOwnership==null?"\\N":"" + fdblPercentageOwnership, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfNetProfitLoss==null?"\\N":fcurShareOfNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBrightLineTest==null?"\\N":"" + fblnBrightLineTest, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPropertyTitleNumber==null?"\\N":fstrPropertyTitleNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine1==null?"\\N":fstrAddressLine1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressLine2==null?"\\N":fstrAddressLine2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSuburb==null?"\\N":fstrSuburb, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateOfPurchase==null?"\\N":"" + fdtmDateOfPurchase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateOfSale==null?"\\N":"" + fdtmDateOfSale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurSalePrice==null?"\\N":fcurSalePrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPurchasePrice==null?"\\N":fcurPurchasePrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDeductibleCosts==null?"\\N":fcurDeductibleCosts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalCosts==null?"\\N":fcurTotalCosts.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetProfitLoss==null?"\\N":fcurNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdblPercentageOwnership==null?"\\N":"" + fdblPercentageOwnership, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurShareOfNetProfitLoss==null?"\\N":fcurShareOfNetProfitLoss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBrightLineTest = null; } else {
      this.fblnBrightLineTest = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPropertyTitleNumber = null; } else {
      this.fstrPropertyTitleNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine1 = null; } else {
      this.fstrAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine2 = null; } else {
      this.fstrAddressLine2 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateOfPurchase = null; } else {
      this.fdtmDateOfPurchase = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateOfSale = null; } else {
      this.fdtmDateOfSale = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalePrice = null; } else {
      this.fcurSalePrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPurchasePrice = null; } else {
      this.fcurPurchasePrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductibleCosts = null; } else {
      this.fcurDeductibleCosts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCosts = null; } else {
      this.fcurTotalCosts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitLoss = null; } else {
      this.fcurNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblPercentageOwnership = null; } else {
      this.fdblPercentageOwnership = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfNetProfitLoss = null; } else {
      this.fcurShareOfNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBrightLineTest = null; } else {
      this.fblnBrightLineTest = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPropertyTitleNumber = null; } else {
      this.fstrPropertyTitleNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine1 = null; } else {
      this.fstrAddressLine1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressLine2 = null; } else {
      this.fstrAddressLine2 = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateOfPurchase = null; } else {
      this.fdtmDateOfPurchase = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateOfSale = null; } else {
      this.fdtmDateOfSale = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurSalePrice = null; } else {
      this.fcurSalePrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPurchasePrice = null; } else {
      this.fcurPurchasePrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDeductibleCosts = null; } else {
      this.fcurDeductibleCosts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalCosts = null; } else {
      this.fcurTotalCosts = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetProfitLoss = null; } else {
      this.fcurNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdblPercentageOwnership = null; } else {
      this.fdblPercentageOwnership = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurShareOfNetProfitLoss = null; } else {
      this.fcurShareOfNetProfitLoss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblnz_rtnpropertysale o = (tblnz_rtnpropertysale) super.clone();
    o.fdtmDateOfPurchase = (o.fdtmDateOfPurchase != null) ? (java.sql.Timestamp) o.fdtmDateOfPurchase.clone() : null;
    o.fdtmDateOfSale = (o.fdtmDateOfSale != null) ? (java.sql.Timestamp) o.fdtmDateOfSale.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnpropertysale o) throws CloneNotSupportedException {
    o.fdtmDateOfPurchase = (o.fdtmDateOfPurchase != null) ? (java.sql.Timestamp) o.fdtmDateOfPurchase.clone() : null;
    o.fdtmDateOfSale = (o.fdtmDateOfSale != null) ? (java.sql.Timestamp) o.fdtmDateOfSale.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnBrightLineTest", this.fblnBrightLineTest);
    __sqoop$field_map.put("fstrPropertyTitleNumber", this.fstrPropertyTitleNumber);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fdtmDateOfPurchase", this.fdtmDateOfPurchase);
    __sqoop$field_map.put("fdtmDateOfSale", this.fdtmDateOfSale);
    __sqoop$field_map.put("fcurSalePrice", this.fcurSalePrice);
    __sqoop$field_map.put("fcurPurchasePrice", this.fcurPurchasePrice);
    __sqoop$field_map.put("fcurDeductibleCosts", this.fcurDeductibleCosts);
    __sqoop$field_map.put("fcurTotalCosts", this.fcurTotalCosts);
    __sqoop$field_map.put("fcurNetProfitLoss", this.fcurNetProfitLoss);
    __sqoop$field_map.put("fdblPercentageOwnership", this.fdblPercentageOwnership);
    __sqoop$field_map.put("fcurShareOfNetProfitLoss", this.fcurShareOfNetProfitLoss);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnBrightLineTest", this.fblnBrightLineTest);
    __sqoop$field_map.put("fstrPropertyTitleNumber", this.fstrPropertyTitleNumber);
    __sqoop$field_map.put("fstrAddressLine1", this.fstrAddressLine1);
    __sqoop$field_map.put("fstrAddressLine2", this.fstrAddressLine2);
    __sqoop$field_map.put("fstrSuburb", this.fstrSuburb);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fdtmDateOfPurchase", this.fdtmDateOfPurchase);
    __sqoop$field_map.put("fdtmDateOfSale", this.fdtmDateOfSale);
    __sqoop$field_map.put("fcurSalePrice", this.fcurSalePrice);
    __sqoop$field_map.put("fcurPurchasePrice", this.fcurPurchasePrice);
    __sqoop$field_map.put("fcurDeductibleCosts", this.fcurDeductibleCosts);
    __sqoop$field_map.put("fcurTotalCosts", this.fcurTotalCosts);
    __sqoop$field_map.put("fcurNetProfitLoss", this.fcurNetProfitLoss);
    __sqoop$field_map.put("fdblPercentageOwnership", this.fdblPercentageOwnership);
    __sqoop$field_map.put("fcurShareOfNetProfitLoss", this.fcurShareOfNetProfitLoss);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
