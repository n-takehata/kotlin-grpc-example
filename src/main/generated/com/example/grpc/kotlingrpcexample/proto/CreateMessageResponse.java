// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package com.example.grpc.kotlingrpcexample.proto;

/**
 * Protobuf type {@code CreateMessageResponse}
 */
public  final class CreateMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateMessageResponse)
    CreateMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMessageResponse.newBuilder() to construct.
  private CreateMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMessageResponse() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateMessageResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.example.grpc.kotlingrpcexample.proto.Message.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.example.grpc.kotlingrpcexample.proto.Message.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.kotlingrpcexample.proto.MessageProtobuf.internal_static_CreateMessageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.kotlingrpcexample.proto.MessageProtobuf.internal_static_CreateMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.class, com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.example.grpc.kotlingrpcexample.proto.Message message_;
  /**
   * <code>.Message message = 1;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.Message message = 1;</code>
   */
  public com.example.grpc.kotlingrpcexample.proto.Message getMessage() {
    return message_ == null ? com.example.grpc.kotlingrpcexample.proto.Message.getDefaultInstance() : message_;
  }
  /**
   * <code>.Message message = 1;</code>
   */
  public com.example.grpc.kotlingrpcexample.proto.MessageOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.MessageType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.MessageType type = 2;</code>
   */
  public com.example.grpc.kotlingrpcexample.proto.MessageType getType() {
    com.example.grpc.kotlingrpcexample.proto.MessageType result = com.example.grpc.kotlingrpcexample.proto.MessageType.valueOf(type_);
    return result == null ? com.example.grpc.kotlingrpcexample.proto.MessageType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
    if (type_ != com.example.grpc.kotlingrpcexample.proto.MessageType.NONE.getNumber()) {
      output.writeEnum(2, type_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
    }
    if (type_ != com.example.grpc.kotlingrpcexample.proto.MessageType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse other = (com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse) obj;

    boolean result = true;
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && type_ == other.type_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CreateMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateMessageResponse)
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.kotlingrpcexample.proto.MessageProtobuf.internal_static_CreateMessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.kotlingrpcexample.proto.MessageProtobuf.internal_static_CreateMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.class, com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.Builder.class);
    }

    // Construct using com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      type_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.kotlingrpcexample.proto.MessageProtobuf.internal_static_CreateMessageResponse_descriptor;
    }

    public com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse getDefaultInstanceForType() {
      return com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.getDefaultInstance();
    }

    public com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse build() {
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse buildPartial() {
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse result = new com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse(this);
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      result.type_ = type_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse) {
        return mergeFrom((com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse other) {
      if (other == com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.grpc.kotlingrpcexample.proto.Message message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.kotlingrpcexample.proto.Message, com.example.grpc.kotlingrpcexample.proto.Message.Builder, com.example.grpc.kotlingrpcexample.proto.MessageOrBuilder> messageBuilder_;
    /**
     * <code>.Message message = 1;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public com.example.grpc.kotlingrpcexample.proto.Message getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.example.grpc.kotlingrpcexample.proto.Message.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public Builder setMessage(com.example.grpc.kotlingrpcexample.proto.Message value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public Builder setMessage(
        com.example.grpc.kotlingrpcexample.proto.Message.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public Builder mergeMessage(com.example.grpc.kotlingrpcexample.proto.Message value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.example.grpc.kotlingrpcexample.proto.Message.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public com.example.grpc.kotlingrpcexample.proto.Message.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.Message message = 1;</code>
     */
    public com.example.grpc.kotlingrpcexample.proto.MessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.example.grpc.kotlingrpcexample.proto.Message.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.Message message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.kotlingrpcexample.proto.Message, com.example.grpc.kotlingrpcexample.proto.Message.Builder, com.example.grpc.kotlingrpcexample.proto.MessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.kotlingrpcexample.proto.Message, com.example.grpc.kotlingrpcexample.proto.Message.Builder, com.example.grpc.kotlingrpcexample.proto.MessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private int type_ = 0;
    /**
     * <code>.MessageType type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.MessageType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.MessageType type = 2;</code>
     */
    public com.example.grpc.kotlingrpcexample.proto.MessageType getType() {
      com.example.grpc.kotlingrpcexample.proto.MessageType result = com.example.grpc.kotlingrpcexample.proto.MessageType.valueOf(type_);
      return result == null ? com.example.grpc.kotlingrpcexample.proto.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.MessageType type = 2;</code>
     */
    public Builder setType(com.example.grpc.kotlingrpcexample.proto.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.MessageType type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CreateMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:CreateMessageResponse)
  private static final com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse();
  }

  public static com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateMessageResponse>() {
    public CreateMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMessageResponse> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.kotlingrpcexample.proto.CreateMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
