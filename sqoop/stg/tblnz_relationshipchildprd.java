// ORM class for table 'tblnz_relationshipchildprd'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:29:57 NZDT 2020
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

public class tblnz_relationshipchildprd extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngRelationshipKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.flngRelationshipKey = (Integer)value;
      }
    });
    setters.put("fintSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fintSequence = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmDateFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fdtmDateFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDateTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fdtmDateTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnFOU", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fblnFOU = (Integer)value;
      }
    });
    setters.put("fblnMSD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fblnMSD = (Integer)value;
      }
    });
    setters.put("fcurPercentageCare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fcurPercentageCare = (java.math.BigDecimal)value;
      }
    });
    setters.put("fintSharedCareDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fintSharedCareDays = (Integer)value;
      }
    });
    setters.put("fstrNote", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fstrNote = (String)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_relationshipchildprd.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_relationshipchildprd() {
    init0();
  }
  private Integer flngRelationshipKey;
  public Integer get_flngRelationshipKey() {
    return flngRelationshipKey;
  }
  public void set_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
  }
  public tblnz_relationshipchildprd with_flngRelationshipKey(Integer flngRelationshipKey) {
    this.flngRelationshipKey = flngRelationshipKey;
    return this;
  }
  private Integer fintSequence;
  public Integer get_fintSequence() {
    return fintSequence;
  }
  public void set_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
  }
  public tblnz_relationshipchildprd with_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_relationshipchildprd with_flngVer(Integer flngVer) {
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
  public tblnz_relationshipchildprd with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmDateFrom;
  public java.sql.Timestamp get_fdtmDateFrom() {
    return fdtmDateFrom;
  }
  public void set_fdtmDateFrom(java.sql.Timestamp fdtmDateFrom) {
    this.fdtmDateFrom = fdtmDateFrom;
  }
  public tblnz_relationshipchildprd with_fdtmDateFrom(java.sql.Timestamp fdtmDateFrom) {
    this.fdtmDateFrom = fdtmDateFrom;
    return this;
  }
  private java.sql.Timestamp fdtmDateTo;
  public java.sql.Timestamp get_fdtmDateTo() {
    return fdtmDateTo;
  }
  public void set_fdtmDateTo(java.sql.Timestamp fdtmDateTo) {
    this.fdtmDateTo = fdtmDateTo;
  }
  public tblnz_relationshipchildprd with_fdtmDateTo(java.sql.Timestamp fdtmDateTo) {
    this.fdtmDateTo = fdtmDateTo;
    return this;
  }
  private Integer fblnFOU;
  public Integer get_fblnFOU() {
    return fblnFOU;
  }
  public void set_fblnFOU(Integer fblnFOU) {
    this.fblnFOU = fblnFOU;
  }
  public tblnz_relationshipchildprd with_fblnFOU(Integer fblnFOU) {
    this.fblnFOU = fblnFOU;
    return this;
  }
  private Integer fblnMSD;
  public Integer get_fblnMSD() {
    return fblnMSD;
  }
  public void set_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
  }
  public tblnz_relationshipchildprd with_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
    return this;
  }
  private java.math.BigDecimal fcurPercentageCare;
  public java.math.BigDecimal get_fcurPercentageCare() {
    return fcurPercentageCare;
  }
  public void set_fcurPercentageCare(java.math.BigDecimal fcurPercentageCare) {
    this.fcurPercentageCare = fcurPercentageCare;
  }
  public tblnz_relationshipchildprd with_fcurPercentageCare(java.math.BigDecimal fcurPercentageCare) {
    this.fcurPercentageCare = fcurPercentageCare;
    return this;
  }
  private Integer fintSharedCareDays;
  public Integer get_fintSharedCareDays() {
    return fintSharedCareDays;
  }
  public void set_fintSharedCareDays(Integer fintSharedCareDays) {
    this.fintSharedCareDays = fintSharedCareDays;
  }
  public tblnz_relationshipchildprd with_fintSharedCareDays(Integer fintSharedCareDays) {
    this.fintSharedCareDays = fintSharedCareDays;
    return this;
  }
  private String fstrNote;
  public String get_fstrNote() {
    return fstrNote;
  }
  public void set_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
  }
  public tblnz_relationshipchildprd with_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblnz_relationshipchildprd with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_relationshipchildprd with_fstrWho(String fstrWho) {
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
  public tblnz_relationshipchildprd with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_relationshipchildprd)) {
      return false;
    }
    tblnz_relationshipchildprd that = (tblnz_relationshipchildprd) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmDateFrom == null ? that.fdtmDateFrom == null : this.fdtmDateFrom.equals(that.fdtmDateFrom));
    equal = equal && (this.fdtmDateTo == null ? that.fdtmDateTo == null : this.fdtmDateTo.equals(that.fdtmDateTo));
    equal = equal && (this.fblnFOU == null ? that.fblnFOU == null : this.fblnFOU.equals(that.fblnFOU));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fcurPercentageCare == null ? that.fcurPercentageCare == null : this.fcurPercentageCare.equals(that.fcurPercentageCare));
    equal = equal && (this.fintSharedCareDays == null ? that.fintSharedCareDays == null : this.fintSharedCareDays.equals(that.fintSharedCareDays));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_relationshipchildprd)) {
      return false;
    }
    tblnz_relationshipchildprd that = (tblnz_relationshipchildprd) o;
    boolean equal = true;
    equal = equal && (this.flngRelationshipKey == null ? that.flngRelationshipKey == null : this.flngRelationshipKey.equals(that.flngRelationshipKey));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmDateFrom == null ? that.fdtmDateFrom == null : this.fdtmDateFrom.equals(that.fdtmDateFrom));
    equal = equal && (this.fdtmDateTo == null ? that.fdtmDateTo == null : this.fdtmDateTo.equals(that.fdtmDateTo));
    equal = equal && (this.fblnFOU == null ? that.fblnFOU == null : this.fblnFOU.equals(that.fblnFOU));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fcurPercentageCare == null ? that.fcurPercentageCare == null : this.fcurPercentageCare.equals(that.fcurPercentageCare));
    equal = equal && (this.fintSharedCareDays == null ? that.fintSharedCareDays == null : this.fintSharedCareDays.equals(that.fintSharedCareDays));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmDateFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmDateTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fblnFOU = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurPercentageCare = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fintSharedCareDays = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngRelationshipKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmDateFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmDateTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fblnFOU = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fcurPercentageCare = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fintSharedCareDays = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFOU, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPercentageCare, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSharedCareDays, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngRelationshipKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDateTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFOU, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPercentageCare, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSharedCareDays, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngRelationshipKey = null;
    } else {
    this.flngRelationshipKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSequence = null;
    } else {
    this.fintSequence = Integer.valueOf(__dataIn.readInt());
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
        this.fdtmDateFrom = null;
    } else {
    this.fdtmDateFrom = new Timestamp(__dataIn.readLong());
    this.fdtmDateFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDateTo = null;
    } else {
    this.fdtmDateTo = new Timestamp(__dataIn.readLong());
    this.fdtmDateTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFOU = null;
    } else {
    this.fblnFOU = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMSD = null;
    } else {
    this.fblnMSD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPercentageCare = null;
    } else {
    this.fcurPercentageCare = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSharedCareDays = null;
    } else {
    this.fintSharedCareDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNote = null;
    } else {
    this.fstrNote = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
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
    if (null == this.fdtmDateFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateFrom.getTime());
    __dataOut.writeInt(this.fdtmDateFrom.getNanos());
    }
    if (null == this.fdtmDateTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTo.getTime());
    __dataOut.writeInt(this.fdtmDateTo.getNanos());
    }
    if (null == this.fblnFOU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFOU);
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fcurPercentageCare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPercentageCare, __dataOut);
    }
    if (null == this.fintSharedCareDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSharedCareDays);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    if (null == this.flngRelationshipKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRelationshipKey);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
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
    if (null == this.fdtmDateFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateFrom.getTime());
    __dataOut.writeInt(this.fdtmDateFrom.getNanos());
    }
    if (null == this.fdtmDateTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDateTo.getTime());
    __dataOut.writeInt(this.fdtmDateTo.getNanos());
    }
    if (null == this.fblnFOU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFOU);
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fcurPercentageCare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPercentageCare, __dataOut);
    }
    if (null == this.fintSharedCareDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSharedCareDays);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateFrom==null?"\\N":"" + fdtmDateFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTo==null?"\\N":"" + fdtmDateTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFOU==null?"\\N":"" + fblnFOU, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPercentageCare==null?"\\N":fcurPercentageCare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSharedCareDays==null?"\\N":"" + fintSharedCareDays, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngRelationshipKey==null?"\\N":"" + flngRelationshipKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateFrom==null?"\\N":"" + fdtmDateFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDateTo==null?"\\N":"" + fdtmDateTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFOU==null?"\\N":"" + fblnFOU, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPercentageCare==null?"\\N":fcurPercentageCare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSharedCareDays==null?"\\N":"" + fintSharedCareDays, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateFrom = null; } else {
      this.fdtmDateFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTo = null; } else {
      this.fdtmDateTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFOU = null; } else {
      this.fblnFOU = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPercentageCare = null; } else {
      this.fcurPercentageCare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSharedCareDays = null; } else {
      this.fintSharedCareDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRelationshipKey = null; } else {
      this.flngRelationshipKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateFrom = null; } else {
      this.fdtmDateFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDateTo = null; } else {
      this.fdtmDateTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFOU = null; } else {
      this.fblnFOU = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPercentageCare = null; } else {
      this.fcurPercentageCare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSharedCareDays = null; } else {
      this.fintSharedCareDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
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
    tblnz_relationshipchildprd o = (tblnz_relationshipchildprd) super.clone();
    o.fdtmDateFrom = (o.fdtmDateFrom != null) ? (java.sql.Timestamp) o.fdtmDateFrom.clone() : null;
    o.fdtmDateTo = (o.fdtmDateTo != null) ? (java.sql.Timestamp) o.fdtmDateTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_relationshipchildprd o) throws CloneNotSupportedException {
    o.fdtmDateFrom = (o.fdtmDateFrom != null) ? (java.sql.Timestamp) o.fdtmDateFrom.clone() : null;
    o.fdtmDateTo = (o.fdtmDateTo != null) ? (java.sql.Timestamp) o.fdtmDateTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmDateFrom", this.fdtmDateFrom);
    __sqoop$field_map.put("fdtmDateTo", this.fdtmDateTo);
    __sqoop$field_map.put("fblnFOU", this.fblnFOU);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fcurPercentageCare", this.fcurPercentageCare);
    __sqoop$field_map.put("fintSharedCareDays", this.fintSharedCareDays);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngRelationshipKey", this.flngRelationshipKey);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmDateFrom", this.fdtmDateFrom);
    __sqoop$field_map.put("fdtmDateTo", this.fdtmDateTo);
    __sqoop$field_map.put("fblnFOU", this.fblnFOU);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fcurPercentageCare", this.fcurPercentageCare);
    __sqoop$field_map.put("fintSharedCareDays", this.fintSharedCareDays);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
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
