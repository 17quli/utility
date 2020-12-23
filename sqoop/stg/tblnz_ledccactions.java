// ORM class for table 'tblnz_ledccactions'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:24:09 NZDT 2020
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

public class tblnz_ledccactions extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrAction1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction1 = (String)value;
      }
    });
    setters.put("fstrAction1Override", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction1Override = (String)value;
      }
    });
    setters.put("fstrAction1Comment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction1Comment = (String)value;
      }
    });
    setters.put("fdtmAction1Suggested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fdtmAction1Suggested = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAction2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction2 = (String)value;
      }
    });
    setters.put("fstrAction2Override", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction2Override = (String)value;
      }
    });
    setters.put("fstrAction2Comment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction2Comment = (String)value;
      }
    });
    setters.put("fdtmAction2Suggested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fdtmAction2Suggested = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAction3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction3 = (String)value;
      }
    });
    setters.put("fstrAction3Override", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction3Override = (String)value;
      }
    });
    setters.put("fstrAction3Comment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrAction3Comment = (String)value;
      }
    });
    setters.put("fdtmAction3Suggested", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fdtmAction3Suggested = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFromDiscovery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fblnFromDiscovery = (Integer)value;
      }
    });
    setters.put("fstrPortfolio", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrPortfolio = (String)value;
      }
    });
    setters.put("fstrCampaignName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrCampaignName = (String)value;
      }
    });
    setters.put("flngCollectKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.flngCollectKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ledccactions.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ledccactions() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_ledccactions with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrAction1;
  public String get_fstrAction1() {
    return fstrAction1;
  }
  public void set_fstrAction1(String fstrAction1) {
    this.fstrAction1 = fstrAction1;
  }
  public tblnz_ledccactions with_fstrAction1(String fstrAction1) {
    this.fstrAction1 = fstrAction1;
    return this;
  }
  private String fstrAction1Override;
  public String get_fstrAction1Override() {
    return fstrAction1Override;
  }
  public void set_fstrAction1Override(String fstrAction1Override) {
    this.fstrAction1Override = fstrAction1Override;
  }
  public tblnz_ledccactions with_fstrAction1Override(String fstrAction1Override) {
    this.fstrAction1Override = fstrAction1Override;
    return this;
  }
  private String fstrAction1Comment;
  public String get_fstrAction1Comment() {
    return fstrAction1Comment;
  }
  public void set_fstrAction1Comment(String fstrAction1Comment) {
    this.fstrAction1Comment = fstrAction1Comment;
  }
  public tblnz_ledccactions with_fstrAction1Comment(String fstrAction1Comment) {
    this.fstrAction1Comment = fstrAction1Comment;
    return this;
  }
  private java.sql.Timestamp fdtmAction1Suggested;
  public java.sql.Timestamp get_fdtmAction1Suggested() {
    return fdtmAction1Suggested;
  }
  public void set_fdtmAction1Suggested(java.sql.Timestamp fdtmAction1Suggested) {
    this.fdtmAction1Suggested = fdtmAction1Suggested;
  }
  public tblnz_ledccactions with_fdtmAction1Suggested(java.sql.Timestamp fdtmAction1Suggested) {
    this.fdtmAction1Suggested = fdtmAction1Suggested;
    return this;
  }
  private String fstrAction2;
  public String get_fstrAction2() {
    return fstrAction2;
  }
  public void set_fstrAction2(String fstrAction2) {
    this.fstrAction2 = fstrAction2;
  }
  public tblnz_ledccactions with_fstrAction2(String fstrAction2) {
    this.fstrAction2 = fstrAction2;
    return this;
  }
  private String fstrAction2Override;
  public String get_fstrAction2Override() {
    return fstrAction2Override;
  }
  public void set_fstrAction2Override(String fstrAction2Override) {
    this.fstrAction2Override = fstrAction2Override;
  }
  public tblnz_ledccactions with_fstrAction2Override(String fstrAction2Override) {
    this.fstrAction2Override = fstrAction2Override;
    return this;
  }
  private String fstrAction2Comment;
  public String get_fstrAction2Comment() {
    return fstrAction2Comment;
  }
  public void set_fstrAction2Comment(String fstrAction2Comment) {
    this.fstrAction2Comment = fstrAction2Comment;
  }
  public tblnz_ledccactions with_fstrAction2Comment(String fstrAction2Comment) {
    this.fstrAction2Comment = fstrAction2Comment;
    return this;
  }
  private java.sql.Timestamp fdtmAction2Suggested;
  public java.sql.Timestamp get_fdtmAction2Suggested() {
    return fdtmAction2Suggested;
  }
  public void set_fdtmAction2Suggested(java.sql.Timestamp fdtmAction2Suggested) {
    this.fdtmAction2Suggested = fdtmAction2Suggested;
  }
  public tblnz_ledccactions with_fdtmAction2Suggested(java.sql.Timestamp fdtmAction2Suggested) {
    this.fdtmAction2Suggested = fdtmAction2Suggested;
    return this;
  }
  private String fstrAction3;
  public String get_fstrAction3() {
    return fstrAction3;
  }
  public void set_fstrAction3(String fstrAction3) {
    this.fstrAction3 = fstrAction3;
  }
  public tblnz_ledccactions with_fstrAction3(String fstrAction3) {
    this.fstrAction3 = fstrAction3;
    return this;
  }
  private String fstrAction3Override;
  public String get_fstrAction3Override() {
    return fstrAction3Override;
  }
  public void set_fstrAction3Override(String fstrAction3Override) {
    this.fstrAction3Override = fstrAction3Override;
  }
  public tblnz_ledccactions with_fstrAction3Override(String fstrAction3Override) {
    this.fstrAction3Override = fstrAction3Override;
    return this;
  }
  private String fstrAction3Comment;
  public String get_fstrAction3Comment() {
    return fstrAction3Comment;
  }
  public void set_fstrAction3Comment(String fstrAction3Comment) {
    this.fstrAction3Comment = fstrAction3Comment;
  }
  public tblnz_ledccactions with_fstrAction3Comment(String fstrAction3Comment) {
    this.fstrAction3Comment = fstrAction3Comment;
    return this;
  }
  private java.sql.Timestamp fdtmAction3Suggested;
  public java.sql.Timestamp get_fdtmAction3Suggested() {
    return fdtmAction3Suggested;
  }
  public void set_fdtmAction3Suggested(java.sql.Timestamp fdtmAction3Suggested) {
    this.fdtmAction3Suggested = fdtmAction3Suggested;
  }
  public tblnz_ledccactions with_fdtmAction3Suggested(java.sql.Timestamp fdtmAction3Suggested) {
    this.fdtmAction3Suggested = fdtmAction3Suggested;
    return this;
  }
  private Integer fblnFromDiscovery;
  public Integer get_fblnFromDiscovery() {
    return fblnFromDiscovery;
  }
  public void set_fblnFromDiscovery(Integer fblnFromDiscovery) {
    this.fblnFromDiscovery = fblnFromDiscovery;
  }
  public tblnz_ledccactions with_fblnFromDiscovery(Integer fblnFromDiscovery) {
    this.fblnFromDiscovery = fblnFromDiscovery;
    return this;
  }
  private String fstrPortfolio;
  public String get_fstrPortfolio() {
    return fstrPortfolio;
  }
  public void set_fstrPortfolio(String fstrPortfolio) {
    this.fstrPortfolio = fstrPortfolio;
  }
  public tblnz_ledccactions with_fstrPortfolio(String fstrPortfolio) {
    this.fstrPortfolio = fstrPortfolio;
    return this;
  }
  private String fstrCampaignName;
  public String get_fstrCampaignName() {
    return fstrCampaignName;
  }
  public void set_fstrCampaignName(String fstrCampaignName) {
    this.fstrCampaignName = fstrCampaignName;
  }
  public tblnz_ledccactions with_fstrCampaignName(String fstrCampaignName) {
    this.fstrCampaignName = fstrCampaignName;
    return this;
  }
  private Integer flngCollectKey;
  public Integer get_flngCollectKey() {
    return flngCollectKey;
  }
  public void set_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
  }
  public tblnz_ledccactions with_flngCollectKey(Integer flngCollectKey) {
    this.flngCollectKey = flngCollectKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ledccactions with_fstrWho(String fstrWho) {
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
  public tblnz_ledccactions with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ledccactions)) {
      return false;
    }
    tblnz_ledccactions that = (tblnz_ledccactions) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrAction1 == null ? that.fstrAction1 == null : this.fstrAction1.equals(that.fstrAction1));
    equal = equal && (this.fstrAction1Override == null ? that.fstrAction1Override == null : this.fstrAction1Override.equals(that.fstrAction1Override));
    equal = equal && (this.fstrAction1Comment == null ? that.fstrAction1Comment == null : this.fstrAction1Comment.equals(that.fstrAction1Comment));
    equal = equal && (this.fdtmAction1Suggested == null ? that.fdtmAction1Suggested == null : this.fdtmAction1Suggested.equals(that.fdtmAction1Suggested));
    equal = equal && (this.fstrAction2 == null ? that.fstrAction2 == null : this.fstrAction2.equals(that.fstrAction2));
    equal = equal && (this.fstrAction2Override == null ? that.fstrAction2Override == null : this.fstrAction2Override.equals(that.fstrAction2Override));
    equal = equal && (this.fstrAction2Comment == null ? that.fstrAction2Comment == null : this.fstrAction2Comment.equals(that.fstrAction2Comment));
    equal = equal && (this.fdtmAction2Suggested == null ? that.fdtmAction2Suggested == null : this.fdtmAction2Suggested.equals(that.fdtmAction2Suggested));
    equal = equal && (this.fstrAction3 == null ? that.fstrAction3 == null : this.fstrAction3.equals(that.fstrAction3));
    equal = equal && (this.fstrAction3Override == null ? that.fstrAction3Override == null : this.fstrAction3Override.equals(that.fstrAction3Override));
    equal = equal && (this.fstrAction3Comment == null ? that.fstrAction3Comment == null : this.fstrAction3Comment.equals(that.fstrAction3Comment));
    equal = equal && (this.fdtmAction3Suggested == null ? that.fdtmAction3Suggested == null : this.fdtmAction3Suggested.equals(that.fdtmAction3Suggested));
    equal = equal && (this.fblnFromDiscovery == null ? that.fblnFromDiscovery == null : this.fblnFromDiscovery.equals(that.fblnFromDiscovery));
    equal = equal && (this.fstrPortfolio == null ? that.fstrPortfolio == null : this.fstrPortfolio.equals(that.fstrPortfolio));
    equal = equal && (this.fstrCampaignName == null ? that.fstrCampaignName == null : this.fstrCampaignName.equals(that.fstrCampaignName));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ledccactions)) {
      return false;
    }
    tblnz_ledccactions that = (tblnz_ledccactions) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrAction1 == null ? that.fstrAction1 == null : this.fstrAction1.equals(that.fstrAction1));
    equal = equal && (this.fstrAction1Override == null ? that.fstrAction1Override == null : this.fstrAction1Override.equals(that.fstrAction1Override));
    equal = equal && (this.fstrAction1Comment == null ? that.fstrAction1Comment == null : this.fstrAction1Comment.equals(that.fstrAction1Comment));
    equal = equal && (this.fdtmAction1Suggested == null ? that.fdtmAction1Suggested == null : this.fdtmAction1Suggested.equals(that.fdtmAction1Suggested));
    equal = equal && (this.fstrAction2 == null ? that.fstrAction2 == null : this.fstrAction2.equals(that.fstrAction2));
    equal = equal && (this.fstrAction2Override == null ? that.fstrAction2Override == null : this.fstrAction2Override.equals(that.fstrAction2Override));
    equal = equal && (this.fstrAction2Comment == null ? that.fstrAction2Comment == null : this.fstrAction2Comment.equals(that.fstrAction2Comment));
    equal = equal && (this.fdtmAction2Suggested == null ? that.fdtmAction2Suggested == null : this.fdtmAction2Suggested.equals(that.fdtmAction2Suggested));
    equal = equal && (this.fstrAction3 == null ? that.fstrAction3 == null : this.fstrAction3.equals(that.fstrAction3));
    equal = equal && (this.fstrAction3Override == null ? that.fstrAction3Override == null : this.fstrAction3Override.equals(that.fstrAction3Override));
    equal = equal && (this.fstrAction3Comment == null ? that.fstrAction3Comment == null : this.fstrAction3Comment.equals(that.fstrAction3Comment));
    equal = equal && (this.fdtmAction3Suggested == null ? that.fdtmAction3Suggested == null : this.fdtmAction3Suggested.equals(that.fdtmAction3Suggested));
    equal = equal && (this.fblnFromDiscovery == null ? that.fblnFromDiscovery == null : this.fblnFromDiscovery.equals(that.fblnFromDiscovery));
    equal = equal && (this.fstrPortfolio == null ? that.fstrPortfolio == null : this.fstrPortfolio.equals(that.fstrPortfolio));
    equal = equal && (this.fstrCampaignName == null ? that.fstrCampaignName == null : this.fstrCampaignName.equals(that.fstrCampaignName));
    equal = equal && (this.flngCollectKey == null ? that.flngCollectKey == null : this.flngCollectKey.equals(that.flngCollectKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAction1 = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAction1Override = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAction1Comment = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmAction1Suggested = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrAction2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAction2Override = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAction2Comment = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmAction2Suggested = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrAction3 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrAction3Override = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAction3Comment = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmAction3Suggested = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnFromDiscovery = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrPortfolio = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrCampaignName = JdbcWritableBridge.readString(16, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrAction1 = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAction1Override = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAction1Comment = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmAction1Suggested = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrAction2 = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrAction2Override = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrAction2Comment = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmAction2Suggested = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrAction3 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrAction3Override = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAction3Comment = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmAction3Suggested = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fblnFromDiscovery = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrPortfolio = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrCampaignName = JdbcWritableBridge.readString(16, __dbResults);
    this.flngCollectKey = JdbcWritableBridge.readInteger(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1Override, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1Comment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction1Suggested, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2Override, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2Comment, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction2Suggested, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3Override, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3Comment, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction3Suggested, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFromDiscovery, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPortfolio, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCampaignName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1Override, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction1Comment, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction1Suggested, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2Override, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction2Comment, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction2Suggested, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3Override, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction3Comment, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAction3Suggested, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFromDiscovery, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPortfolio, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCampaignName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCollectKey, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fstrAction1 = null;
    } else {
    this.fstrAction1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction1Override = null;
    } else {
    this.fstrAction1Override = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction1Comment = null;
    } else {
    this.fstrAction1Comment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAction1Suggested = null;
    } else {
    this.fdtmAction1Suggested = new Timestamp(__dataIn.readLong());
    this.fdtmAction1Suggested.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction2 = null;
    } else {
    this.fstrAction2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction2Override = null;
    } else {
    this.fstrAction2Override = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction2Comment = null;
    } else {
    this.fstrAction2Comment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAction2Suggested = null;
    } else {
    this.fdtmAction2Suggested = new Timestamp(__dataIn.readLong());
    this.fdtmAction2Suggested.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction3 = null;
    } else {
    this.fstrAction3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction3Override = null;
    } else {
    this.fstrAction3Override = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction3Comment = null;
    } else {
    this.fstrAction3Comment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAction3Suggested = null;
    } else {
    this.fdtmAction3Suggested = new Timestamp(__dataIn.readLong());
    this.fdtmAction3Suggested.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFromDiscovery = null;
    } else {
    this.fblnFromDiscovery = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPortfolio = null;
    } else {
    this.fstrPortfolio = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCampaignName = null;
    } else {
    this.fstrCampaignName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCollectKey = null;
    } else {
    this.flngCollectKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrAction1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1);
    }
    if (null == this.fstrAction1Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1Override);
    }
    if (null == this.fstrAction1Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1Comment);
    }
    if (null == this.fdtmAction1Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction1Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction1Suggested.getNanos());
    }
    if (null == this.fstrAction2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2);
    }
    if (null == this.fstrAction2Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2Override);
    }
    if (null == this.fstrAction2Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2Comment);
    }
    if (null == this.fdtmAction2Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction2Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction2Suggested.getNanos());
    }
    if (null == this.fstrAction3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3);
    }
    if (null == this.fstrAction3Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3Override);
    }
    if (null == this.fstrAction3Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3Comment);
    }
    if (null == this.fdtmAction3Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction3Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction3Suggested.getNanos());
    }
    if (null == this.fblnFromDiscovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFromDiscovery);
    }
    if (null == this.fstrPortfolio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPortfolio);
    }
    if (null == this.fstrCampaignName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCampaignName);
    }
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
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
    if (null == this.fstrAction1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1);
    }
    if (null == this.fstrAction1Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1Override);
    }
    if (null == this.fstrAction1Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction1Comment);
    }
    if (null == this.fdtmAction1Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction1Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction1Suggested.getNanos());
    }
    if (null == this.fstrAction2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2);
    }
    if (null == this.fstrAction2Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2Override);
    }
    if (null == this.fstrAction2Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction2Comment);
    }
    if (null == this.fdtmAction2Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction2Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction2Suggested.getNanos());
    }
    if (null == this.fstrAction3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3);
    }
    if (null == this.fstrAction3Override) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3Override);
    }
    if (null == this.fstrAction3Comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction3Comment);
    }
    if (null == this.fdtmAction3Suggested) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAction3Suggested.getTime());
    __dataOut.writeInt(this.fdtmAction3Suggested.getNanos());
    }
    if (null == this.fblnFromDiscovery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFromDiscovery);
    }
    if (null == this.fstrPortfolio) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPortfolio);
    }
    if (null == this.fstrCampaignName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCampaignName);
    }
    if (null == this.flngCollectKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCollectKey);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1==null?"\\N":fstrAction1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1Override==null?"\\N":fstrAction1Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1Comment==null?"\\N":fstrAction1Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction1Suggested==null?"\\N":"" + fdtmAction1Suggested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2==null?"\\N":fstrAction2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2Override==null?"\\N":fstrAction2Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2Comment==null?"\\N":fstrAction2Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction2Suggested==null?"\\N":"" + fdtmAction2Suggested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3==null?"\\N":fstrAction3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3Override==null?"\\N":fstrAction3Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3Comment==null?"\\N":fstrAction3Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction3Suggested==null?"\\N":"" + fdtmAction3Suggested, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFromDiscovery==null?"\\N":"" + fblnFromDiscovery, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPortfolio==null?"\\N":fstrPortfolio, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCampaignName==null?"\\N":fstrCampaignName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1==null?"\\N":fstrAction1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1Override==null?"\\N":fstrAction1Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction1Comment==null?"\\N":fstrAction1Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction1Suggested==null?"\\N":"" + fdtmAction1Suggested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2==null?"\\N":fstrAction2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2Override==null?"\\N":fstrAction2Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction2Comment==null?"\\N":fstrAction2Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction2Suggested==null?"\\N":"" + fdtmAction2Suggested, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3==null?"\\N":fstrAction3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3Override==null?"\\N":fstrAction3Override, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction3Comment==null?"\\N":fstrAction3Comment, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAction3Suggested==null?"\\N":"" + fdtmAction3Suggested, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFromDiscovery==null?"\\N":"" + fblnFromDiscovery, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPortfolio==null?"\\N":fstrPortfolio, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCampaignName==null?"\\N":fstrCampaignName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCollectKey==null?"\\N":"" + flngCollectKey, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrAction1 = null; } else {
      this.fstrAction1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction1Override = null; } else {
      this.fstrAction1Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction1Comment = null; } else {
      this.fstrAction1Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction1Suggested = null; } else {
      this.fdtmAction1Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2 = null; } else {
      this.fstrAction2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2Override = null; } else {
      this.fstrAction2Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2Comment = null; } else {
      this.fstrAction2Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction2Suggested = null; } else {
      this.fdtmAction2Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3 = null; } else {
      this.fstrAction3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3Override = null; } else {
      this.fstrAction3Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3Comment = null; } else {
      this.fstrAction3Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction3Suggested = null; } else {
      this.fdtmAction3Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFromDiscovery = null; } else {
      this.fblnFromDiscovery = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPortfolio = null; } else {
      this.fstrPortfolio = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCampaignName = null; } else {
      this.fstrCampaignName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAction1 = null; } else {
      this.fstrAction1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction1Override = null; } else {
      this.fstrAction1Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction1Comment = null; } else {
      this.fstrAction1Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction1Suggested = null; } else {
      this.fdtmAction1Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2 = null; } else {
      this.fstrAction2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2Override = null; } else {
      this.fstrAction2Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction2Comment = null; } else {
      this.fstrAction2Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction2Suggested = null; } else {
      this.fdtmAction2Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3 = null; } else {
      this.fstrAction3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3Override = null; } else {
      this.fstrAction3Override = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAction3Comment = null; } else {
      this.fstrAction3Comment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAction3Suggested = null; } else {
      this.fdtmAction3Suggested = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFromDiscovery = null; } else {
      this.fblnFromDiscovery = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPortfolio = null; } else {
      this.fstrPortfolio = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCampaignName = null; } else {
      this.fstrCampaignName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCollectKey = null; } else {
      this.flngCollectKey = Integer.valueOf(__cur_str);
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
    tblnz_ledccactions o = (tblnz_ledccactions) super.clone();
    o.fdtmAction1Suggested = (o.fdtmAction1Suggested != null) ? (java.sql.Timestamp) o.fdtmAction1Suggested.clone() : null;
    o.fdtmAction2Suggested = (o.fdtmAction2Suggested != null) ? (java.sql.Timestamp) o.fdtmAction2Suggested.clone() : null;
    o.fdtmAction3Suggested = (o.fdtmAction3Suggested != null) ? (java.sql.Timestamp) o.fdtmAction3Suggested.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ledccactions o) throws CloneNotSupportedException {
    o.fdtmAction1Suggested = (o.fdtmAction1Suggested != null) ? (java.sql.Timestamp) o.fdtmAction1Suggested.clone() : null;
    o.fdtmAction2Suggested = (o.fdtmAction2Suggested != null) ? (java.sql.Timestamp) o.fdtmAction2Suggested.clone() : null;
    o.fdtmAction3Suggested = (o.fdtmAction3Suggested != null) ? (java.sql.Timestamp) o.fdtmAction3Suggested.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrAction1", this.fstrAction1);
    __sqoop$field_map.put("fstrAction1Override", this.fstrAction1Override);
    __sqoop$field_map.put("fstrAction1Comment", this.fstrAction1Comment);
    __sqoop$field_map.put("fdtmAction1Suggested", this.fdtmAction1Suggested);
    __sqoop$field_map.put("fstrAction2", this.fstrAction2);
    __sqoop$field_map.put("fstrAction2Override", this.fstrAction2Override);
    __sqoop$field_map.put("fstrAction2Comment", this.fstrAction2Comment);
    __sqoop$field_map.put("fdtmAction2Suggested", this.fdtmAction2Suggested);
    __sqoop$field_map.put("fstrAction3", this.fstrAction3);
    __sqoop$field_map.put("fstrAction3Override", this.fstrAction3Override);
    __sqoop$field_map.put("fstrAction3Comment", this.fstrAction3Comment);
    __sqoop$field_map.put("fdtmAction3Suggested", this.fdtmAction3Suggested);
    __sqoop$field_map.put("fblnFromDiscovery", this.fblnFromDiscovery);
    __sqoop$field_map.put("fstrPortfolio", this.fstrPortfolio);
    __sqoop$field_map.put("fstrCampaignName", this.fstrCampaignName);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrAction1", this.fstrAction1);
    __sqoop$field_map.put("fstrAction1Override", this.fstrAction1Override);
    __sqoop$field_map.put("fstrAction1Comment", this.fstrAction1Comment);
    __sqoop$field_map.put("fdtmAction1Suggested", this.fdtmAction1Suggested);
    __sqoop$field_map.put("fstrAction2", this.fstrAction2);
    __sqoop$field_map.put("fstrAction2Override", this.fstrAction2Override);
    __sqoop$field_map.put("fstrAction2Comment", this.fstrAction2Comment);
    __sqoop$field_map.put("fdtmAction2Suggested", this.fdtmAction2Suggested);
    __sqoop$field_map.put("fstrAction3", this.fstrAction3);
    __sqoop$field_map.put("fstrAction3Override", this.fstrAction3Override);
    __sqoop$field_map.put("fstrAction3Comment", this.fstrAction3Comment);
    __sqoop$field_map.put("fdtmAction3Suggested", this.fdtmAction3Suggested);
    __sqoop$field_map.put("fblnFromDiscovery", this.fblnFromDiscovery);
    __sqoop$field_map.put("fstrPortfolio", this.fstrPortfolio);
    __sqoop$field_map.put("fstrCampaignName", this.fstrCampaignName);
    __sqoop$field_map.put("flngCollectKey", this.flngCollectKey);
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
