package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.g;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
final class f implements com.amazonaws.util.json.a {

    /* renamed from: a, reason: collision with root package name */
    private final JsonFactory f24323a = new JsonFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24324a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f24324a = iArr;
            try {
                iArr[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24324a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24324a[JsonToken.START_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24324a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24324a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24324a[JsonToken.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24324a[JsonToken.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24324a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24324a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24324a[JsonToken.VALUE_NULL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24324a[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements com.amazonaws.util.json.b {

        /* renamed from: a, reason: collision with root package name */
        private JsonParser f24325a;

        /* renamed from: b, reason: collision with root package name */
        private JsonToken f24326b = null;

        public b(JsonFactory jsonFactory, Reader reader) {
            try {
                this.f24325a = jsonFactory.createJsonParser(reader);
            } catch (IOException e4) {
                throw new AmazonClientException("Failed to create JSON reader", e4);
            }
        }

        private void i() throws IOException {
            this.f24326b = null;
        }

        private void j(JsonToken jsonToken) throws IOException {
            if (this.f24326b == jsonToken) {
                return;
            }
            throw new IOException("Expected " + jsonToken + " but was " + jsonToken);
        }

        private void k() throws IOException {
            if (this.f24326b == null) {
                this.f24326b = this.f24325a.nextToken();
            }
        }

        @Override // com.amazonaws.util.json.b
        public void a() throws IOException {
            k();
            j(JsonToken.END_OBJECT);
            i();
        }

        @Override // com.amazonaws.util.json.b
        public void b() throws IOException {
            k();
            j(JsonToken.START_OBJECT);
            i();
        }

        @Override // com.amazonaws.util.json.b
        public void c() throws IOException {
            k();
            j(JsonToken.END_ARRAY);
            i();
        }

        @Override // com.amazonaws.util.json.b
        public void close() throws IOException {
            this.f24325a.close();
        }

        @Override // com.amazonaws.util.json.b
        public void d() throws IOException {
            k();
            j(JsonToken.START_ARRAY);
            i();
        }

        @Override // com.amazonaws.util.json.b
        public String e() throws IOException {
            String text;
            k();
            if (JsonToken.VALUE_NULL == this.f24326b) {
                text = null;
            } else {
                text = this.f24325a.getText();
            }
            i();
            return text;
        }

        @Override // com.amazonaws.util.json.b
        public void f() throws IOException {
            k();
            this.f24325a.skipChildren();
            i();
        }

        @Override // com.amazonaws.util.json.b
        public boolean g() throws IOException {
            k();
            if (JsonToken.START_ARRAY != this.f24326b && JsonToken.START_OBJECT != this.f24326b) {
                return false;
            }
            return true;
        }

        @Override // com.amazonaws.util.json.b
        public String h() throws IOException {
            k();
            j(JsonToken.FIELD_NAME);
            i();
            return this.f24325a.getText();
        }

        @Override // com.amazonaws.util.json.b
        public boolean hasNext() throws IOException {
            k();
            if (JsonToken.END_OBJECT != this.f24326b && JsonToken.END_ARRAY != this.f24326b) {
                return true;
            }
            return false;
        }

        @Override // com.amazonaws.util.json.b
        public AwsJsonToken peek() throws IOException {
            k();
            return f.d(this.f24326b);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements com.amazonaws.util.json.c {

        /* renamed from: b, reason: collision with root package name */
        private static final int f24327b = -3;

        /* renamed from: a, reason: collision with root package name */
        private JsonGenerator f24328a;

        public c(JsonFactory jsonFactory, Writer writer) {
            try {
                this.f24328a = jsonFactory.createGenerator(writer);
            } catch (IOException e4) {
                throw new AmazonClientException("Failed to create json writer", e4);
            }
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c a() throws IOException {
            this.f24328a.writeEndObject();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c b() throws IOException {
            this.f24328a.writeStartObject();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c c() throws IOException {
            this.f24328a.writeEndArray();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public void close() throws IOException {
            this.f24328a.close();
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c d() throws IOException {
            this.f24328a.writeStartArray();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c e(long j4) throws IOException {
            this.f24328a.writeNumber(j4);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c f(double d4) throws IOException {
            this.f24328a.writeNumber(d4);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public void flush() throws IOException {
            this.f24328a.flush();
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c g(String str) throws IOException {
            this.f24328a.writeString(str);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c h(Date date) throws IOException {
            this.f24328a.writeNumber(BigDecimal.valueOf(date.getTime()).scaleByPowerOfTen(-3).toPlainString());
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c i(ByteBuffer byteBuffer) throws IOException {
            byteBuffer.mark();
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr, 0, remaining);
            byteBuffer.reset();
            this.f24328a.writeString(g.d(bArr));
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c j(boolean z3) throws IOException {
            this.f24328a.writeBoolean(z3);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c k(Number number) throws IOException {
            this.f24328a.writeNumber(number.toString());
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c l(String str) throws IOException {
            this.f24328a.writeFieldName(str);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c value() throws IOException {
            this.f24328a.writeNull();
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AwsJsonToken d(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        switch (a.f24324a[jsonToken.ordinal()]) {
            case 1:
                return AwsJsonToken.BEGIN_ARRAY;
            case 2:
                return AwsJsonToken.END_ARRAY;
            case 3:
                return AwsJsonToken.BEGIN_OBJECT;
            case 4:
                return AwsJsonToken.END_OBJECT;
            case 5:
                return AwsJsonToken.FIELD_NAME;
            case 6:
            case 7:
                return AwsJsonToken.VALUE_BOOLEAN;
            case 8:
            case 9:
                return AwsJsonToken.VALUE_NUMBER;
            case 10:
                return AwsJsonToken.VALUE_NULL;
            case 11:
                return AwsJsonToken.VALUE_STRING;
            default:
                return AwsJsonToken.UNKNOWN;
        }
    }

    @Override // com.amazonaws.util.json.a
    public com.amazonaws.util.json.c a(Writer writer) {
        return new c(this.f24323a, writer);
    }

    @Override // com.amazonaws.util.json.a
    public com.amazonaws.util.json.b b(Reader reader) {
        return new b(this.f24323a, reader);
    }
}
