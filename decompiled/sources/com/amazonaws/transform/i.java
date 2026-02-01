package com.amazonaws.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.Base64;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static class a implements m<BigDecimal, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static a f24219a;

        public static a b() {
            if (f24219a == null) {
                f24219a = new a();
            }
            return f24219a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return new BigDecimal(e4);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements m<BigInteger, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static b f24220a;

        public static b b() {
            if (f24220a == null) {
                f24220a = new b();
            }
            return f24220a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigInteger a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return new BigInteger(e4);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements m<Boolean, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static c f24221a;

        public static c b() {
            if (f24221a == null) {
                f24221a = new c();
            }
            return f24221a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(e4));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements m<ByteBuffer, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static d f24222a;

        public static d b() {
            if (f24222a == null) {
                f24222a = new d();
            }
            return f24222a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteBuffer a(com.amazonaws.transform.c cVar) throws Exception {
            return ByteBuffer.wrap(Base64.b(cVar.c().e()));
        }
    }

    /* loaded from: classes.dex */
    public static class e implements m<Byte, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static e f24223a;

        public static e b() {
            if (f24223a == null) {
                f24223a = new e();
            }
            return f24223a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Byte.valueOf(e4);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements m<Date, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static final int f24224a = 1000;

        /* renamed from: b, reason: collision with root package name */
        private static f f24225b;

        public static f b() {
            if (f24225b == null) {
                f24225b = new f();
            }
            return f24225b;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Date a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            try {
                return new Date(NumberFormat.getInstance(new Locale("en")).parse(e4).longValue() * 1000);
            } catch (ParseException e5) {
                throw new AmazonClientException("Unable to parse date '" + e4 + "':  " + e5.getMessage(), e5);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g implements m<Double, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static g f24226a;

        public static g b() {
            if (f24226a == null) {
                f24226a = new g();
            }
            return f24226a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(e4));
        }
    }

    /* loaded from: classes.dex */
    public static class h implements m<Float, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static h f24227a;

        public static h b() {
            if (f24227a == null) {
                f24227a = new h();
            }
            return f24227a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Float.valueOf(e4);
        }
    }

    /* renamed from: com.amazonaws.transform.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0206i implements m<Integer, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static C0206i f24228a;

        public static C0206i b() {
            if (f24228a == null) {
                f24228a = new C0206i();
            }
            return f24228a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(e4));
        }
    }

    /* loaded from: classes.dex */
    public static class j implements m<Long, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static j f24229a;

        public static j b() {
            if (f24229a == null) {
                f24229a = new j();
            }
            return f24229a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long a(com.amazonaws.transform.c cVar) throws Exception {
            String e4 = cVar.c().e();
            if (e4 == null) {
                return null;
            }
            return Long.valueOf(Long.parseLong(e4));
        }
    }

    /* loaded from: classes.dex */
    public static class k implements m<String, com.amazonaws.transform.c> {

        /* renamed from: a, reason: collision with root package name */
        private static k f24230a;

        public static k b() {
            if (f24230a == null) {
                f24230a = new k();
            }
            return f24230a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a(com.amazonaws.transform.c cVar) throws Exception {
            return cVar.c().e();
        }
    }
}
