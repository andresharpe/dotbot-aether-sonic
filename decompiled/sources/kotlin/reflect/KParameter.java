package kotlin.reflect;

import kotlin.E;
import kotlin.Y;

/* loaded from: classes2.dex */
public interface KParameter extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Kind {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind INSTANCE = new Kind("INSTANCE", 0);
        public static final Kind EXTENSION_RECEIVER = new Kind("EXTENSION_RECEIVER", 1);
        public static final Kind VALUE = new Kind("VALUE", 2);

        static {
            Kind[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Kind(String str, int i4) {
        }

        private static final /* synthetic */ Kind[] b() {
            return new Kind[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
        }

        @l3.d
        public static kotlin.enums.a<Kind> e() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        @Y(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }

    boolean M();

    @l3.d
    Kind b0();

    @l3.e
    String getName();

    int k();

    boolean q0();

    @l3.d
    r x();
}
