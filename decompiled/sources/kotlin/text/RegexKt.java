package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.U;

@U({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1789#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RegexKt {
    public static final /* synthetic */ n a(Matcher matcher, int i4, CharSequence charSequence) {
        return f(matcher, i4, charSequence);
    }

    public static final /* synthetic */ n b(Matcher matcher, CharSequence charSequence) {
        return h(matcher, charSequence);
    }

    public static final /* synthetic */ int e(Iterable iterable) {
        return k(iterable);
    }

    public static final n f(Matcher matcher, int i4, CharSequence charSequence) {
        if (!matcher.find(i4)) {
            return null;
        }
        return new o(matcher, charSequence);
    }

    private static final /* synthetic */ <T extends Enum<T> & InterfaceC2225g> Set<T> g(final int i4) {
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.f5);
        EnumSet allOf = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.F.m(allOf);
        kotlin.jvm.internal.F.w();
        kotlin.collections.A.Q0(allOf, new X2.l<T, Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X2.l
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean C(Enum r32) {
                boolean z3;
                InterfaceC2225g interfaceC2225g = (InterfaceC2225g) r32;
                if ((i4 & interfaceC2225g.b()) == interfaceC2225g.getValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        });
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.F.o(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public static final n h(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new o(matcher, charSequence);
    }

    public static final kotlin.ranges.l i(MatchResult matchResult) {
        kotlin.ranges.l W12;
        W12 = kotlin.ranges.u.W1(matchResult.start(), matchResult.end());
        return W12;
    }

    public static final kotlin.ranges.l j(MatchResult matchResult, int i4) {
        kotlin.ranges.l W12;
        W12 = kotlin.ranges.u.W1(matchResult.start(i4), matchResult.end(i4));
        return W12;
    }

    public static final int k(Iterable<? extends InterfaceC2225g> iterable) {
        Iterator<? extends InterfaceC2225g> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= it.next().getValue();
        }
        return i4;
    }
}
