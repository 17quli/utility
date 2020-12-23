// ORM class for table 'tblteamtime'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:28:50 NZDT 2020
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

public class tblteamtime extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FLNGTIMEKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGTIMEKEY = (Integer)value;
      }
    });
    setters.put("FLNGVER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGVER = (Integer)value;
      }
    });
    setters.put("FLNGVERLAST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGVERLAST = (Integer)value;
      }
    });
    setters.put("FLNGVERRI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGVERRI = (Integer)value;
      }
    });
    setters.put("FLNGFOLDERKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGFOLDERKEY = (Integer)value;
      }
    });
    setters.put("FLNGRESOURCEKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGRESOURCEKEY = (Integer)value;
      }
    });
    setters.put("FLNGMILESTONEKEY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FLNGMILESTONEKEY = (Integer)value;
      }
    });
    setters.put("FDTMDATEFROM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FDTMDATEFROM = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDTMDATETO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FDTMDATETO = (java.sql.Timestamp)value;
      }
    });
    setters.put("FDBLHOURS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FDBLHOURS = (Double)value;
      }
    });
    setters.put("fstrCellNotes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.fstrCellNotes = (String)value;
      }
    });
    setters.put("FSTRDESCRIPTION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FSTRDESCRIPTION = (String)value;
      }
    });
    setters.put("flngTeamPeriodKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.flngTeamPeriodKey = (Integer)value;
      }
    });
    setters.put("fdtmDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.fdtmDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.fstrActivity = (String)value;
      }
    });
    setters.put("fblnReport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.fblnReport = (Integer)value;
      }
    });
    setters.put("FSTRWHO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FSTRWHO = (String)value;
      }
    });
    setters.put("FDTMWHEN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblteamtime.this.FDTMWHEN = (java.sql.Timestamp)value;
      }
    });
  }
  public tblteamtime() {
    init0();
  }
  private Integer FLNGTIMEKEY;
  public Integer get_FLNGTIMEKEY() {
    return FLNGTIMEKEY;
  }
  public void set_FLNGTIMEKEY(Integer FLNGTIMEKEY) {
    this.FLNGTIMEKEY = FLNGTIMEKEY;
  }
  public tblteamtime with_FLNGTIMEKEY(Integer FLNGTIMEKEY) {
    this.FLNGTIMEKEY = FLNGTIMEKEY;
    return this;
  }
  private Integer FLNGVER;
  public Integer get_FLNGVER() {
    return FLNGVER;
  }
  public void set_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
  }
  public tblteamtime with_FLNGVER(Integer FLNGVER) {
    this.FLNGVER = FLNGVER;
    return this;
  }
  private Integer FLNGVERLAST;
  public Integer get_FLNGVERLAST() {
    return FLNGVERLAST;
  }
  public void set_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
  }
  public tblteamtime with_FLNGVERLAST(Integer FLNGVERLAST) {
    this.FLNGVERLAST = FLNGVERLAST;
    return this;
  }
  private Integer FLNGVERRI;
  public Integer get_FLNGVERRI() {
    return FLNGVERRI;
  }
  public void set_FLNGVERRI(Integer FLNGVERRI) {
    this.FLNGVERRI = FLNGVERRI;
  }
  public tblteamtime with_FLNGVERRI(Integer FLNGVERRI) {
    this.FLNGVERRI = FLNGVERRI;
    return this;
  }
  private Integer FLNGFOLDERKEY;
  public Integer get_FLNGFOLDERKEY() {
    return FLNGFOLDERKEY;
  }
  public void set_FLNGFOLDERKEY(Integer FLNGFOLDERKEY) {
    this.FLNGFOLDERKEY = FLNGFOLDERKEY;
  }
  public tblteamtime with_FLNGFOLDERKEY(Integer FLNGFOLDERKEY) {
    this.FLNGFOLDERKEY = FLNGFOLDERKEY;
    return this;
  }
  private Integer FLNGRESOURCEKEY;
  public Integer get_FLNGRESOURCEKEY() {
    return FLNGRESOURCEKEY;
  }
  public void set_FLNGRESOURCEKEY(Integer FLNGRESOURCEKEY) {
    this.FLNGRESOURCEKEY = FLNGRESOURCEKEY;
  }
  public tblteamtime with_FLNGRESOURCEKEY(Integer FLNGRESOURCEKEY) {
    this.FLNGRESOURCEKEY = FLNGRESOURCEKEY;
    return this;
  }
  private Integer FLNGMILESTONEKEY;
  public Integer get_FLNGMILESTONEKEY() {
    return FLNGMILESTONEKEY;
  }
  public void set_FLNGMILESTONEKEY(Integer FLNGMILESTONEKEY) {
    this.FLNGMILESTONEKEY = FLNGMILESTONEKEY;
  }
  public tblteamtime with_FLNGMILESTONEKEY(Integer FLNGMILESTONEKEY) {
    this.FLNGMILESTONEKEY = FLNGMILESTONEKEY;
    return this;
  }
  private java.sql.Timestamp FDTMDATEFROM;
  public java.sql.Timestamp get_FDTMDATEFROM() {
    return FDTMDATEFROM;
  }
  public void set_FDTMDATEFROM(java.sql.Timestamp FDTMDATEFROM) {
    this.FDTMDATEFROM = FDTMDATEFROM;
  }
  public tblteamtime with_FDTMDATEFROM(java.sql.Timestamp FDTMDATEFROM) {
    this.FDTMDATEFROM = FDTMDATEFROM;
    return this;
  }
  private java.sql.Timestamp FDTMDATETO;
  public java.sql.Timestamp get_FDTMDATETO() {
    return FDTMDATETO;
  }
  public void set_FDTMDATETO(java.sql.Timestamp FDTMDATETO) {
    this.FDTMDATETO = FDTMDATETO;
  }
  public tblteamtime with_FDTMDATETO(java.sql.Timestamp FDTMDATETO) {
    this.FDTMDATETO = FDTMDATETO;
    return this;
  }
  private Double FDBLHOURS;
  public Double get_FDBLHOURS() {
    return FDBLHOURS;
  }
  public void set_FDBLHOURS(Double FDBLHOURS) {
    this.FDBLHOURS = FDBLHOURS;
  }
  public tblteamtime with_FDBLHOURS(Double FDBLHOURS) {
    this.FDBLHOURS = FDBLHOURS;
    return this;
  }
  private String fstrCellNotes;
  public String get_fstrCellNotes() {
    return fstrCellNotes;
  }
  public void set_fstrCellNotes(String fstrCellNotes) {
    this.fstrCellNotes = fstrCellNotes;
  }
  public tblteamtime with_fstrCellNotes(String fstrCellNotes) {
    this.fstrCellNotes = fstrCellNotes;
    return this;
  }
  private String FSTRDESCRIPTION;
  public String get_FSTRDESCRIPTION() {
    return FSTRDESCRIPTION;
  }
  public void set_FSTRDESCRIPTION(String FSTRDESCRIPTION) {
    this.FSTRDESCRIPTION = FSTRDESCRIPTION;
  }
  public tblteamtime with_FSTRDESCRIPTION(String FSTRDESCRIPTION) {
    this.FSTRDESCRIPTION = FSTRDESCRIPTION;
    return this;
  }
  private Integer flngTeamPeriodKey;
  public Integer get_flngTeamPeriodKey() {
    return flngTeamPeriodKey;
  }
  public void set_flngTeamPeriodKey(Integer flngTeamPeriodKey) {
    this.flngTeamPeriodKey = flngTeamPeriodKey;
  }
  public tblteamtime with_flngTeamPeriodKey(Integer flngTeamPeriodKey) {
    this.flngTeamPeriodKey = flngTeamPeriodKey;
    return this;
  }
  private java.sql.Timestamp fdtmDate;
  public java.sql.Timestamp get_fdtmDate() {
    return fdtmDate;
  }
  public void set_fdtmDate(java.sql.Timestamp fdtmDate) {
    this.fdtmDate = fdtmDate;
  }
  public tblteamtime with_fdtmDate(java.sql.Timestamp fdtmDate) {
    this.fdtmDate = fdtmDate;
    return this;
  }
  private String fstrActivity;
  public String get_fstrActivity() {
    return fstrActivity;
  }
  public void set_fstrActivity(String fstrActivity) {
    this.fstrActivity = fstrActivity;
  }
  public tblteamtime with_fstrActivity(String fstrActivity) {
    this.fstrActivity = fstrActivity;
    return this;
  }
  private Integer fblnReport;
  public Integer get_fblnReport() {
    return fblnReport;
  }
  public void set_fblnReport(Integer fblnReport) {
    this.fblnReport = fblnReport;
  }
  public tblteamtime with_fblnReport(Integer fblnReport) {
    this.fblnReport = fblnReport;
    return this;
  }
  private String FSTRWHO;
  public String get_FSTRWHO() {
    return FSTRWHO;
  }
  public void set_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
  }
  public tblteamtime with_FSTRWHO(String FSTRWHO) {
    this.FSTRWHO = FSTRWHO;
    return this;
  }
  private java.sql.Timestamp FDTMWHEN;
  public java.sql.Timestamp get_FDTMWHEN() {
    return FDTMWHEN;
  }
  public void set_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
  }
  public tblteamtime with_FDTMWHEN(java.sql.Timestamp FDTMWHEN) {
    this.FDTMWHEN = FDTMWHEN;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblteamtime)) {
      return false;
    }
    tblteamtime that = (tblteamtime) o;
    boolean equal = true;
    equal = equal && (this.FLNGTIMEKEY == null ? that.FLNGTIMEKEY == null : this.FLNGTIMEKEY.equals(that.FLNGTIMEKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGVERRI == null ? that.FLNGVERRI == null : this.FLNGVERRI.equals(that.FLNGVERRI));
    equal = equal && (this.FLNGFOLDERKEY == null ? that.FLNGFOLDERKEY == null : this.FLNGFOLDERKEY.equals(that.FLNGFOLDERKEY));
    equal = equal && (this.FLNGRESOURCEKEY == null ? that.FLNGRESOURCEKEY == null : this.FLNGRESOURCEKEY.equals(that.FLNGRESOURCEKEY));
    equal = equal && (this.FLNGMILESTONEKEY == null ? that.FLNGMILESTONEKEY == null : this.FLNGMILESTONEKEY.equals(that.FLNGMILESTONEKEY));
    equal = equal && (this.FDTMDATEFROM == null ? that.FDTMDATEFROM == null : this.FDTMDATEFROM.equals(that.FDTMDATEFROM));
    equal = equal && (this.FDTMDATETO == null ? that.FDTMDATETO == null : this.FDTMDATETO.equals(that.FDTMDATETO));
    equal = equal && (this.FDBLHOURS == null ? that.FDBLHOURS == null : this.FDBLHOURS.equals(that.FDBLHOURS));
    equal = equal && (this.fstrCellNotes == null ? that.fstrCellNotes == null : this.fstrCellNotes.equals(that.fstrCellNotes));
    equal = equal && (this.FSTRDESCRIPTION == null ? that.FSTRDESCRIPTION == null : this.FSTRDESCRIPTION.equals(that.FSTRDESCRIPTION));
    equal = equal && (this.flngTeamPeriodKey == null ? that.flngTeamPeriodKey == null : this.flngTeamPeriodKey.equals(that.flngTeamPeriodKey));
    equal = equal && (this.fdtmDate == null ? that.fdtmDate == null : this.fdtmDate.equals(that.fdtmDate));
    equal = equal && (this.fstrActivity == null ? that.fstrActivity == null : this.fstrActivity.equals(that.fstrActivity));
    equal = equal && (this.fblnReport == null ? that.fblnReport == null : this.fblnReport.equals(that.fblnReport));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblteamtime)) {
      return false;
    }
    tblteamtime that = (tblteamtime) o;
    boolean equal = true;
    equal = equal && (this.FLNGTIMEKEY == null ? that.FLNGTIMEKEY == null : this.FLNGTIMEKEY.equals(that.FLNGTIMEKEY));
    equal = equal && (this.FLNGVER == null ? that.FLNGVER == null : this.FLNGVER.equals(that.FLNGVER));
    equal = equal && (this.FLNGVERLAST == null ? that.FLNGVERLAST == null : this.FLNGVERLAST.equals(that.FLNGVERLAST));
    equal = equal && (this.FLNGVERRI == null ? that.FLNGVERRI == null : this.FLNGVERRI.equals(that.FLNGVERRI));
    equal = equal && (this.FLNGFOLDERKEY == null ? that.FLNGFOLDERKEY == null : this.FLNGFOLDERKEY.equals(that.FLNGFOLDERKEY));
    equal = equal && (this.FLNGRESOURCEKEY == null ? that.FLNGRESOURCEKEY == null : this.FLNGRESOURCEKEY.equals(that.FLNGRESOURCEKEY));
    equal = equal && (this.FLNGMILESTONEKEY == null ? that.FLNGMILESTONEKEY == null : this.FLNGMILESTONEKEY.equals(that.FLNGMILESTONEKEY));
    equal = equal && (this.FDTMDATEFROM == null ? that.FDTMDATEFROM == null : this.FDTMDATEFROM.equals(that.FDTMDATEFROM));
    equal = equal && (this.FDTMDATETO == null ? that.FDTMDATETO == null : this.FDTMDATETO.equals(that.FDTMDATETO));
    equal = equal && (this.FDBLHOURS == null ? that.FDBLHOURS == null : this.FDBLHOURS.equals(that.FDBLHOURS));
    equal = equal && (this.fstrCellNotes == null ? that.fstrCellNotes == null : this.fstrCellNotes.equals(that.fstrCellNotes));
    equal = equal && (this.FSTRDESCRIPTION == null ? that.FSTRDESCRIPTION == null : this.FSTRDESCRIPTION.equals(that.FSTRDESCRIPTION));
    equal = equal && (this.flngTeamPeriodKey == null ? that.flngTeamPeriodKey == null : this.flngTeamPeriodKey.equals(that.flngTeamPeriodKey));
    equal = equal && (this.fdtmDate == null ? that.fdtmDate == null : this.fdtmDate.equals(that.fdtmDate));
    equal = equal && (this.fstrActivity == null ? that.fstrActivity == null : this.fstrActivity.equals(that.fstrActivity));
    equal = equal && (this.fblnReport == null ? that.fblnReport == null : this.fblnReport.equals(that.fblnReport));
    equal = equal && (this.FSTRWHO == null ? that.FSTRWHO == null : this.FSTRWHO.equals(that.FSTRWHO));
    equal = equal && (this.FDTMWHEN == null ? that.FDTMWHEN == null : this.FDTMWHEN.equals(that.FDTMWHEN));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FLNGTIMEKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVERRI = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGFOLDERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGRESOURCEKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGMILESTONEKEY = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMDATEFROM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMDATETO = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDBLHOURS = JdbcWritableBridge.readDouble(10, __dbResults);
    this.fstrCellNotes = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRDESCRIPTION = JdbcWritableBridge.readString(12, __dbResults);
    this.flngTeamPeriodKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fdtmDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrActivity = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnReport = JdbcWritableBridge.readInteger(16, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(17, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FLNGTIMEKEY = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FLNGVER = JdbcWritableBridge.readInteger(2, __dbResults);
    this.FLNGVERLAST = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FLNGVERRI = JdbcWritableBridge.readInteger(4, __dbResults);
    this.FLNGFOLDERKEY = JdbcWritableBridge.readInteger(5, __dbResults);
    this.FLNGRESOURCEKEY = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLNGMILESTONEKEY = JdbcWritableBridge.readInteger(7, __dbResults);
    this.FDTMDATEFROM = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.FDTMDATETO = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.FDBLHOURS = JdbcWritableBridge.readDouble(10, __dbResults);
    this.fstrCellNotes = JdbcWritableBridge.readString(11, __dbResults);
    this.FSTRDESCRIPTION = JdbcWritableBridge.readString(12, __dbResults);
    this.flngTeamPeriodKey = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fdtmDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrActivity = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnReport = JdbcWritableBridge.readInteger(16, __dbResults);
    this.FSTRWHO = JdbcWritableBridge.readString(17, __dbResults);
    this.FDTMWHEN = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeInteger(FLNGTIMEKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERRI, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGFOLDERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGRESOURCEKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGMILESTONEKEY, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDATEFROM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDATETO, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(FDBLHOURS, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fstrCellNotes, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDESCRIPTION, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamPeriodKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrActivity, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReport, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(FLNGTIMEKEY, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVER, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERLAST, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGVERRI, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGFOLDERKEY, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGRESOURCEKEY, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLNGMILESTONEKEY, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDATEFROM, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMDATETO, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(FDBLHOURS, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fstrCellNotes, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDESCRIPTION, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTeamPeriodKey, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrActivity, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReport, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(FSTRWHO, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FDTMWHEN, 18 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FLNGTIMEKEY = null;
    } else {
    this.FLNGTIMEKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVER = null;
    } else {
    this.FLNGVER = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVERLAST = null;
    } else {
    this.FLNGVERLAST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGVERRI = null;
    } else {
    this.FLNGVERRI = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGFOLDERKEY = null;
    } else {
    this.FLNGFOLDERKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGRESOURCEKEY = null;
    } else {
    this.FLNGRESOURCEKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLNGMILESTONEKEY = null;
    } else {
    this.FLNGMILESTONEKEY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMDATEFROM = null;
    } else {
    this.FDTMDATEFROM = new Timestamp(__dataIn.readLong());
    this.FDTMDATEFROM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMDATETO = null;
    } else {
    this.FDTMDATETO = new Timestamp(__dataIn.readLong());
    this.FDTMDATETO.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FDBLHOURS = null;
    } else {
    this.FDBLHOURS = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCellNotes = null;
    } else {
    this.fstrCellNotes = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDESCRIPTION = null;
    } else {
    this.FSTRDESCRIPTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngTeamPeriodKey = null;
    } else {
    this.flngTeamPeriodKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDate = null;
    } else {
    this.fdtmDate = new Timestamp(__dataIn.readLong());
    this.fdtmDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrActivity = null;
    } else {
    this.fstrActivity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReport = null;
    } else {
    this.fblnReport = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRWHO = null;
    } else {
    this.FSTRWHO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FDTMWHEN = null;
    } else {
    this.FDTMWHEN = new Timestamp(__dataIn.readLong());
    this.FDTMWHEN.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGTIMEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTIMEKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGVERRI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERRI);
    }
    if (null == this.FLNGFOLDERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGFOLDERKEY);
    }
    if (null == this.FLNGRESOURCEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRESOURCEKEY);
    }
    if (null == this.FLNGMILESTONEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGMILESTONEKEY);
    }
    if (null == this.FDTMDATEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDATEFROM.getTime());
    __dataOut.writeInt(this.FDTMDATEFROM.getNanos());
    }
    if (null == this.FDTMDATETO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDATETO.getTime());
    __dataOut.writeInt(this.FDTMDATETO.getNanos());
    }
    if (null == this.FDBLHOURS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.FDBLHOURS);
    }
    if (null == this.fstrCellNotes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCellNotes);
    }
    if (null == this.FSTRDESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDESCRIPTION);
    }
    if (null == this.flngTeamPeriodKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamPeriodKey);
    }
    if (null == this.fdtmDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDate.getTime());
    __dataOut.writeInt(this.fdtmDate.getNanos());
    }
    if (null == this.fstrActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActivity);
    }
    if (null == this.fblnReport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReport);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FLNGTIMEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGTIMEKEY);
    }
    if (null == this.FLNGVER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVER);
    }
    if (null == this.FLNGVERLAST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERLAST);
    }
    if (null == this.FLNGVERRI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGVERRI);
    }
    if (null == this.FLNGFOLDERKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGFOLDERKEY);
    }
    if (null == this.FLNGRESOURCEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGRESOURCEKEY);
    }
    if (null == this.FLNGMILESTONEKEY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLNGMILESTONEKEY);
    }
    if (null == this.FDTMDATEFROM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDATEFROM.getTime());
    __dataOut.writeInt(this.FDTMDATEFROM.getNanos());
    }
    if (null == this.FDTMDATETO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMDATETO.getTime());
    __dataOut.writeInt(this.FDTMDATETO.getNanos());
    }
    if (null == this.FDBLHOURS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.FDBLHOURS);
    }
    if (null == this.fstrCellNotes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCellNotes);
    }
    if (null == this.FSTRDESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDESCRIPTION);
    }
    if (null == this.flngTeamPeriodKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTeamPeriodKey);
    }
    if (null == this.fdtmDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDate.getTime());
    __dataOut.writeInt(this.fdtmDate.getNanos());
    }
    if (null == this.fstrActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActivity);
    }
    if (null == this.fblnReport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReport);
    }
    if (null == this.FSTRWHO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRWHO);
    }
    if (null == this.FDTMWHEN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FDTMWHEN.getTime());
    __dataOut.writeInt(this.FDTMWHEN.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTIMEKEY==null?"\\N":"" + FLNGTIMEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERRI==null?"\\N":"" + FLNGVERRI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGFOLDERKEY==null?"\\N":"" + FLNGFOLDERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRESOURCEKEY==null?"\\N":"" + FLNGRESOURCEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGMILESTONEKEY==null?"\\N":"" + FLNGMILESTONEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDATEFROM==null?"\\N":"" + FDTMDATEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDATETO==null?"\\N":"" + FDTMDATETO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDBLHOURS==null?"\\N":"" + FDBLHOURS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCellNotes==null?"\\N":fstrCellNotes, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDESCRIPTION==null?"\\N":FSTRDESCRIPTION, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamPeriodKey==null?"\\N":"" + flngTeamPeriodKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDate==null?"\\N":"" + fdtmDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActivity==null?"\\N":fstrActivity, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReport==null?"\\N":"" + fblnReport, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGTIMEKEY==null?"\\N":"" + FLNGTIMEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVER==null?"\\N":"" + FLNGVER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERLAST==null?"\\N":"" + FLNGVERLAST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGVERRI==null?"\\N":"" + FLNGVERRI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGFOLDERKEY==null?"\\N":"" + FLNGFOLDERKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGRESOURCEKEY==null?"\\N":"" + FLNGRESOURCEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLNGMILESTONEKEY==null?"\\N":"" + FLNGMILESTONEKEY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDATEFROM==null?"\\N":"" + FDTMDATEFROM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMDATETO==null?"\\N":"" + FDTMDATETO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDBLHOURS==null?"\\N":"" + FDBLHOURS, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCellNotes==null?"\\N":fstrCellNotes, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDESCRIPTION==null?"\\N":FSTRDESCRIPTION, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTeamPeriodKey==null?"\\N":"" + flngTeamPeriodKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDate==null?"\\N":"" + fdtmDate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActivity==null?"\\N":fstrActivity, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReport==null?"\\N":"" + fblnReport, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRWHO==null?"\\N":FSTRWHO, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FDTMWHEN==null?"\\N":"" + FDTMWHEN, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTIMEKEY = null; } else {
      this.FLNGTIMEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERRI = null; } else {
      this.FLNGVERRI = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGFOLDERKEY = null; } else {
      this.FLNGFOLDERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRESOURCEKEY = null; } else {
      this.FLNGRESOURCEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGMILESTONEKEY = null; } else {
      this.FLNGMILESTONEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDATEFROM = null; } else {
      this.FDTMDATEFROM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDATETO = null; } else {
      this.FDTMDATETO = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDBLHOURS = null; } else {
      this.FDBLHOURS = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCellNotes = null; } else {
      this.fstrCellNotes = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDESCRIPTION = null; } else {
      this.FSTRDESCRIPTION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamPeriodKey = null; } else {
      this.flngTeamPeriodKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDate = null; } else {
      this.fdtmDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActivity = null; } else {
      this.fstrActivity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReport = null; } else {
      this.fblnReport = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGTIMEKEY = null; } else {
      this.FLNGTIMEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVER = null; } else {
      this.FLNGVER = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERLAST = null; } else {
      this.FLNGVERLAST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGVERRI = null; } else {
      this.FLNGVERRI = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGFOLDERKEY = null; } else {
      this.FLNGFOLDERKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGRESOURCEKEY = null; } else {
      this.FLNGRESOURCEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLNGMILESTONEKEY = null; } else {
      this.FLNGMILESTONEKEY = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDATEFROM = null; } else {
      this.FDTMDATEFROM = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMDATETO = null; } else {
      this.FDTMDATETO = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDBLHOURS = null; } else {
      this.FDBLHOURS = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCellNotes = null; } else {
      this.fstrCellNotes = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDESCRIPTION = null; } else {
      this.FSTRDESCRIPTION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTeamPeriodKey = null; } else {
      this.flngTeamPeriodKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDate = null; } else {
      this.fdtmDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActivity = null; } else {
      this.fstrActivity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReport = null; } else {
      this.fblnReport = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRWHO = null; } else {
      this.FSTRWHO = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FDTMWHEN = null; } else {
      this.FDTMWHEN = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblteamtime o = (tblteamtime) super.clone();
    o.FDTMDATEFROM = (o.FDTMDATEFROM != null) ? (java.sql.Timestamp) o.FDTMDATEFROM.clone() : null;
    o.FDTMDATETO = (o.FDTMDATETO != null) ? (java.sql.Timestamp) o.FDTMDATETO.clone() : null;
    o.fdtmDate = (o.fdtmDate != null) ? (java.sql.Timestamp) o.fdtmDate.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
    return o;
  }

  public void clone0(tblteamtime o) throws CloneNotSupportedException {
    o.FDTMDATEFROM = (o.FDTMDATEFROM != null) ? (java.sql.Timestamp) o.FDTMDATEFROM.clone() : null;
    o.FDTMDATETO = (o.FDTMDATETO != null) ? (java.sql.Timestamp) o.FDTMDATETO.clone() : null;
    o.fdtmDate = (o.fdtmDate != null) ? (java.sql.Timestamp) o.fdtmDate.clone() : null;
    o.FDTMWHEN = (o.FDTMWHEN != null) ? (java.sql.Timestamp) o.FDTMWHEN.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FLNGTIMEKEY", this.FLNGTIMEKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGVERRI", this.FLNGVERRI);
    __sqoop$field_map.put("FLNGFOLDERKEY", this.FLNGFOLDERKEY);
    __sqoop$field_map.put("FLNGRESOURCEKEY", this.FLNGRESOURCEKEY);
    __sqoop$field_map.put("FLNGMILESTONEKEY", this.FLNGMILESTONEKEY);
    __sqoop$field_map.put("FDTMDATEFROM", this.FDTMDATEFROM);
    __sqoop$field_map.put("FDTMDATETO", this.FDTMDATETO);
    __sqoop$field_map.put("FDBLHOURS", this.FDBLHOURS);
    __sqoop$field_map.put("fstrCellNotes", this.fstrCellNotes);
    __sqoop$field_map.put("FSTRDESCRIPTION", this.FSTRDESCRIPTION);
    __sqoop$field_map.put("flngTeamPeriodKey", this.flngTeamPeriodKey);
    __sqoop$field_map.put("fdtmDate", this.fdtmDate);
    __sqoop$field_map.put("fstrActivity", this.fstrActivity);
    __sqoop$field_map.put("fblnReport", this.fblnReport);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FLNGTIMEKEY", this.FLNGTIMEKEY);
    __sqoop$field_map.put("FLNGVER", this.FLNGVER);
    __sqoop$field_map.put("FLNGVERLAST", this.FLNGVERLAST);
    __sqoop$field_map.put("FLNGVERRI", this.FLNGVERRI);
    __sqoop$field_map.put("FLNGFOLDERKEY", this.FLNGFOLDERKEY);
    __sqoop$field_map.put("FLNGRESOURCEKEY", this.FLNGRESOURCEKEY);
    __sqoop$field_map.put("FLNGMILESTONEKEY", this.FLNGMILESTONEKEY);
    __sqoop$field_map.put("FDTMDATEFROM", this.FDTMDATEFROM);
    __sqoop$field_map.put("FDTMDATETO", this.FDTMDATETO);
    __sqoop$field_map.put("FDBLHOURS", this.FDBLHOURS);
    __sqoop$field_map.put("fstrCellNotes", this.fstrCellNotes);
    __sqoop$field_map.put("FSTRDESCRIPTION", this.FSTRDESCRIPTION);
    __sqoop$field_map.put("flngTeamPeriodKey", this.flngTeamPeriodKey);
    __sqoop$field_map.put("fdtmDate", this.fdtmDate);
    __sqoop$field_map.put("fstrActivity", this.fstrActivity);
    __sqoop$field_map.put("fblnReport", this.fblnReport);
    __sqoop$field_map.put("FSTRWHO", this.FSTRWHO);
    __sqoop$field_map.put("FDTMWHEN", this.FDTMWHEN);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
