// ORM class for table 'tblcustomertoaccount'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:57:02 NZDT 2020
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

public class tblcustomertoaccount extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngDestCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngDestCustomerKey = (Integer)value;
      }
    });
    setters.put("fintDestProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fintDestProfileNumber = (Integer)value;
      }
    });
    setters.put("flngDestAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngDestAccountKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fstrFormattedId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fstrFormattedId = (String)value;
      }
    });
    setters.put("fdtmAccountCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fdtmAccountCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmAccountCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fdtmAccountCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngFromCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngFromCustomerKey = (Integer)value;
      }
    });
    setters.put("flngLinkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.flngLinkKey = (Integer)value;
      }
    });
    setters.put("fstrLinkType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fstrLinkType = (String)value;
      }
    });
    setters.put("fdtmLinkCommence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fdtmLinkCommence = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLinkCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fdtmLinkCease = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnLinked", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fblnLinked = (Integer)value;
      }
    });
    setters.put("fblnMultipleLinks", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fblnMultipleLinks = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcustomertoaccount.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcustomertoaccount() {
    init0();
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcustomertoaccount with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngDestCustomerKey;
  public Integer get_flngDestCustomerKey() {
    return flngDestCustomerKey;
  }
  public void set_flngDestCustomerKey(Integer flngDestCustomerKey) {
    this.flngDestCustomerKey = flngDestCustomerKey;
  }
  public tblcustomertoaccount with_flngDestCustomerKey(Integer flngDestCustomerKey) {
    this.flngDestCustomerKey = flngDestCustomerKey;
    return this;
  }
  private Integer fintDestProfileNumber;
  public Integer get_fintDestProfileNumber() {
    return fintDestProfileNumber;
  }
  public void set_fintDestProfileNumber(Integer fintDestProfileNumber) {
    this.fintDestProfileNumber = fintDestProfileNumber;
  }
  public tblcustomertoaccount with_fintDestProfileNumber(Integer fintDestProfileNumber) {
    this.fintDestProfileNumber = fintDestProfileNumber;
    return this;
  }
  private Integer flngDestAccountKey;
  public Integer get_flngDestAccountKey() {
    return flngDestAccountKey;
  }
  public void set_flngDestAccountKey(Integer flngDestAccountKey) {
    this.flngDestAccountKey = flngDestAccountKey;
  }
  public tblcustomertoaccount with_flngDestAccountKey(Integer flngDestAccountKey) {
    this.flngDestAccountKey = flngDestAccountKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcustomertoaccount with_flngVer(Integer flngVer) {
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
  public tblcustomertoaccount with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblcustomertoaccount with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private String fstrFormattedId;
  public String get_fstrFormattedId() {
    return fstrFormattedId;
  }
  public void set_fstrFormattedId(String fstrFormattedId) {
    this.fstrFormattedId = fstrFormattedId;
  }
  public tblcustomertoaccount with_fstrFormattedId(String fstrFormattedId) {
    this.fstrFormattedId = fstrFormattedId;
    return this;
  }
  private java.sql.Timestamp fdtmAccountCommence;
  public java.sql.Timestamp get_fdtmAccountCommence() {
    return fdtmAccountCommence;
  }
  public void set_fdtmAccountCommence(java.sql.Timestamp fdtmAccountCommence) {
    this.fdtmAccountCommence = fdtmAccountCommence;
  }
  public tblcustomertoaccount with_fdtmAccountCommence(java.sql.Timestamp fdtmAccountCommence) {
    this.fdtmAccountCommence = fdtmAccountCommence;
    return this;
  }
  private java.sql.Timestamp fdtmAccountCease;
  public java.sql.Timestamp get_fdtmAccountCease() {
    return fdtmAccountCease;
  }
  public void set_fdtmAccountCease(java.sql.Timestamp fdtmAccountCease) {
    this.fdtmAccountCease = fdtmAccountCease;
  }
  public tblcustomertoaccount with_fdtmAccountCease(java.sql.Timestamp fdtmAccountCease) {
    this.fdtmAccountCease = fdtmAccountCease;
    return this;
  }
  private Integer flngFromCustomerKey;
  public Integer get_flngFromCustomerKey() {
    return flngFromCustomerKey;
  }
  public void set_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
  }
  public tblcustomertoaccount with_flngFromCustomerKey(Integer flngFromCustomerKey) {
    this.flngFromCustomerKey = flngFromCustomerKey;
    return this;
  }
  private Integer flngLinkKey;
  public Integer get_flngLinkKey() {
    return flngLinkKey;
  }
  public void set_flngLinkKey(Integer flngLinkKey) {
    this.flngLinkKey = flngLinkKey;
  }
  public tblcustomertoaccount with_flngLinkKey(Integer flngLinkKey) {
    this.flngLinkKey = flngLinkKey;
    return this;
  }
  private String fstrLinkType;
  public String get_fstrLinkType() {
    return fstrLinkType;
  }
  public void set_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
  }
  public tblcustomertoaccount with_fstrLinkType(String fstrLinkType) {
    this.fstrLinkType = fstrLinkType;
    return this;
  }
  private java.sql.Timestamp fdtmLinkCommence;
  public java.sql.Timestamp get_fdtmLinkCommence() {
    return fdtmLinkCommence;
  }
  public void set_fdtmLinkCommence(java.sql.Timestamp fdtmLinkCommence) {
    this.fdtmLinkCommence = fdtmLinkCommence;
  }
  public tblcustomertoaccount with_fdtmLinkCommence(java.sql.Timestamp fdtmLinkCommence) {
    this.fdtmLinkCommence = fdtmLinkCommence;
    return this;
  }
  private java.sql.Timestamp fdtmLinkCease;
  public java.sql.Timestamp get_fdtmLinkCease() {
    return fdtmLinkCease;
  }
  public void set_fdtmLinkCease(java.sql.Timestamp fdtmLinkCease) {
    this.fdtmLinkCease = fdtmLinkCease;
  }
  public tblcustomertoaccount with_fdtmLinkCease(java.sql.Timestamp fdtmLinkCease) {
    this.fdtmLinkCease = fdtmLinkCease;
    return this;
  }
  private Integer fblnLinked;
  public Integer get_fblnLinked() {
    return fblnLinked;
  }
  public void set_fblnLinked(Integer fblnLinked) {
    this.fblnLinked = fblnLinked;
  }
  public tblcustomertoaccount with_fblnLinked(Integer fblnLinked) {
    this.fblnLinked = fblnLinked;
    return this;
  }
  private Integer fblnMultipleLinks;
  public Integer get_fblnMultipleLinks() {
    return fblnMultipleLinks;
  }
  public void set_fblnMultipleLinks(Integer fblnMultipleLinks) {
    this.fblnMultipleLinks = fblnMultipleLinks;
  }
  public tblcustomertoaccount with_fblnMultipleLinks(Integer fblnMultipleLinks) {
    this.fblnMultipleLinks = fblnMultipleLinks;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcustomertoaccount with_fstrWho(String fstrWho) {
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
  public tblcustomertoaccount with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomertoaccount)) {
      return false;
    }
    tblcustomertoaccount that = (tblcustomertoaccount) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngDestCustomerKey == null ? that.flngDestCustomerKey == null : this.flngDestCustomerKey.equals(that.flngDestCustomerKey));
    equal = equal && (this.fintDestProfileNumber == null ? that.fintDestProfileNumber == null : this.fintDestProfileNumber.equals(that.fintDestProfileNumber));
    equal = equal && (this.flngDestAccountKey == null ? that.flngDestAccountKey == null : this.flngDestAccountKey.equals(that.flngDestAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrFormattedId == null ? that.fstrFormattedId == null : this.fstrFormattedId.equals(that.fstrFormattedId));
    equal = equal && (this.fdtmAccountCommence == null ? that.fdtmAccountCommence == null : this.fdtmAccountCommence.equals(that.fdtmAccountCommence));
    equal = equal && (this.fdtmAccountCease == null ? that.fdtmAccountCease == null : this.fdtmAccountCease.equals(that.fdtmAccountCease));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngLinkKey == null ? that.flngLinkKey == null : this.flngLinkKey.equals(that.flngLinkKey));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fdtmLinkCommence == null ? that.fdtmLinkCommence == null : this.fdtmLinkCommence.equals(that.fdtmLinkCommence));
    equal = equal && (this.fdtmLinkCease == null ? that.fdtmLinkCease == null : this.fdtmLinkCease.equals(that.fdtmLinkCease));
    equal = equal && (this.fblnLinked == null ? that.fblnLinked == null : this.fblnLinked.equals(that.fblnLinked));
    equal = equal && (this.fblnMultipleLinks == null ? that.fblnMultipleLinks == null : this.fblnMultipleLinks.equals(that.fblnMultipleLinks));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcustomertoaccount)) {
      return false;
    }
    tblcustomertoaccount that = (tblcustomertoaccount) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngDestCustomerKey == null ? that.flngDestCustomerKey == null : this.flngDestCustomerKey.equals(that.flngDestCustomerKey));
    equal = equal && (this.fintDestProfileNumber == null ? that.fintDestProfileNumber == null : this.fintDestProfileNumber.equals(that.fintDestProfileNumber));
    equal = equal && (this.flngDestAccountKey == null ? that.flngDestAccountKey == null : this.flngDestAccountKey.equals(that.flngDestAccountKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fstrFormattedId == null ? that.fstrFormattedId == null : this.fstrFormattedId.equals(that.fstrFormattedId));
    equal = equal && (this.fdtmAccountCommence == null ? that.fdtmAccountCommence == null : this.fdtmAccountCommence.equals(that.fdtmAccountCommence));
    equal = equal && (this.fdtmAccountCease == null ? that.fdtmAccountCease == null : this.fdtmAccountCease.equals(that.fdtmAccountCease));
    equal = equal && (this.flngFromCustomerKey == null ? that.flngFromCustomerKey == null : this.flngFromCustomerKey.equals(that.flngFromCustomerKey));
    equal = equal && (this.flngLinkKey == null ? that.flngLinkKey == null : this.flngLinkKey.equals(that.flngLinkKey));
    equal = equal && (this.fstrLinkType == null ? that.fstrLinkType == null : this.fstrLinkType.equals(that.fstrLinkType));
    equal = equal && (this.fdtmLinkCommence == null ? that.fdtmLinkCommence == null : this.fdtmLinkCommence.equals(that.fdtmLinkCommence));
    equal = equal && (this.fdtmLinkCease == null ? that.fdtmLinkCease == null : this.fdtmLinkCease.equals(that.fdtmLinkCease));
    equal = equal && (this.fblnLinked == null ? that.fblnLinked == null : this.fblnLinked.equals(that.fblnLinked));
    equal = equal && (this.fblnMultipleLinks == null ? that.fblnMultipleLinks == null : this.fblnMultipleLinks.equals(that.fblnMultipleLinks));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngDestCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintDestProfileNumber = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngDestAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormattedId = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmAccountCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmAccountCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngLinkKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLinkCommence = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmLinkCease = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fblnLinked = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnMultipleLinks = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngDestCustomerKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fintDestProfileNumber = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngDestAccountKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrFormattedId = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmAccountCommence = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fdtmAccountCease = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.flngFromCustomerKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngLinkKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrLinkType = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLinkCommence = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmLinkCease = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fblnLinked = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnMultipleLinks = JdbcWritableBridge.readInteger(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDestProfileNumber, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedId, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAccountCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAccountCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLinkCommence, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLinkCease, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLinked, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleLinks, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestCustomerKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDestProfileNumber, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestAccountKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormattedId, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAccountCommence, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAccountCease, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFromCustomerKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngLinkKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLinkType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLinkCommence, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLinkCease, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLinked, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleLinks, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDestCustomerKey = null;
    } else {
    this.flngDestCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintDestProfileNumber = null;
    } else {
    this.fintDestProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDestAccountKey = null;
    } else {
    this.flngDestAccountKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormattedId = null;
    } else {
    this.fstrFormattedId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAccountCommence = null;
    } else {
    this.fdtmAccountCommence = new Timestamp(__dataIn.readLong());
    this.fdtmAccountCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAccountCease = null;
    } else {
    this.fdtmAccountCease = new Timestamp(__dataIn.readLong());
    this.fdtmAccountCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFromCustomerKey = null;
    } else {
    this.flngFromCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngLinkKey = null;
    } else {
    this.flngLinkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLinkType = null;
    } else {
    this.fstrLinkType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLinkCommence = null;
    } else {
    this.fdtmLinkCommence = new Timestamp(__dataIn.readLong());
    this.fdtmLinkCommence.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLinkCease = null;
    } else {
    this.fdtmLinkCease = new Timestamp(__dataIn.readLong());
    this.fdtmLinkCease.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLinked = null;
    } else {
    this.fblnLinked = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMultipleLinks = null;
    } else {
    this.fblnMultipleLinks = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngDestCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestCustomerKey);
    }
    if (null == this.fintDestProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDestProfileNumber);
    }
    if (null == this.flngDestAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestAccountKey);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrFormattedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedId);
    }
    if (null == this.fdtmAccountCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAccountCommence.getTime());
    __dataOut.writeInt(this.fdtmAccountCommence.getNanos());
    }
    if (null == this.fdtmAccountCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAccountCease.getTime());
    __dataOut.writeInt(this.fdtmAccountCease.getNanos());
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkKey);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fdtmLinkCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLinkCommence.getTime());
    __dataOut.writeInt(this.fdtmLinkCommence.getNanos());
    }
    if (null == this.fdtmLinkCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLinkCease.getTime());
    __dataOut.writeInt(this.fdtmLinkCease.getNanos());
    }
    if (null == this.fblnLinked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLinked);
    }
    if (null == this.fblnMultipleLinks) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleLinks);
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngDestCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestCustomerKey);
    }
    if (null == this.fintDestProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDestProfileNumber);
    }
    if (null == this.flngDestAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestAccountKey);
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
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fstrFormattedId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormattedId);
    }
    if (null == this.fdtmAccountCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAccountCommence.getTime());
    __dataOut.writeInt(this.fdtmAccountCommence.getNanos());
    }
    if (null == this.fdtmAccountCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAccountCease.getTime());
    __dataOut.writeInt(this.fdtmAccountCease.getNanos());
    }
    if (null == this.flngFromCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFromCustomerKey);
    }
    if (null == this.flngLinkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngLinkKey);
    }
    if (null == this.fstrLinkType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLinkType);
    }
    if (null == this.fdtmLinkCommence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLinkCommence.getTime());
    __dataOut.writeInt(this.fdtmLinkCommence.getNanos());
    }
    if (null == this.fdtmLinkCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLinkCease.getTime());
    __dataOut.writeInt(this.fdtmLinkCease.getNanos());
    }
    if (null == this.fblnLinked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLinked);
    }
    if (null == this.fblnMultipleLinks) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleLinks);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestCustomerKey==null?"\\N":"" + flngDestCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDestProfileNumber==null?"\\N":"" + fintDestProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestAccountKey==null?"\\N":"" + flngDestAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedId==null?"\\N":fstrFormattedId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAccountCommence==null?"\\N":"" + fdtmAccountCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAccountCease==null?"\\N":"" + fdtmAccountCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkKey==null?"\\N":"" + flngLinkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLinkCommence==null?"\\N":"" + fdtmLinkCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLinkCease==null?"\\N":"" + fdtmLinkCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLinked==null?"\\N":"" + fblnLinked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleLinks==null?"\\N":"" + fblnMultipleLinks, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestCustomerKey==null?"\\N":"" + flngDestCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDestProfileNumber==null?"\\N":"" + fintDestProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestAccountKey==null?"\\N":"" + flngDestAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormattedId==null?"\\N":fstrFormattedId, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAccountCommence==null?"\\N":"" + fdtmAccountCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAccountCease==null?"\\N":"" + fdtmAccountCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFromCustomerKey==null?"\\N":"" + flngFromCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngLinkKey==null?"\\N":"" + flngLinkKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLinkType==null?"\\N":fstrLinkType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLinkCommence==null?"\\N":"" + fdtmLinkCommence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLinkCease==null?"\\N":"" + fdtmLinkCease, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLinked==null?"\\N":"" + fblnLinked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleLinks==null?"\\N":"" + fblnMultipleLinks, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestCustomerKey = null; } else {
      this.flngDestCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDestProfileNumber = null; } else {
      this.fintDestProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestAccountKey = null; } else {
      this.flngDestAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedId = null; } else {
      this.fstrFormattedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAccountCommence = null; } else {
      this.fdtmAccountCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAccountCease = null; } else {
      this.fdtmAccountCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkKey = null; } else {
      this.flngLinkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLinkCommence = null; } else {
      this.fdtmLinkCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLinkCease = null; } else {
      this.fdtmLinkCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLinked = null; } else {
      this.fblnLinked = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleLinks = null; } else {
      this.fblnMultipleLinks = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestCustomerKey = null; } else {
      this.flngDestCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDestProfileNumber = null; } else {
      this.fintDestProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestAccountKey = null; } else {
      this.flngDestAccountKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormattedId = null; } else {
      this.fstrFormattedId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAccountCommence = null; } else {
      this.fdtmAccountCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAccountCease = null; } else {
      this.fdtmAccountCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFromCustomerKey = null; } else {
      this.flngFromCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngLinkKey = null; } else {
      this.flngLinkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLinkType = null; } else {
      this.fstrLinkType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLinkCommence = null; } else {
      this.fdtmLinkCommence = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLinkCease = null; } else {
      this.fdtmLinkCease = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLinked = null; } else {
      this.fblnLinked = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleLinks = null; } else {
      this.fblnMultipleLinks = Integer.valueOf(__cur_str);
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
    tblcustomertoaccount o = (tblcustomertoaccount) super.clone();
    o.fdtmAccountCommence = (o.fdtmAccountCommence != null) ? (java.sql.Timestamp) o.fdtmAccountCommence.clone() : null;
    o.fdtmAccountCease = (o.fdtmAccountCease != null) ? (java.sql.Timestamp) o.fdtmAccountCease.clone() : null;
    o.fdtmLinkCommence = (o.fdtmLinkCommence != null) ? (java.sql.Timestamp) o.fdtmLinkCommence.clone() : null;
    o.fdtmLinkCease = (o.fdtmLinkCease != null) ? (java.sql.Timestamp) o.fdtmLinkCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcustomertoaccount o) throws CloneNotSupportedException {
    o.fdtmAccountCommence = (o.fdtmAccountCommence != null) ? (java.sql.Timestamp) o.fdtmAccountCommence.clone() : null;
    o.fdtmAccountCease = (o.fdtmAccountCease != null) ? (java.sql.Timestamp) o.fdtmAccountCease.clone() : null;
    o.fdtmLinkCommence = (o.fdtmLinkCommence != null) ? (java.sql.Timestamp) o.fdtmLinkCommence.clone() : null;
    o.fdtmLinkCease = (o.fdtmLinkCease != null) ? (java.sql.Timestamp) o.fdtmLinkCease.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngDestCustomerKey", this.flngDestCustomerKey);
    __sqoop$field_map.put("fintDestProfileNumber", this.fintDestProfileNumber);
    __sqoop$field_map.put("flngDestAccountKey", this.flngDestAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrFormattedId", this.fstrFormattedId);
    __sqoop$field_map.put("fdtmAccountCommence", this.fdtmAccountCommence);
    __sqoop$field_map.put("fdtmAccountCease", this.fdtmAccountCease);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngLinkKey", this.flngLinkKey);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fdtmLinkCommence", this.fdtmLinkCommence);
    __sqoop$field_map.put("fdtmLinkCease", this.fdtmLinkCease);
    __sqoop$field_map.put("fblnLinked", this.fblnLinked);
    __sqoop$field_map.put("fblnMultipleLinks", this.fblnMultipleLinks);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngDestCustomerKey", this.flngDestCustomerKey);
    __sqoop$field_map.put("fintDestProfileNumber", this.fintDestProfileNumber);
    __sqoop$field_map.put("flngDestAccountKey", this.flngDestAccountKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fstrFormattedId", this.fstrFormattedId);
    __sqoop$field_map.put("fdtmAccountCommence", this.fdtmAccountCommence);
    __sqoop$field_map.put("fdtmAccountCease", this.fdtmAccountCease);
    __sqoop$field_map.put("flngFromCustomerKey", this.flngFromCustomerKey);
    __sqoop$field_map.put("flngLinkKey", this.flngLinkKey);
    __sqoop$field_map.put("fstrLinkType", this.fstrLinkType);
    __sqoop$field_map.put("fdtmLinkCommence", this.fdtmLinkCommence);
    __sqoop$field_map.put("fdtmLinkCease", this.fdtmLinkCease);
    __sqoop$field_map.put("fblnLinked", this.fblnLinked);
    __sqoop$field_map.put("fblnMultipleLinks", this.fblnMultipleLinks);
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
