package androidx.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface i0 {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f4573e = a.f4578a;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4574f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4575g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4576h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4577i = 5;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4578a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f4579b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f4580c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f4581d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f4582e = 5;

        private a() {
        }
    }

    int otherwise() default 2;
}
