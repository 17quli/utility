// ORM class for table 'tblnz_visitmanagedcall'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:28:52 NZDT 2020
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

public class tblnz_visitmanagedcall extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrCallerIrdNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrCallerIrdNumber = (String)value;
      }
    });
    setters.put("fstrAuthorisedIrdNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrAuthorisedIrdNumber = (String)value;
      }
    });
    setters.put("fstrAuthorisedRelationshipType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrAuthorisedRelationshipType = (String)value;
      }
    });
    setters.put("fstrTaxAgentName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrTaxAgentName = (String)value;
      }
    });
    setters.put("fstrVoiceEnrolStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrVoiceEnrolStatus = (String)value;
      }
    });
    setters.put("fstrVoiceOptOutStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrVoiceOptOutStatus = (String)value;
      }
    });
    setters.put("fstrTransferReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrTransferReason = (String)value;
      }
    });
    setters.put("fstrCallerIntentCorrect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrCallerIntentCorrect = (String)value;
      }
    });
    setters.put("fstrCallerIntent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrCallerIntent = (String)value;
      }
    });
    setters.put("fstrCorrectedIntent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrCorrectedIntent = (String)value;
      }
    });
    setters.put("fstrCallQueue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrCallQueue = (String)value;
      }
    });
    setters.put("fstrStageOneFeedback", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrStageOneFeedback = (String)value;
      }
    });
    setters.put("fblnVirtualHold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fblnVirtualHold = (Integer)value;
      }
    });
    setters.put("fblnContactDetailsChecked", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fblnContactDetailsChecked = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitmanagedcall.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_visitmanagedcall() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_visitmanagedcall with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrCallerIrdNumber;
  public String get_fstrCallerIrdNumber() {
    return fstrCallerIrdNumber;
  }
  public void set_fstrCallerIrdNumber(String fstrCallerIrdNumber) {
    this.fstrCallerIrdNumber = fstrCallerIrdNumber;
  }
  public tblnz_visitmanagedcall with_fstrCallerIrdNumber(String fstrCallerIrdNumber) {
    this.fstrCallerIrdNumber = fstrCallerIrdNumber;
    return this;
  }
  private String fstrAuthorisedIrdNumber;
  public String get_fstrAuthorisedIrdNumber() {
    return fstrAuthorisedIrdNumber;
  }
  public void set_fstrAuthorisedIrdNumber(String fstrAuthorisedIrdNumber) {
    this.fstrAuthorisedIrdNumber = fstrAuthorisedIrdNumber;
  }
  public tblnz_visitmanagedcall with_fstrAuthorisedIrdNumber(String fstrAuthorisedIrdNumber) {
    this.fstrAuthorisedIrdNumber = fstrAuthorisedIrdNumber;
    return this;
  }
  private String fstrAuthorisedRelationshipType;
  public String get_fstrAuthorisedRelationshipType() {
    return fstrAuthorisedRelationshipType;
  }
  public void set_fstrAuthorisedRelationshipType(String fstrAuthorisedRelationshipType) {
    this.fstrAuthorisedRelationshipType = fstrAuthorisedRelationshipType;
  }
  public tblnz_visitmanagedcall with_fstrAuthorisedRelationshipType(String fstrAuthorisedRelationshipType) {
    this.fstrAuthorisedRelationshipType = fstrAuthorisedRelationshipType;
    return this;
  }
  private String fstrTaxAgentName;
  public String get_fstrTaxAgentName() {
    return fstrTaxAgentName;
  }
  public void set_fstrTaxAgentName(String fstrTaxAgentName) {
    this.fstrTaxAgentName = fstrTaxAgentName;
  }
  public tblnz_visitmanagedcall with_fstrTaxAgentName(String fstrTaxAgentName) {
    this.fstrTaxAgentName = fstrTaxAgentName;
    return this;
  }
  private String fstrVoiceEnrolStatus;
  public String get_fstrVoiceEnrolStatus() {
    return fstrVoiceEnrolStatus;
  }
  public void set_fstrVoiceEnrolStatus(String fstrVoiceEnrolStatus) {
    this.fstrVoiceEnrolStatus = fstrVoiceEnrolStatus;
  }
  public tblnz_visitmanagedcall with_fstrVoiceEnrolStatus(String fstrVoiceEnrolStatus) {
    this.fstrVoiceEnrolStatus = fstrVoiceEnrolStatus;
    return this;
  }
  private String fstrVoiceOptOutStatus;
  public String get_fstrVoiceOptOutStatus() {
    return fstrVoiceOptOutStatus;
  }
  public void set_fstrVoiceOptOutStatus(String fstrVoiceOptOutStatus) {
    this.fstrVoiceOptOutStatus = fstrVoiceOptOutStatus;
  }
  public tblnz_visitmanagedcall with_fstrVoiceOptOutStatus(String fstrVoiceOptOutStatus) {
    this.fstrVoiceOptOutStatus = fstrVoiceOptOutStatus;
    return this;
  }
  private String fstrTransferReason;
  public String get_fstrTransferReason() {
    return fstrTransferReason;
  }
  public void set_fstrTransferReason(String fstrTransferReason) {
    this.fstrTransferReason = fstrTransferReason;
  }
  public tblnz_visitmanagedcall with_fstrTransferReason(String fstrTransferReason) {
    this.fstrTransferReason = fstrTransferReason;
    return this;
  }
  private String fstrCallerIntentCorrect;
  public String get_fstrCallerIntentCorrect() {
    return fstrCallerIntentCorrect;
  }
  public void set_fstrCallerIntentCorrect(String fstrCallerIntentCorrect) {
    this.fstrCallerIntentCorrect = fstrCallerIntentCorrect;
  }
  public tblnz_visitmanagedcall with_fstrCallerIntentCorrect(String fstrCallerIntentCorrect) {
    this.fstrCallerIntentCorrect = fstrCallerIntentCorrect;
    return this;
  }
  private String fstrCallerIntent;
  public String get_fstrCallerIntent() {
    return fstrCallerIntent;
  }
  public void set_fstrCallerIntent(String fstrCallerIntent) {
    this.fstrCallerIntent = fstrCallerIntent;
  }
  public tblnz_visitmanagedcall with_fstrCallerIntent(String fstrCallerIntent) {
    this.fstrCallerIntent = fstrCallerIntent;
    return this;
  }
  private String fstrCorrectedIntent;
  public String get_fstrCorrectedIntent() {
    return fstrCorrectedIntent;
  }
  public void set_fstrCorrectedIntent(String fstrCorrectedIntent) {
    this.fstrCorrectedIntent = fstrCorrectedIntent;
  }
  public tblnz_visitmanagedcall with_fstrCorrectedIntent(String fstrCorrectedIntent) {
    this.fstrCorrectedIntent = fstrCorrectedIntent;
    return this;
  }
  private String fstrCallQueue;
  public String get_fstrCallQueue() {
    return fstrCallQueue;
  }
  public void set_fstrCallQueue(String fstrCallQueue) {
    this.fstrCallQueue = fstrCallQueue;
  }
  public tblnz_visitmanagedcall with_fstrCallQueue(String fstrCallQueue) {
    this.fstrCallQueue = fstrCallQueue;
    return this;
  }
  private String fstrStageOneFeedback;
  public String get_fstrStageOneFeedback() {
    return fstrStageOneFeedback;
  }
  public void set_fstrStageOneFeedback(String fstrStageOneFeedback) {
    this.fstrStageOneFeedback = fstrStageOneFeedback;
  }
  public tblnz_visitmanagedcall with_fstrStageOneFeedback(String fstrStageOneFeedback) {
    this.fstrStageOneFeedback = fstrStageOneFeedback;
    return this;
  }
  private Integer fblnVirtualHold;
  public Integer get_fblnVirtualHold() {
    return fblnVirtualHold;
  }
  public void set_fblnVirtualHold(Integer fblnVirtualHold) {
    this.fblnVirtualHold = fblnVirtualHold;
  }
  public tblnz_visitmanagedcall with_fblnVirtualHold(Integer fblnVirtualHold) {
    this.fblnVirtualHold = fblnVirtualHold;
    return this;
  }
  private Integer fblnContactDetailsChecked;
  public Integer get_fblnContactDetailsChecked() {
    return fblnContactDetailsChecked;
  }
  public void set_fblnContactDetailsChecked(Integer fblnContactDetailsChecked) {
    this.fblnContactDetailsChecked = fblnContactDetailsChecked;
  }
  public tblnz_visitmanagedcall with_fblnContactDetailsChecked(Integer fblnContactDetailsChecked) {
    this.fblnContactDetailsChecked = fblnContactDetailsChecked;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_visitmanagedcall with_fstrWho(String fstrWho) {
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
  public tblnz_visitmanagedcall with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_visitmanagedcall)) {
      return false;
    }
    tblnz_visitmanagedcall that = (tblnz_visitmanagedcall) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCallerIrdNumber == null ? that.fstrCallerIrdNumber == null : this.fstrCallerIrdNumber.equals(that.fstrCallerIrdNumber));
    equal = equal && (this.fstrAuthorisedIrdNumber == null ? that.fstrAuthorisedIrdNumber == null : this.fstrAuthorisedIrdNumber.equals(that.fstrAuthorisedIrdNumber));
    equal = equal && (this.fstrAuthorisedRelationshipType == null ? that.fstrAuthorisedRelationshipType == null : this.fstrAuthorisedRelationshipType.equals(that.fstrAuthorisedRelationshipType));
    equal = equal && (this.fstrTaxAgentName == null ? that.fstrTaxAgentName == null : this.fstrTaxAgentName.equals(that.fstrTaxAgentName));
    equal = equal && (this.fstrVoiceEnrolStatus == null ? that.fstrVoiceEnrolStatus == null : this.fstrVoiceEnrolStatus.equals(that.fstrVoiceEnrolStatus));
    equal = equal && (this.fstrVoiceOptOutStatus == null ? that.fstrVoiceOptOutStatus == null : this.fstrVoiceOptOutStatus.equals(that.fstrVoiceOptOutStatus));
    equal = equal && (this.fstrTransferReason == null ? that.fstrTransferReason == null : this.fstrTransferReason.equals(that.fstrTransferReason));
    equal = equal && (this.fstrCallerIntentCorrect == null ? that.fstrCallerIntentCorrect == null : this.fstrCallerIntentCorrect.equals(that.fstrCallerIntentCorrect));
    equal = equal && (this.fstrCallerIntent == null ? that.fstrCallerIntent == null : this.fstrCallerIntent.equals(that.fstrCallerIntent));
    equal = equal && (this.fstrCorrectedIntent == null ? that.fstrCorrectedIntent == null : this.fstrCorrectedIntent.equals(that.fstrCorrectedIntent));
    equal = equal && (this.fstrCallQueue == null ? that.fstrCallQueue == null : this.fstrCallQueue.equals(that.fstrCallQueue));
    equal = equal && (this.fstrStageOneFeedback == null ? that.fstrStageOneFeedback == null : this.fstrStageOneFeedback.equals(that.fstrStageOneFeedback));
    equal = equal && (this.fblnVirtualHold == null ? that.fblnVirtualHold == null : this.fblnVirtualHold.equals(that.fblnVirtualHold));
    equal = equal && (this.fblnContactDetailsChecked == null ? that.fblnContactDetailsChecked == null : this.fblnContactDetailsChecked.equals(that.fblnContactDetailsChecked));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_visitmanagedcall)) {
      return false;
    }
    tblnz_visitmanagedcall that = (tblnz_visitmanagedcall) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrCallerIrdNumber == null ? that.fstrCallerIrdNumber == null : this.fstrCallerIrdNumber.equals(that.fstrCallerIrdNumber));
    equal = equal && (this.fstrAuthorisedIrdNumber == null ? that.fstrAuthorisedIrdNumber == null : this.fstrAuthorisedIrdNumber.equals(that.fstrAuthorisedIrdNumber));
    equal = equal && (this.fstrAuthorisedRelationshipType == null ? that.fstrAuthorisedRelationshipType == null : this.fstrAuthorisedRelationshipType.equals(that.fstrAuthorisedRelationshipType));
    equal = equal && (this.fstrTaxAgentName == null ? that.fstrTaxAgentName == null : this.fstrTaxAgentName.equals(that.fstrTaxAgentName));
    equal = equal && (this.fstrVoiceEnrolStatus == null ? that.fstrVoiceEnrolStatus == null : this.fstrVoiceEnrolStatus.equals(that.fstrVoiceEnrolStatus));
    equal = equal && (this.fstrVoiceOptOutStatus == null ? that.fstrVoiceOptOutStatus == null : this.fstrVoiceOptOutStatus.equals(that.fstrVoiceOptOutStatus));
    equal = equal && (this.fstrTransferReason == null ? that.fstrTransferReason == null : this.fstrTransferReason.equals(that.fstrTransferReason));
    equal = equal && (this.fstrCallerIntentCorrect == null ? that.fstrCallerIntentCorrect == null : this.fstrCallerIntentCorrect.equals(that.fstrCallerIntentCorrect));
    equal = equal && (this.fstrCallerIntent == null ? that.fstrCallerIntent == null : this.fstrCallerIntent.equals(that.fstrCallerIntent));
    equal = equal && (this.fstrCorrectedIntent == null ? that.fstrCorrectedIntent == null : this.fstrCorrectedIntent.equals(that.fstrCorrectedIntent));
    equal = equal && (this.fstrCallQueue == null ? that.fstrCallQueue == null : this.fstrCallQueue.equals(that.fstrCallQueue));
    equal = equal && (this.fstrStageOneFeedback == null ? that.fstrStageOneFeedback == null : this.fstrStageOneFeedback.equals(that.fstrStageOneFeedback));
    equal = equal && (this.fblnVirtualHold == null ? that.fblnVirtualHold == null : this.fblnVirtualHold.equals(that.fblnVirtualHold));
    equal = equal && (this.fblnContactDetailsChecked == null ? that.fblnContactDetailsChecked == null : this.fblnContactDetailsChecked.equals(that.fblnContactDetailsChecked));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCallerIrdNumber = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuthorisedIrdNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAuthorisedRelationshipType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrTaxAgentName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVoiceEnrolStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrVoiceOptOutStatus = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTransferReason = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCallerIntentCorrect = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCallerIntent = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrCorrectedIntent = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrCallQueue = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrStageOneFeedback = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnVirtualHold = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnContactDetailsChecked = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrCallerIrdNumber = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrAuthorisedIrdNumber = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrAuthorisedRelationshipType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrTaxAgentName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVoiceEnrolStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrVoiceOptOutStatus = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTransferReason = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCallerIntentCorrect = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrCallerIntent = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrCorrectedIntent = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrCallQueue = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrStageOneFeedback = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnVirtualHold = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnContactDetailsChecked = JdbcWritableBridge.readInteger(15, __dbResults);
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
    JdbcWritableBridge.writeString(fstrCallerIrdNumber, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuthorisedIrdNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuthorisedRelationshipType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTaxAgentName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoiceEnrolStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoiceOptOutStatus, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransferReason, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerIntentCorrect, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerIntent, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrectedIntent, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallQueue, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageOneFeedback, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVirtualHold, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnContactDetailsChecked, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerIrdNumber, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuthorisedIrdNumber, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAuthorisedRelationshipType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTaxAgentName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoiceEnrolStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVoiceOptOutStatus, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransferReason, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerIntentCorrect, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerIntent, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCorrectedIntent, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallQueue, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStageOneFeedback, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVirtualHold, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnContactDetailsChecked, 15 + __off, -6, __dbStmt);
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
        this.fstrCallerIrdNumber = null;
    } else {
    this.fstrCallerIrdNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuthorisedIrdNumber = null;
    } else {
    this.fstrAuthorisedIrdNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAuthorisedRelationshipType = null;
    } else {
    this.fstrAuthorisedRelationshipType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTaxAgentName = null;
    } else {
    this.fstrTaxAgentName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVoiceEnrolStatus = null;
    } else {
    this.fstrVoiceEnrolStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVoiceOptOutStatus = null;
    } else {
    this.fstrVoiceOptOutStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransferReason = null;
    } else {
    this.fstrTransferReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCallerIntentCorrect = null;
    } else {
    this.fstrCallerIntentCorrect = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCallerIntent = null;
    } else {
    this.fstrCallerIntent = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCorrectedIntent = null;
    } else {
    this.fstrCorrectedIntent = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCallQueue = null;
    } else {
    this.fstrCallQueue = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStageOneFeedback = null;
    } else {
    this.fstrStageOneFeedback = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVirtualHold = null;
    } else {
    this.fblnVirtualHold = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnContactDetailsChecked = null;
    } else {
    this.fblnContactDetailsChecked = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fstrCallerIrdNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIrdNumber);
    }
    if (null == this.fstrAuthorisedIrdNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuthorisedIrdNumber);
    }
    if (null == this.fstrAuthorisedRelationshipType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuthorisedRelationshipType);
    }
    if (null == this.fstrTaxAgentName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTaxAgentName);
    }
    if (null == this.fstrVoiceEnrolStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoiceEnrolStatus);
    }
    if (null == this.fstrVoiceOptOutStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoiceOptOutStatus);
    }
    if (null == this.fstrTransferReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransferReason);
    }
    if (null == this.fstrCallerIntentCorrect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIntentCorrect);
    }
    if (null == this.fstrCallerIntent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIntent);
    }
    if (null == this.fstrCorrectedIntent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrectedIntent);
    }
    if (null == this.fstrCallQueue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallQueue);
    }
    if (null == this.fstrStageOneFeedback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageOneFeedback);
    }
    if (null == this.fblnVirtualHold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVirtualHold);
    }
    if (null == this.fblnContactDetailsChecked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnContactDetailsChecked);
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
    if (null == this.fstrCallerIrdNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIrdNumber);
    }
    if (null == this.fstrAuthorisedIrdNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuthorisedIrdNumber);
    }
    if (null == this.fstrAuthorisedRelationshipType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAuthorisedRelationshipType);
    }
    if (null == this.fstrTaxAgentName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTaxAgentName);
    }
    if (null == this.fstrVoiceEnrolStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoiceEnrolStatus);
    }
    if (null == this.fstrVoiceOptOutStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVoiceOptOutStatus);
    }
    if (null == this.fstrTransferReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransferReason);
    }
    if (null == this.fstrCallerIntentCorrect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIntentCorrect);
    }
    if (null == this.fstrCallerIntent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerIntent);
    }
    if (null == this.fstrCorrectedIntent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCorrectedIntent);
    }
    if (null == this.fstrCallQueue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallQueue);
    }
    if (null == this.fstrStageOneFeedback) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStageOneFeedback);
    }
    if (null == this.fblnVirtualHold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVirtualHold);
    }
    if (null == this.fblnContactDetailsChecked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnContactDetailsChecked);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIrdNumber==null?"\\N":fstrCallerIrdNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuthorisedIrdNumber==null?"\\N":fstrAuthorisedIrdNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuthorisedRelationshipType==null?"\\N":fstrAuthorisedRelationshipType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTaxAgentName==null?"\\N":fstrTaxAgentName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoiceEnrolStatus==null?"\\N":fstrVoiceEnrolStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoiceOptOutStatus==null?"\\N":fstrVoiceOptOutStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransferReason==null?"\\N":fstrTransferReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIntentCorrect==null?"\\N":fstrCallerIntentCorrect, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIntent==null?"\\N":fstrCallerIntent, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrectedIntent==null?"\\N":fstrCorrectedIntent, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallQueue==null?"\\N":fstrCallQueue, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageOneFeedback==null?"\\N":fstrStageOneFeedback, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVirtualHold==null?"\\N":"" + fblnVirtualHold, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnContactDetailsChecked==null?"\\N":"" + fblnContactDetailsChecked, delimiters));
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIrdNumber==null?"\\N":fstrCallerIrdNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuthorisedIrdNumber==null?"\\N":fstrAuthorisedIrdNumber, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAuthorisedRelationshipType==null?"\\N":fstrAuthorisedRelationshipType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTaxAgentName==null?"\\N":fstrTaxAgentName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoiceEnrolStatus==null?"\\N":fstrVoiceEnrolStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVoiceOptOutStatus==null?"\\N":fstrVoiceOptOutStatus, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransferReason==null?"\\N":fstrTransferReason, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIntentCorrect==null?"\\N":fstrCallerIntentCorrect, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerIntent==null?"\\N":fstrCallerIntent, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCorrectedIntent==null?"\\N":fstrCorrectedIntent, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallQueue==null?"\\N":fstrCallQueue, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStageOneFeedback==null?"\\N":fstrStageOneFeedback, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVirtualHold==null?"\\N":"" + fblnVirtualHold, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnContactDetailsChecked==null?"\\N":"" + fblnContactDetailsChecked, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrCallerIrdNumber = null; } else {
      this.fstrCallerIrdNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuthorisedIrdNumber = null; } else {
      this.fstrAuthorisedIrdNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuthorisedRelationshipType = null; } else {
      this.fstrAuthorisedRelationshipType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTaxAgentName = null; } else {
      this.fstrTaxAgentName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoiceEnrolStatus = null; } else {
      this.fstrVoiceEnrolStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoiceOptOutStatus = null; } else {
      this.fstrVoiceOptOutStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransferReason = null; } else {
      this.fstrTransferReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerIntentCorrect = null; } else {
      this.fstrCallerIntentCorrect = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerIntent = null; } else {
      this.fstrCallerIntent = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrectedIntent = null; } else {
      this.fstrCorrectedIntent = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallQueue = null; } else {
      this.fstrCallQueue = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageOneFeedback = null; } else {
      this.fstrStageOneFeedback = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVirtualHold = null; } else {
      this.fblnVirtualHold = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnContactDetailsChecked = null; } else {
      this.fblnContactDetailsChecked = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCallerIrdNumber = null; } else {
      this.fstrCallerIrdNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuthorisedIrdNumber = null; } else {
      this.fstrAuthorisedIrdNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAuthorisedRelationshipType = null; } else {
      this.fstrAuthorisedRelationshipType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTaxAgentName = null; } else {
      this.fstrTaxAgentName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoiceEnrolStatus = null; } else {
      this.fstrVoiceEnrolStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVoiceOptOutStatus = null; } else {
      this.fstrVoiceOptOutStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransferReason = null; } else {
      this.fstrTransferReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerIntentCorrect = null; } else {
      this.fstrCallerIntentCorrect = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerIntent = null; } else {
      this.fstrCallerIntent = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCorrectedIntent = null; } else {
      this.fstrCorrectedIntent = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallQueue = null; } else {
      this.fstrCallQueue = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStageOneFeedback = null; } else {
      this.fstrStageOneFeedback = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVirtualHold = null; } else {
      this.fblnVirtualHold = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnContactDetailsChecked = null; } else {
      this.fblnContactDetailsChecked = Integer.valueOf(__cur_str);
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
    tblnz_visitmanagedcall o = (tblnz_visitmanagedcall) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_visitmanagedcall o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCallerIrdNumber", this.fstrCallerIrdNumber);
    __sqoop$field_map.put("fstrAuthorisedIrdNumber", this.fstrAuthorisedIrdNumber);
    __sqoop$field_map.put("fstrAuthorisedRelationshipType", this.fstrAuthorisedRelationshipType);
    __sqoop$field_map.put("fstrTaxAgentName", this.fstrTaxAgentName);
    __sqoop$field_map.put("fstrVoiceEnrolStatus", this.fstrVoiceEnrolStatus);
    __sqoop$field_map.put("fstrVoiceOptOutStatus", this.fstrVoiceOptOutStatus);
    __sqoop$field_map.put("fstrTransferReason", this.fstrTransferReason);
    __sqoop$field_map.put("fstrCallerIntentCorrect", this.fstrCallerIntentCorrect);
    __sqoop$field_map.put("fstrCallerIntent", this.fstrCallerIntent);
    __sqoop$field_map.put("fstrCorrectedIntent", this.fstrCorrectedIntent);
    __sqoop$field_map.put("fstrCallQueue", this.fstrCallQueue);
    __sqoop$field_map.put("fstrStageOneFeedback", this.fstrStageOneFeedback);
    __sqoop$field_map.put("fblnVirtualHold", this.fblnVirtualHold);
    __sqoop$field_map.put("fblnContactDetailsChecked", this.fblnContactDetailsChecked);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrCallerIrdNumber", this.fstrCallerIrdNumber);
    __sqoop$field_map.put("fstrAuthorisedIrdNumber", this.fstrAuthorisedIrdNumber);
    __sqoop$field_map.put("fstrAuthorisedRelationshipType", this.fstrAuthorisedRelationshipType);
    __sqoop$field_map.put("fstrTaxAgentName", this.fstrTaxAgentName);
    __sqoop$field_map.put("fstrVoiceEnrolStatus", this.fstrVoiceEnrolStatus);
    __sqoop$field_map.put("fstrVoiceOptOutStatus", this.fstrVoiceOptOutStatus);
    __sqoop$field_map.put("fstrTransferReason", this.fstrTransferReason);
    __sqoop$field_map.put("fstrCallerIntentCorrect", this.fstrCallerIntentCorrect);
    __sqoop$field_map.put("fstrCallerIntent", this.fstrCallerIntent);
    __sqoop$field_map.put("fstrCorrectedIntent", this.fstrCorrectedIntent);
    __sqoop$field_map.put("fstrCallQueue", this.fstrCallQueue);
    __sqoop$field_map.put("fstrStageOneFeedback", this.fstrStageOneFeedback);
    __sqoop$field_map.put("fblnVirtualHold", this.fblnVirtualHold);
    __sqoop$field_map.put("fblnContactDetailsChecked", this.fblnContactDetailsChecked);
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
