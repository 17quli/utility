// ORM class for table 'tblnz_accgstinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:03:13 NZDT 2020
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

public class tblnz_accgstinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnPricesIncGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnPricesIncGST = (Integer)value;
      }
    });
    setters.put("fblnExemptSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnExemptSupplies = (Integer)value;
      }
    });
    setters.put("fblnImporter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnImporter = (Integer)value;
      }
    });
    setters.put("fblnExporter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnExporter = (Integer)value;
      }
    });
    setters.put("fstrRegCircumstance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrRegCircumstance = (String)value;
      }
    });
    setters.put("fblnUnpolicedFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnUnpolicedFiler = (Integer)value;
      }
    });
    setters.put("fblnSelfInvoicing", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnSelfInvoicing = (Integer)value;
      }
    });
    setters.put("fblnHospiceFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnHospiceFiler = (Integer)value;
      }
    });
    setters.put("fstrHospiceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrHospiceType = (String)value;
      }
    });
    setters.put("fstrLastAccountingBasis", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrLastAccountingBasis = (String)value;
      }
    });
    setters.put("fblnGSTOnElectronicServices", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnGSTOnElectronicServices = (Integer)value;
      }
    });
    setters.put("fstrGORSType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrGORSType = (String)value;
      }
    });
    setters.put("fblnGSTOnLVIG", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnGSTOnLVIG = (Integer)value;
      }
    });
    setters.put("fstrLVIGType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrLVIGType = (String)value;
      }
    });
    setters.put("fblnLVIG1K", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnLVIG1K = (Integer)value;
      }
    });
    setters.put("fblnZeroRatedFinancialServices", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnZeroRatedFinancialServices = (Integer)value;
      }
    });
    setters.put("fdtmReopened", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fdtmReopened = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintHeritageProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fintHeritageProfileNumber = (Integer)value;
      }
    });
    setters.put("fblnNonResBusinessClaimant", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fblnNonResBusinessClaimant = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accgstinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accgstinfo() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accgstinfo with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnPricesIncGST;
  public Integer get_fblnPricesIncGST() {
    return fblnPricesIncGST;
  }
  public void set_fblnPricesIncGST(Integer fblnPricesIncGST) {
    this.fblnPricesIncGST = fblnPricesIncGST;
  }
  public tblnz_accgstinfo with_fblnPricesIncGST(Integer fblnPricesIncGST) {
    this.fblnPricesIncGST = fblnPricesIncGST;
    return this;
  }
  private Integer fblnExemptSupplies;
  public Integer get_fblnExemptSupplies() {
    return fblnExemptSupplies;
  }
  public void set_fblnExemptSupplies(Integer fblnExemptSupplies) {
    this.fblnExemptSupplies = fblnExemptSupplies;
  }
  public tblnz_accgstinfo with_fblnExemptSupplies(Integer fblnExemptSupplies) {
    this.fblnExemptSupplies = fblnExemptSupplies;
    return this;
  }
  private Integer fblnImporter;
  public Integer get_fblnImporter() {
    return fblnImporter;
  }
  public void set_fblnImporter(Integer fblnImporter) {
    this.fblnImporter = fblnImporter;
  }
  public tblnz_accgstinfo with_fblnImporter(Integer fblnImporter) {
    this.fblnImporter = fblnImporter;
    return this;
  }
  private Integer fblnExporter;
  public Integer get_fblnExporter() {
    return fblnExporter;
  }
  public void set_fblnExporter(Integer fblnExporter) {
    this.fblnExporter = fblnExporter;
  }
  public tblnz_accgstinfo with_fblnExporter(Integer fblnExporter) {
    this.fblnExporter = fblnExporter;
    return this;
  }
  private String fstrRegCircumstance;
  public String get_fstrRegCircumstance() {
    return fstrRegCircumstance;
  }
  public void set_fstrRegCircumstance(String fstrRegCircumstance) {
    this.fstrRegCircumstance = fstrRegCircumstance;
  }
  public tblnz_accgstinfo with_fstrRegCircumstance(String fstrRegCircumstance) {
    this.fstrRegCircumstance = fstrRegCircumstance;
    return this;
  }
  private Integer fblnUnpolicedFiler;
  public Integer get_fblnUnpolicedFiler() {
    return fblnUnpolicedFiler;
  }
  public void set_fblnUnpolicedFiler(Integer fblnUnpolicedFiler) {
    this.fblnUnpolicedFiler = fblnUnpolicedFiler;
  }
  public tblnz_accgstinfo with_fblnUnpolicedFiler(Integer fblnUnpolicedFiler) {
    this.fblnUnpolicedFiler = fblnUnpolicedFiler;
    return this;
  }
  private Integer fblnSelfInvoicing;
  public Integer get_fblnSelfInvoicing() {
    return fblnSelfInvoicing;
  }
  public void set_fblnSelfInvoicing(Integer fblnSelfInvoicing) {
    this.fblnSelfInvoicing = fblnSelfInvoicing;
  }
  public tblnz_accgstinfo with_fblnSelfInvoicing(Integer fblnSelfInvoicing) {
    this.fblnSelfInvoicing = fblnSelfInvoicing;
    return this;
  }
  private Integer fblnHospiceFiler;
  public Integer get_fblnHospiceFiler() {
    return fblnHospiceFiler;
  }
  public void set_fblnHospiceFiler(Integer fblnHospiceFiler) {
    this.fblnHospiceFiler = fblnHospiceFiler;
  }
  public tblnz_accgstinfo with_fblnHospiceFiler(Integer fblnHospiceFiler) {
    this.fblnHospiceFiler = fblnHospiceFiler;
    return this;
  }
  private String fstrHospiceType;
  public String get_fstrHospiceType() {
    return fstrHospiceType;
  }
  public void set_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
  }
  public tblnz_accgstinfo with_fstrHospiceType(String fstrHospiceType) {
    this.fstrHospiceType = fstrHospiceType;
    return this;
  }
  private String fstrLastAccountingBasis;
  public String get_fstrLastAccountingBasis() {
    return fstrLastAccountingBasis;
  }
  public void set_fstrLastAccountingBasis(String fstrLastAccountingBasis) {
    this.fstrLastAccountingBasis = fstrLastAccountingBasis;
  }
  public tblnz_accgstinfo with_fstrLastAccountingBasis(String fstrLastAccountingBasis) {
    this.fstrLastAccountingBasis = fstrLastAccountingBasis;
    return this;
  }
  private Integer fblnGSTOnElectronicServices;
  public Integer get_fblnGSTOnElectronicServices() {
    return fblnGSTOnElectronicServices;
  }
  public void set_fblnGSTOnElectronicServices(Integer fblnGSTOnElectronicServices) {
    this.fblnGSTOnElectronicServices = fblnGSTOnElectronicServices;
  }
  public tblnz_accgstinfo with_fblnGSTOnElectronicServices(Integer fblnGSTOnElectronicServices) {
    this.fblnGSTOnElectronicServices = fblnGSTOnElectronicServices;
    return this;
  }
  private String fstrGORSType;
  public String get_fstrGORSType() {
    return fstrGORSType;
  }
  public void set_fstrGORSType(String fstrGORSType) {
    this.fstrGORSType = fstrGORSType;
  }
  public tblnz_accgstinfo with_fstrGORSType(String fstrGORSType) {
    this.fstrGORSType = fstrGORSType;
    return this;
  }
  private Integer fblnGSTOnLVIG;
  public Integer get_fblnGSTOnLVIG() {
    return fblnGSTOnLVIG;
  }
  public void set_fblnGSTOnLVIG(Integer fblnGSTOnLVIG) {
    this.fblnGSTOnLVIG = fblnGSTOnLVIG;
  }
  public tblnz_accgstinfo with_fblnGSTOnLVIG(Integer fblnGSTOnLVIG) {
    this.fblnGSTOnLVIG = fblnGSTOnLVIG;
    return this;
  }
  private String fstrLVIGType;
  public String get_fstrLVIGType() {
    return fstrLVIGType;
  }
  public void set_fstrLVIGType(String fstrLVIGType) {
    this.fstrLVIGType = fstrLVIGType;
  }
  public tblnz_accgstinfo with_fstrLVIGType(String fstrLVIGType) {
    this.fstrLVIGType = fstrLVIGType;
    return this;
  }
  private Integer fblnLVIG1K;
  public Integer get_fblnLVIG1K() {
    return fblnLVIG1K;
  }
  public void set_fblnLVIG1K(Integer fblnLVIG1K) {
    this.fblnLVIG1K = fblnLVIG1K;
  }
  public tblnz_accgstinfo with_fblnLVIG1K(Integer fblnLVIG1K) {
    this.fblnLVIG1K = fblnLVIG1K;
    return this;
  }
  private Integer fblnZeroRatedFinancialServices;
  public Integer get_fblnZeroRatedFinancialServices() {
    return fblnZeroRatedFinancialServices;
  }
  public void set_fblnZeroRatedFinancialServices(Integer fblnZeroRatedFinancialServices) {
    this.fblnZeroRatedFinancialServices = fblnZeroRatedFinancialServices;
  }
  public tblnz_accgstinfo with_fblnZeroRatedFinancialServices(Integer fblnZeroRatedFinancialServices) {
    this.fblnZeroRatedFinancialServices = fblnZeroRatedFinancialServices;
    return this;
  }
  private java.sql.Timestamp fdtmReopened;
  public java.sql.Timestamp get_fdtmReopened() {
    return fdtmReopened;
  }
  public void set_fdtmReopened(java.sql.Timestamp fdtmReopened) {
    this.fdtmReopened = fdtmReopened;
  }
  public tblnz_accgstinfo with_fdtmReopened(java.sql.Timestamp fdtmReopened) {
    this.fdtmReopened = fdtmReopened;
    return this;
  }
  private Integer fintHeritageProfileNumber;
  public Integer get_fintHeritageProfileNumber() {
    return fintHeritageProfileNumber;
  }
  public void set_fintHeritageProfileNumber(Integer fintHeritageProfileNumber) {
    this.fintHeritageProfileNumber = fintHeritageProfileNumber;
  }
  public tblnz_accgstinfo with_fintHeritageProfileNumber(Integer fintHeritageProfileNumber) {
    this.fintHeritageProfileNumber = fintHeritageProfileNumber;
    return this;
  }
  private Integer fblnNonResBusinessClaimant;
  public Integer get_fblnNonResBusinessClaimant() {
    return fblnNonResBusinessClaimant;
  }
  public void set_fblnNonResBusinessClaimant(Integer fblnNonResBusinessClaimant) {
    this.fblnNonResBusinessClaimant = fblnNonResBusinessClaimant;
  }
  public tblnz_accgstinfo with_fblnNonResBusinessClaimant(Integer fblnNonResBusinessClaimant) {
    this.fblnNonResBusinessClaimant = fblnNonResBusinessClaimant;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accgstinfo with_fstrWho(String fstrWho) {
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
  public tblnz_accgstinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accgstinfo)) {
      return false;
    }
    tblnz_accgstinfo that = (tblnz_accgstinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnPricesIncGST == null ? that.fblnPricesIncGST == null : this.fblnPricesIncGST.equals(that.fblnPricesIncGST));
    equal = equal && (this.fblnExemptSupplies == null ? that.fblnExemptSupplies == null : this.fblnExemptSupplies.equals(that.fblnExemptSupplies));
    equal = equal && (this.fblnImporter == null ? that.fblnImporter == null : this.fblnImporter.equals(that.fblnImporter));
    equal = equal && (this.fblnExporter == null ? that.fblnExporter == null : this.fblnExporter.equals(that.fblnExporter));
    equal = equal && (this.fstrRegCircumstance == null ? that.fstrRegCircumstance == null : this.fstrRegCircumstance.equals(that.fstrRegCircumstance));
    equal = equal && (this.fblnUnpolicedFiler == null ? that.fblnUnpolicedFiler == null : this.fblnUnpolicedFiler.equals(that.fblnUnpolicedFiler));
    equal = equal && (this.fblnSelfInvoicing == null ? that.fblnSelfInvoicing == null : this.fblnSelfInvoicing.equals(that.fblnSelfInvoicing));
    equal = equal && (this.fblnHospiceFiler == null ? that.fblnHospiceFiler == null : this.fblnHospiceFiler.equals(that.fblnHospiceFiler));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fstrLastAccountingBasis == null ? that.fstrLastAccountingBasis == null : this.fstrLastAccountingBasis.equals(that.fstrLastAccountingBasis));
    equal = equal && (this.fblnGSTOnElectronicServices == null ? that.fblnGSTOnElectronicServices == null : this.fblnGSTOnElectronicServices.equals(that.fblnGSTOnElectronicServices));
    equal = equal && (this.fstrGORSType == null ? that.fstrGORSType == null : this.fstrGORSType.equals(that.fstrGORSType));
    equal = equal && (this.fblnGSTOnLVIG == null ? that.fblnGSTOnLVIG == null : this.fblnGSTOnLVIG.equals(that.fblnGSTOnLVIG));
    equal = equal && (this.fstrLVIGType == null ? that.fstrLVIGType == null : this.fstrLVIGType.equals(that.fstrLVIGType));
    equal = equal && (this.fblnLVIG1K == null ? that.fblnLVIG1K == null : this.fblnLVIG1K.equals(that.fblnLVIG1K));
    equal = equal && (this.fblnZeroRatedFinancialServices == null ? that.fblnZeroRatedFinancialServices == null : this.fblnZeroRatedFinancialServices.equals(that.fblnZeroRatedFinancialServices));
    equal = equal && (this.fdtmReopened == null ? that.fdtmReopened == null : this.fdtmReopened.equals(that.fdtmReopened));
    equal = equal && (this.fintHeritageProfileNumber == null ? that.fintHeritageProfileNumber == null : this.fintHeritageProfileNumber.equals(that.fintHeritageProfileNumber));
    equal = equal && (this.fblnNonResBusinessClaimant == null ? that.fblnNonResBusinessClaimant == null : this.fblnNonResBusinessClaimant.equals(that.fblnNonResBusinessClaimant));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accgstinfo)) {
      return false;
    }
    tblnz_accgstinfo that = (tblnz_accgstinfo) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnPricesIncGST == null ? that.fblnPricesIncGST == null : this.fblnPricesIncGST.equals(that.fblnPricesIncGST));
    equal = equal && (this.fblnExemptSupplies == null ? that.fblnExemptSupplies == null : this.fblnExemptSupplies.equals(that.fblnExemptSupplies));
    equal = equal && (this.fblnImporter == null ? that.fblnImporter == null : this.fblnImporter.equals(that.fblnImporter));
    equal = equal && (this.fblnExporter == null ? that.fblnExporter == null : this.fblnExporter.equals(that.fblnExporter));
    equal = equal && (this.fstrRegCircumstance == null ? that.fstrRegCircumstance == null : this.fstrRegCircumstance.equals(that.fstrRegCircumstance));
    equal = equal && (this.fblnUnpolicedFiler == null ? that.fblnUnpolicedFiler == null : this.fblnUnpolicedFiler.equals(that.fblnUnpolicedFiler));
    equal = equal && (this.fblnSelfInvoicing == null ? that.fblnSelfInvoicing == null : this.fblnSelfInvoicing.equals(that.fblnSelfInvoicing));
    equal = equal && (this.fblnHospiceFiler == null ? that.fblnHospiceFiler == null : this.fblnHospiceFiler.equals(that.fblnHospiceFiler));
    equal = equal && (this.fstrHospiceType == null ? that.fstrHospiceType == null : this.fstrHospiceType.equals(that.fstrHospiceType));
    equal = equal && (this.fstrLastAccountingBasis == null ? that.fstrLastAccountingBasis == null : this.fstrLastAccountingBasis.equals(that.fstrLastAccountingBasis));
    equal = equal && (this.fblnGSTOnElectronicServices == null ? that.fblnGSTOnElectronicServices == null : this.fblnGSTOnElectronicServices.equals(that.fblnGSTOnElectronicServices));
    equal = equal && (this.fstrGORSType == null ? that.fstrGORSType == null : this.fstrGORSType.equals(that.fstrGORSType));
    equal = equal && (this.fblnGSTOnLVIG == null ? that.fblnGSTOnLVIG == null : this.fblnGSTOnLVIG.equals(that.fblnGSTOnLVIG));
    equal = equal && (this.fstrLVIGType == null ? that.fstrLVIGType == null : this.fstrLVIGType.equals(that.fstrLVIGType));
    equal = equal && (this.fblnLVIG1K == null ? that.fblnLVIG1K == null : this.fblnLVIG1K.equals(that.fblnLVIG1K));
    equal = equal && (this.fblnZeroRatedFinancialServices == null ? that.fblnZeroRatedFinancialServices == null : this.fblnZeroRatedFinancialServices.equals(that.fblnZeroRatedFinancialServices));
    equal = equal && (this.fdtmReopened == null ? that.fdtmReopened == null : this.fdtmReopened.equals(that.fdtmReopened));
    equal = equal && (this.fintHeritageProfileNumber == null ? that.fintHeritageProfileNumber == null : this.fintHeritageProfileNumber.equals(that.fintHeritageProfileNumber));
    equal = equal && (this.fblnNonResBusinessClaimant == null ? that.fblnNonResBusinessClaimant == null : this.fblnNonResBusinessClaimant.equals(that.fblnNonResBusinessClaimant));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnPricesIncGST = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnExemptSupplies = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnImporter = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnExporter = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrRegCircumstance = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnUnpolicedFiler = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnSelfInvoicing = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnHospiceFiler = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLastAccountingBasis = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnGSTOnElectronicServices = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrGORSType = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnGSTOnLVIG = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrLVIGType = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnLVIG1K = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnZeroRatedFinancialServices = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmReopened = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fintHeritageProfileNumber = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnNonResBusinessClaimant = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnPricesIncGST = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnExemptSupplies = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnImporter = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnExporter = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrRegCircumstance = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnUnpolicedFiler = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnSelfInvoicing = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnHospiceFiler = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrHospiceType = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLastAccountingBasis = JdbcWritableBridge.readString(11, __dbResults);
    this.fblnGSTOnElectronicServices = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fstrGORSType = JdbcWritableBridge.readString(13, __dbResults);
    this.fblnGSTOnLVIG = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrLVIGType = JdbcWritableBridge.readString(15, __dbResults);
    this.fblnLVIG1K = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnZeroRatedFinancialServices = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fdtmReopened = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fintHeritageProfileNumber = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnNonResBusinessClaimant = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnPricesIncGST, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExemptSupplies, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImporter, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExporter, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegCircumstance, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnpolicedFiler, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSelfInvoicing, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospiceFiler, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastAccountingBasis, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTOnElectronicServices, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrGORSType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTOnLVIG, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLVIGType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLVIG1K, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRatedFinancialServices, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReopened, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageProfileNumber, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResBusinessClaimant, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPricesIncGST, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExemptSupplies, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImporter, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExporter, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegCircumstance, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnpolicedFiler, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSelfInvoicing, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHospiceFiler, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHospiceType, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastAccountingBasis, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTOnElectronicServices, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrGORSType, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGSTOnLVIG, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLVIGType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLVIG1K, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnZeroRatedFinancialServices, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReopened, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintHeritageProfileNumber, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNonResBusinessClaimant, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
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
        this.fblnPricesIncGST = null;
    } else {
    this.fblnPricesIncGST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExemptSupplies = null;
    } else {
    this.fblnExemptSupplies = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnImporter = null;
    } else {
    this.fblnImporter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExporter = null;
    } else {
    this.fblnExporter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRegCircumstance = null;
    } else {
    this.fstrRegCircumstance = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUnpolicedFiler = null;
    } else {
    this.fblnUnpolicedFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSelfInvoicing = null;
    } else {
    this.fblnSelfInvoicing = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHospiceFiler = null;
    } else {
    this.fblnHospiceFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHospiceType = null;
    } else {
    this.fstrHospiceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastAccountingBasis = null;
    } else {
    this.fstrLastAccountingBasis = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGSTOnElectronicServices = null;
    } else {
    this.fblnGSTOnElectronicServices = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrGORSType = null;
    } else {
    this.fstrGORSType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGSTOnLVIG = null;
    } else {
    this.fblnGSTOnLVIG = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLVIGType = null;
    } else {
    this.fstrLVIGType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLVIG1K = null;
    } else {
    this.fblnLVIG1K = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnZeroRatedFinancialServices = null;
    } else {
    this.fblnZeroRatedFinancialServices = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReopened = null;
    } else {
    this.fdtmReopened = new Timestamp(__dataIn.readLong());
    this.fdtmReopened.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintHeritageProfileNumber = null;
    } else {
    this.fintHeritageProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNonResBusinessClaimant = null;
    } else {
    this.fblnNonResBusinessClaimant = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fblnPricesIncGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPricesIncGST);
    }
    if (null == this.fblnExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExemptSupplies);
    }
    if (null == this.fblnImporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImporter);
    }
    if (null == this.fblnExporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExporter);
    }
    if (null == this.fstrRegCircumstance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegCircumstance);
    }
    if (null == this.fblnUnpolicedFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnpolicedFiler);
    }
    if (null == this.fblnSelfInvoicing) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSelfInvoicing);
    }
    if (null == this.fblnHospiceFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospiceFiler);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fstrLastAccountingBasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastAccountingBasis);
    }
    if (null == this.fblnGSTOnElectronicServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTOnElectronicServices);
    }
    if (null == this.fstrGORSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGORSType);
    }
    if (null == this.fblnGSTOnLVIG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTOnLVIG);
    }
    if (null == this.fstrLVIGType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLVIGType);
    }
    if (null == this.fblnLVIG1K) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLVIG1K);
    }
    if (null == this.fblnZeroRatedFinancialServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRatedFinancialServices);
    }
    if (null == this.fdtmReopened) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReopened.getTime());
    __dataOut.writeInt(this.fdtmReopened.getNanos());
    }
    if (null == this.fintHeritageProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageProfileNumber);
    }
    if (null == this.fblnNonResBusinessClaimant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResBusinessClaimant);
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
    if (null == this.fblnPricesIncGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPricesIncGST);
    }
    if (null == this.fblnExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExemptSupplies);
    }
    if (null == this.fblnImporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImporter);
    }
    if (null == this.fblnExporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExporter);
    }
    if (null == this.fstrRegCircumstance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegCircumstance);
    }
    if (null == this.fblnUnpolicedFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnpolicedFiler);
    }
    if (null == this.fblnSelfInvoicing) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSelfInvoicing);
    }
    if (null == this.fblnHospiceFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHospiceFiler);
    }
    if (null == this.fstrHospiceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHospiceType);
    }
    if (null == this.fstrLastAccountingBasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastAccountingBasis);
    }
    if (null == this.fblnGSTOnElectronicServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTOnElectronicServices);
    }
    if (null == this.fstrGORSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrGORSType);
    }
    if (null == this.fblnGSTOnLVIG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGSTOnLVIG);
    }
    if (null == this.fstrLVIGType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLVIGType);
    }
    if (null == this.fblnLVIG1K) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLVIG1K);
    }
    if (null == this.fblnZeroRatedFinancialServices) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnZeroRatedFinancialServices);
    }
    if (null == this.fdtmReopened) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReopened.getTime());
    __dataOut.writeInt(this.fdtmReopened.getNanos());
    }
    if (null == this.fintHeritageProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintHeritageProfileNumber);
    }
    if (null == this.fblnNonResBusinessClaimant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNonResBusinessClaimant);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPricesIncGST==null?"\\N":"" + fblnPricesIncGST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExemptSupplies==null?"\\N":"" + fblnExemptSupplies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImporter==null?"\\N":"" + fblnImporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExporter==null?"\\N":"" + fblnExporter, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegCircumstance==null?"\\N":fstrRegCircumstance, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnpolicedFiler==null?"\\N":"" + fblnUnpolicedFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSelfInvoicing==null?"\\N":"" + fblnSelfInvoicing, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospiceFiler==null?"\\N":"" + fblnHospiceFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastAccountingBasis==null?"\\N":fstrLastAccountingBasis, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTOnElectronicServices==null?"\\N":"" + fblnGSTOnElectronicServices, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGORSType==null?"\\N":fstrGORSType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTOnLVIG==null?"\\N":"" + fblnGSTOnLVIG, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLVIGType==null?"\\N":fstrLVIGType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLVIG1K==null?"\\N":"" + fblnLVIG1K, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRatedFinancialServices==null?"\\N":"" + fblnZeroRatedFinancialServices, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReopened==null?"\\N":"" + fdtmReopened, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageProfileNumber==null?"\\N":"" + fintHeritageProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResBusinessClaimant==null?"\\N":"" + fblnNonResBusinessClaimant, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPricesIncGST==null?"\\N":"" + fblnPricesIncGST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExemptSupplies==null?"\\N":"" + fblnExemptSupplies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImporter==null?"\\N":"" + fblnImporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExporter==null?"\\N":"" + fblnExporter, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegCircumstance==null?"\\N":fstrRegCircumstance, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnpolicedFiler==null?"\\N":"" + fblnUnpolicedFiler, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSelfInvoicing==null?"\\N":"" + fblnSelfInvoicing, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHospiceFiler==null?"\\N":"" + fblnHospiceFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHospiceType==null?"\\N":fstrHospiceType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastAccountingBasis==null?"\\N":fstrLastAccountingBasis, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTOnElectronicServices==null?"\\N":"" + fblnGSTOnElectronicServices, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrGORSType==null?"\\N":fstrGORSType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGSTOnLVIG==null?"\\N":"" + fblnGSTOnLVIG, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLVIGType==null?"\\N":fstrLVIGType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLVIG1K==null?"\\N":"" + fblnLVIG1K, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnZeroRatedFinancialServices==null?"\\N":"" + fblnZeroRatedFinancialServices, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReopened==null?"\\N":"" + fdtmReopened, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintHeritageProfileNumber==null?"\\N":"" + fintHeritageProfileNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNonResBusinessClaimant==null?"\\N":"" + fblnNonResBusinessClaimant, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPricesIncGST = null; } else {
      this.fblnPricesIncGST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExemptSupplies = null; } else {
      this.fblnExemptSupplies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImporter = null; } else {
      this.fblnImporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExporter = null; } else {
      this.fblnExporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegCircumstance = null; } else {
      this.fstrRegCircumstance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnpolicedFiler = null; } else {
      this.fblnUnpolicedFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSelfInvoicing = null; } else {
      this.fblnSelfInvoicing = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospiceFiler = null; } else {
      this.fblnHospiceFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastAccountingBasis = null; } else {
      this.fstrLastAccountingBasis = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTOnElectronicServices = null; } else {
      this.fblnGSTOnElectronicServices = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGORSType = null; } else {
      this.fstrGORSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTOnLVIG = null; } else {
      this.fblnGSTOnLVIG = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLVIGType = null; } else {
      this.fstrLVIGType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLVIG1K = null; } else {
      this.fblnLVIG1K = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRatedFinancialServices = null; } else {
      this.fblnZeroRatedFinancialServices = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReopened = null; } else {
      this.fdtmReopened = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageProfileNumber = null; } else {
      this.fintHeritageProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResBusinessClaimant = null; } else {
      this.fblnNonResBusinessClaimant = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPricesIncGST = null; } else {
      this.fblnPricesIncGST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExemptSupplies = null; } else {
      this.fblnExemptSupplies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImporter = null; } else {
      this.fblnImporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExporter = null; } else {
      this.fblnExporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegCircumstance = null; } else {
      this.fstrRegCircumstance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnpolicedFiler = null; } else {
      this.fblnUnpolicedFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSelfInvoicing = null; } else {
      this.fblnSelfInvoicing = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHospiceFiler = null; } else {
      this.fblnHospiceFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHospiceType = null; } else {
      this.fstrHospiceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastAccountingBasis = null; } else {
      this.fstrLastAccountingBasis = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTOnElectronicServices = null; } else {
      this.fblnGSTOnElectronicServices = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrGORSType = null; } else {
      this.fstrGORSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGSTOnLVIG = null; } else {
      this.fblnGSTOnLVIG = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLVIGType = null; } else {
      this.fstrLVIGType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLVIG1K = null; } else {
      this.fblnLVIG1K = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnZeroRatedFinancialServices = null; } else {
      this.fblnZeroRatedFinancialServices = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReopened = null; } else {
      this.fdtmReopened = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintHeritageProfileNumber = null; } else {
      this.fintHeritageProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNonResBusinessClaimant = null; } else {
      this.fblnNonResBusinessClaimant = Integer.valueOf(__cur_str);
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
    tblnz_accgstinfo o = (tblnz_accgstinfo) super.clone();
    o.fdtmReopened = (o.fdtmReopened != null) ? (java.sql.Timestamp) o.fdtmReopened.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accgstinfo o) throws CloneNotSupportedException {
    o.fdtmReopened = (o.fdtmReopened != null) ? (java.sql.Timestamp) o.fdtmReopened.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnPricesIncGST", this.fblnPricesIncGST);
    __sqoop$field_map.put("fblnExemptSupplies", this.fblnExemptSupplies);
    __sqoop$field_map.put("fblnImporter", this.fblnImporter);
    __sqoop$field_map.put("fblnExporter", this.fblnExporter);
    __sqoop$field_map.put("fstrRegCircumstance", this.fstrRegCircumstance);
    __sqoop$field_map.put("fblnUnpolicedFiler", this.fblnUnpolicedFiler);
    __sqoop$field_map.put("fblnSelfInvoicing", this.fblnSelfInvoicing);
    __sqoop$field_map.put("fblnHospiceFiler", this.fblnHospiceFiler);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fstrLastAccountingBasis", this.fstrLastAccountingBasis);
    __sqoop$field_map.put("fblnGSTOnElectronicServices", this.fblnGSTOnElectronicServices);
    __sqoop$field_map.put("fstrGORSType", this.fstrGORSType);
    __sqoop$field_map.put("fblnGSTOnLVIG", this.fblnGSTOnLVIG);
    __sqoop$field_map.put("fstrLVIGType", this.fstrLVIGType);
    __sqoop$field_map.put("fblnLVIG1K", this.fblnLVIG1K);
    __sqoop$field_map.put("fblnZeroRatedFinancialServices", this.fblnZeroRatedFinancialServices);
    __sqoop$field_map.put("fdtmReopened", this.fdtmReopened);
    __sqoop$field_map.put("fintHeritageProfileNumber", this.fintHeritageProfileNumber);
    __sqoop$field_map.put("fblnNonResBusinessClaimant", this.fblnNonResBusinessClaimant);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnPricesIncGST", this.fblnPricesIncGST);
    __sqoop$field_map.put("fblnExemptSupplies", this.fblnExemptSupplies);
    __sqoop$field_map.put("fblnImporter", this.fblnImporter);
    __sqoop$field_map.put("fblnExporter", this.fblnExporter);
    __sqoop$field_map.put("fstrRegCircumstance", this.fstrRegCircumstance);
    __sqoop$field_map.put("fblnUnpolicedFiler", this.fblnUnpolicedFiler);
    __sqoop$field_map.put("fblnSelfInvoicing", this.fblnSelfInvoicing);
    __sqoop$field_map.put("fblnHospiceFiler", this.fblnHospiceFiler);
    __sqoop$field_map.put("fstrHospiceType", this.fstrHospiceType);
    __sqoop$field_map.put("fstrLastAccountingBasis", this.fstrLastAccountingBasis);
    __sqoop$field_map.put("fblnGSTOnElectronicServices", this.fblnGSTOnElectronicServices);
    __sqoop$field_map.put("fstrGORSType", this.fstrGORSType);
    __sqoop$field_map.put("fblnGSTOnLVIG", this.fblnGSTOnLVIG);
    __sqoop$field_map.put("fstrLVIGType", this.fstrLVIGType);
    __sqoop$field_map.put("fblnLVIG1K", this.fblnLVIG1K);
    __sqoop$field_map.put("fblnZeroRatedFinancialServices", this.fblnZeroRatedFinancialServices);
    __sqoop$field_map.put("fdtmReopened", this.fdtmReopened);
    __sqoop$field_map.put("fintHeritageProfileNumber", this.fintHeritageProfileNumber);
    __sqoop$field_map.put("fblnNonResBusinessClaimant", this.fblnNonResBusinessClaimant);
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
