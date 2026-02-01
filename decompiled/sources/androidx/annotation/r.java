package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@P2.a
@P2.c(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface r {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f4583a = a.f4587a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4584b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4585c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4586d = 2;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4587a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f4588b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f4589c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f4590d = 2;

        private a() {
        }
    }

    int unit() default 1;
}
