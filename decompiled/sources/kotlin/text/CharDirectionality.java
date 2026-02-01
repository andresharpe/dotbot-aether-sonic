package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C2107u;
import kotlin.collections.V;
import kotlin.jvm.internal.C2197u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "", "value", "I", "g", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", com.harman.log.b.f47574c, "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CharDirectionality {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ CharDirectionality[] $VALUES;

    @l3.d
    public static final b Companion;

    @l3.d
    private static final kotlin.A<Map<Integer, CharDirectionality>> directionalityMap$delegate;
    private final int value;
    public static final CharDirectionality UNDEFINED = new CharDirectionality("UNDEFINED", 0, -1);
    public static final CharDirectionality LEFT_TO_RIGHT = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
    public static final CharDirectionality RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
    public static final CharDirectionality RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final CharDirectionality EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
    public static final CharDirectionality EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final CharDirectionality EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final CharDirectionality ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
    public static final CharDirectionality COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final CharDirectionality NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
    public static final CharDirectionality BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
    public static final CharDirectionality PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
    public static final CharDirectionality SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
    public static final CharDirectionality WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
    public static final CharDirectionality OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
    public static final CharDirectionality LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final CharDirectionality LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final CharDirectionality RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final CharDirectionality RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final CharDirectionality POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private final Map<Integer, CharDirectionality> a() {
            return (Map) CharDirectionality.directionalityMap$delegate.getValue();
        }

        @l3.d
        public final CharDirectionality b(int i4) {
            CharDirectionality charDirectionality = a().get(Integer.valueOf(i4));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i4 + " is not defined.");
        }

        private b() {
        }
    }

    static {
        CharDirectionality[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new b(null);
        directionalityMap$delegate = kotlin.B.a(new X2.a<Map<Integer, ? extends CharDirectionality>>() { // from class: kotlin.text.CharDirectionality.a
            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Map<Integer, CharDirectionality> n() {
                kotlin.enums.a<CharDirectionality> f4 = CharDirectionality.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.s.u(V.j(C2107u.b0(f4, 10)), 16));
                for (Object obj : f4) {
                    linkedHashMap.put(Integer.valueOf(((CharDirectionality) obj).g()), obj);
                }
                return linkedHashMap;
            }
        });
    }

    private CharDirectionality(String str, int i4, int i5) {
        this.value = i5;
    }

    private static final /* synthetic */ CharDirectionality[] b() {
        return new CharDirectionality[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    @l3.d
    public static kotlin.enums.a<CharDirectionality> f() {
        return $ENTRIES;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) $VALUES.clone();
    }

    public final int g() {
        return this.value;
    }
}
