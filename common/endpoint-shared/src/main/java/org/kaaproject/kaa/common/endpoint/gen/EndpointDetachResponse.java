/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EndpointDetachResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EndpointDetachResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"result\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int requestId;
   private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EndpointDetachResponse() {}

  /**
   * All-args constructor.
   */
  public EndpointDetachResponse(java.lang.Integer requestId, org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result) {
    this.requestId = requestId;
    this.result = result;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return result;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = (java.lang.Integer)value$; break;
    case 1: result = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.Integer getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.Integer value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'result' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
    return result;
  }

  /**
   * Sets the value of the 'result' field.
   * @param value the value to set.
   */
  public void setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
    this.result = value;
  }

  /** Creates a new EndpointDetachResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder();
  }
  
  /** Creates a new EndpointDetachResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder(other);
  }
  
  /** Creates a new EndpointDetachResponse RecordBuilder by copying an existing EndpointDetachResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for EndpointDetachResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EndpointDetachResponse>
    implements org.apache.avro.data.RecordBuilder<EndpointDetachResponse> {

    private int requestId;
    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.result)) {
        this.result = data().deepCopy(fields()[1].schema(), other.result);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EndpointDetachResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.result)) {
        this.result = data().deepCopy(fields()[1].schema(), other.result);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'requestId' field */
    public java.lang.Integer getRequestId() {
      return requestId;
    }
    
    /** Sets the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder setRequestId(int value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestId' field has been set */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder clearRequestId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
      return result;
    }
    
    /** Sets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
      validate(fields()[1], value);
      this.result = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'result' field has been set */
    public boolean hasResult() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse.Builder clearResult() {
      result = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EndpointDetachResponse build() {
      try {
        EndpointDetachResponse record = new EndpointDetachResponse();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.Integer) defaultValue(fields()[0]);
        record.result = fieldSetFlags()[1] ? this.result : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
