package com.amazonaws.util.json;

import com.amazonaws.util.g;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
final class e implements com.amazonaws.util.json.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24319a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f24319a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24319a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24319a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24319a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24319a[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24319a[JsonToken.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24319a[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24319a[JsonToken.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24319a[JsonToken.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24319a[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements com.amazonaws.util.json.b {

        /* renamed from: a, reason: collision with root package name */
        private final JsonReader f24320a;

        public b(Reader reader) {
            this.f24320a = new JsonReader(reader);
        }

        @Override // com.amazonaws.util.json.b
        public void a() throws IOException {
            this.f24320a.endObject();
        }

        @Override // com.amazonaws.util.json.b
        public void b() throws IOException {
            this.f24320a.beginObject();
        }

        @Override // com.amazonaws.util.json.b
        public void c() throws IOException {
            this.f24320a.endArray();
        }

        @Override // com.amazonaws.util.json.b
        public void close() throws IOException {
            this.f24320a.close();
        }

        @Override // com.amazonaws.util.json.b
        public void d() throws IOException {
            this.f24320a.beginArray();
        }

        @Override // com.amazonaws.util.json.b
        public String e() throws IOException {
            JsonToken peek = this.f24320a.peek();
            if (JsonToken.NULL.equals(peek)) {
                this.f24320a.nextNull();
                return null;
            }
            if (JsonToken.BOOLEAN.equals(peek)) {
                if (this.f24320a.nextBoolean()) {
                    return L1.a.f1650s3;
                }
                return L1.a.t3;
            }
            return this.f24320a.nextString();
        }

        @Override // com.amazonaws.util.json.b
        public void f() throws IOException {
            this.f24320a.skipValue();
        }

        @Override // com.amazonaws.util.json.b
        public boolean g() throws IOException {
            JsonToken peek = this.f24320a.peek();
            if (!JsonToken.BEGIN_ARRAY.equals(peek) && !JsonToken.BEGIN_OBJECT.equals(peek)) {
                return false;
            }
            return true;
        }

        @Override // com.amazonaws.util.json.b
        public String h() throws IOException {
            return this.f24320a.nextName();
        }

        @Override // com.amazonaws.util.json.b
        public boolean hasNext() throws IOException {
            return this.f24320a.hasNext();
        }

        @Override // com.amazonaws.util.json.b
        public AwsJsonToken peek() throws IOException {
            try {
                return e.d(this.f24320a.peek());
            } catch (EOFException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements com.amazonaws.util.json.c {

        /* renamed from: b, reason: collision with root package name */
        private static final int f24321b = -3;

        /* renamed from: a, reason: collision with root package name */
        private final JsonWriter f24322a;

        public c(Writer writer) {
            this.f24322a = new JsonWriter(writer);
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c a() throws IOException {
            this.f24322a.endObject();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c b() throws IOException {
            this.f24322a.beginObject();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c c() throws IOException {
            this.f24322a.endArray();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public void close() throws IOException {
            this.f24322a.close();
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c d() throws IOException {
            this.f24322a.beginArray();
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c e(long j4) throws IOException {
            this.f24322a.value(j4);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c f(double d4) throws IOException {
            this.f24322a.value(d4);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public void flush() throws IOException {
            this.f24322a.flush();
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c g(String str) throws IOException {
            this.f24322a.value(str);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c h(Date date) throws IOException {
            this.f24322a.value(BigDecimal.valueOf(date.getTime()).scaleByPowerOfTen(-3));
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c i(ByteBuffer byteBuffer) throws IOException {
            byteBuffer.mark();
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr, 0, remaining);
            byteBuffer.reset();
            this.f24322a.value(g.d(bArr));
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c j(boolean z3) throws IOException {
            this.f24322a.value(z3);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c k(Number number) throws IOException {
            this.f24322a.value(number);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c l(String str) throws IOException {
            this.f24322a.name(str);
            return this;
        }

        @Override // com.amazonaws.util.json.c
        public com.amazonaws.util.json.c value() throws IOException {
            this.f24322a.nullValue();
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AwsJsonToken d(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        switch (a.f24319a[jsonToken.ordinal()]) {
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
                return AwsJsonToken.VALUE_BOOLEAN;
            case 7:
                return AwsJsonToken.VALUE_NUMBER;
            case 8:
                return AwsJsonToken.VALUE_NULL;
            case 9:
                return AwsJsonToken.VALUE_STRING;
            case 10:
                return null;
            default:
                return AwsJsonToken.UNKNOWN;
        }
    }

    @Override // com.amazonaws.util.json.a
    public com.amazonaws.util.json.c a(Writer writer) {
        return new c(writer);
    }

    @Override // com.amazonaws.util.json.a
    public com.amazonaws.util.json.b b(Reader reader) {
        return new b(reader);
    }
}
