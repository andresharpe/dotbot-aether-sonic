package kotlinx.android.extensions;

import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CacheImplementation {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ CacheImplementation[] $VALUES;

    @d
    public static final a Companion;

    @d
    private static final CacheImplementation DEFAULT;
    public static final CacheImplementation HASH_MAP;
    public static final CacheImplementation NO_CACHE;
    public static final CacheImplementation SPARSE_ARRAY = new CacheImplementation("SPARSE_ARRAY", 0);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final CacheImplementation a() {
            return CacheImplementation.DEFAULT;
        }

        private a() {
        }
    }

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("HASH_MAP", 1);
        HASH_MAP = cacheImplementation;
        NO_CACHE = new CacheImplementation("NO_CACHE", 2);
        CacheImplementation[] b4 = b();
        $VALUES = b4;
        Companion = new a(null);
        DEFAULT = cacheImplementation;
        $ENTRIES = c.c(b4);
    }

    private CacheImplementation(String str, int i4) {
    }

    private static final /* synthetic */ CacheImplementation[] b() {
        return new CacheImplementation[]{SPARSE_ARRAY, HASH_MAP, NO_CACHE};
    }

    @d
    public static kotlin.enums.a<CacheImplementation> f() {
        return $ENTRIES;
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) $VALUES.clone();
    }
}
