package com.amazonaws.transform;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static com.amazonaws.logging.c f24231a = LogFactory.c(j.class);

    /* loaded from: classes.dex */
    public static class a implements m<BigDecimal, l> {

        /* renamed from: a, reason: collision with root package name */
        private static a f24232a;

        public static a b() {
            if (f24232a == null) {
                f24232a = new a();
            }
            return f24232a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return new BigDecimal(f4);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements m<BigInteger, l> {

        /* renamed from: a, reason: collision with root package name */
        private static b f24233a;

        public static b b() {
            if (f24233a == null) {
                f24233a = new b();
            }
            return f24233a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigInteger a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return new BigInteger(f4);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements m<Boolean, l> {

        /* renamed from: a, reason: collision with root package name */
        private static c f24234a;

        public static c b() {
            if (f24234a == null) {
                f24234a = new c();
            }
            return f24234a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements m<ByteBuffer, l> {

        /* renamed from: a, reason: collision with root package name */
        private static d f24235a;

        public static d b() {
            if (f24235a == null) {
                f24235a = new d();
            }
            return f24235a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteBuffer a(l lVar) throws Exception {
            return ByteBuffer.wrap(Base64.b(lVar.f()));
        }
    }

    /* loaded from: classes.dex */
    public static class e implements m<Byte, l> {

        /* renamed from: a, reason: collision with root package name */
        private static e f24236a;

        public static e b() {
            if (f24236a == null) {
                f24236a = new e();
            }
            return f24236a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Byte.valueOf(f4);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements m<Date, l> {

        /* renamed from: a, reason: collision with root package name */
        private static f f24237a;

        public static f b() {
            if (f24237a == null) {
                f24237a = new f();
            }
            return f24237a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Date a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            try {
                return com.amazonaws.util.k.j(f4);
            } catch (Exception e4) {
                j.f24231a.j("Unable to parse date '" + f4 + "':  " + e4.getMessage(), e4);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g implements m<Double, l> {

        /* renamed from: a, reason: collision with root package name */
        private static g f24238a;

        public static g b() {
            if (f24238a == null) {
                f24238a = new g();
            }
            return f24238a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class h implements m<Float, l> {

        /* renamed from: a, reason: collision with root package name */
        private static h f24239a;

        public static h b() {
            if (f24239a == null) {
                f24239a = new h();
            }
            return f24239a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Float.valueOf(f4);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements m<Integer, l> {

        /* renamed from: a, reason: collision with root package name */
        private static i f24240a;

        public static i b() {
            if (f24240a == null) {
                f24240a = new i();
            }
            return f24240a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(f4));
        }
    }

    /* renamed from: com.amazonaws.transform.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0207j implements m<Long, l> {

        /* renamed from: a, reason: collision with root package name */
        private static C0207j f24241a;

        public static C0207j b() {
            if (f24241a == null) {
                f24241a = new C0207j();
            }
            return f24241a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long a(l lVar) throws Exception {
            String f4 = lVar.f();
            if (f4 == null) {
                return null;
            }
            return Long.valueOf(Long.parseLong(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class k implements m<String, l> {

        /* renamed from: a, reason: collision with root package name */
        private static k f24242a;

        public static k b() {
            if (f24242a == null) {
                f24242a = new k();
            }
            return f24242a;
        }

        @Override // com.amazonaws.transform.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a(l lVar) throws Exception {
            return lVar.f();
        }
    }
}
