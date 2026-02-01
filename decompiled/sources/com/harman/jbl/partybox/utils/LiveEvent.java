package com.harman.jbl.partybox.utils;

import androidx.annotation.InterfaceC0561d;
import androidx.annotation.K;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;

@U({"SMAP\nLiveEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveEvent.kt\ncom/harman/jbl/partybox/utils/LiveEvent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n215#2,2:139\n215#2:141\n216#2:144\n215#2:145\n216#2:148\n1855#3,2:142\n1855#3,2:146\n*S KotlinDebug\n*F\n+ 1 LiveEvent.kt\ncom/harman/jbl/partybox/utils/LiveEvent\n*L\n43#1:139,2\n56#1:141\n56#1:144\n67#1:145\n67#1:148\n57#1:142,2\n68#1:146,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LiveEvent<T> extends N<T> {

    /* renamed from: n, reason: collision with root package name */
    @l3.d
    private final ConcurrentHashMap<E, Set<a<? super T>>> f46161n = new ConcurrentHashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/utils/LiveEvent$Event;", "", "(Ljava/lang/String;I)V", "ON_CLICK", "ON_STOP", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Event {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event ON_CLICK = new Event("ON_CLICK", 0);
        public static final Event ON_STOP = new Event("ON_STOP", 1);

        static {
            Event[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Event(String str, int i4) {
        }

        private static final /* synthetic */ Event[] b() {
            return new Event[]{ON_CLICK, ON_STOP};
        }

        @l3.d
        public static kotlin.enums.a<Event> e() {
            return $ENTRIES;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/harman/jbl/partybox/utils/LiveEvent$QuitEvent;", "", "", "value", "I", "g", "()I", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "PLAY", "AUTHENTICS", "SOUNDSTICK", "HORIZON", "AURASTUDIO", "BANDBOX_SOLO", "BANDBOX_TRIO", "ENCHANT", "AURACAST", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class QuitEvent {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ QuitEvent[] $VALUES;

        @l3.d
        public static final a Companion;

        @l3.d
        private final String desc;
        private final int value;
        public static final QuitEvent PLAY = new QuitEvent("PLAY", 0, 0, L1.a.f1567c0);
        public static final QuitEvent AUTHENTICS = new QuitEvent("AUTHENTICS", 1, 1, "authentics");
        public static final QuitEvent SOUNDSTICK = new QuitEvent("SOUNDSTICK", 2, 2, "soundStick");
        public static final QuitEvent HORIZON = new QuitEvent("HORIZON", 3, 3, "horizon");
        public static final QuitEvent AURASTUDIO = new QuitEvent("AURASTUDIO", 4, 4, "auraStudio");
        public static final QuitEvent BANDBOX_SOLO = new QuitEvent("BANDBOX_SOLO", 5, 5, "bandbox_solo");
        public static final QuitEvent BANDBOX_TRIO = new QuitEvent("BANDBOX_TRIO", 6, 6, "bandbox_trio");
        public static final QuitEvent ENCHANT = new QuitEvent("ENCHANT", 7, 7, "enchant");
        public static final QuitEvent AURACAST = new QuitEvent("AURACAST", 8, 8, "auracast");

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final QuitEvent a(@l3.e String str) {
                boolean K12;
                boolean K13;
                boolean K14;
                boolean K15;
                boolean K16;
                boolean K17;
                boolean K18;
                boolean K19;
                QuitEvent quitEvent = QuitEvent.AUTHENTICS;
                K12 = z.K1(quitEvent.e(), str, true);
                if (!K12) {
                    QuitEvent quitEvent2 = QuitEvent.SOUNDSTICK;
                    K13 = z.K1(quitEvent2.e(), str, true);
                    if (!K13) {
                        QuitEvent quitEvent3 = QuitEvent.HORIZON;
                        K14 = z.K1(quitEvent3.e(), str, true);
                        if (!K14) {
                            QuitEvent quitEvent4 = QuitEvent.AURASTUDIO;
                            K15 = z.K1(quitEvent4.e(), str, true);
                            if (!K15) {
                                QuitEvent quitEvent5 = QuitEvent.BANDBOX_SOLO;
                                K16 = z.K1(quitEvent5.e(), str, true);
                                if (!K16) {
                                    QuitEvent quitEvent6 = QuitEvent.BANDBOX_TRIO;
                                    K17 = z.K1(quitEvent6.e(), str, true);
                                    if (!K17) {
                                        QuitEvent quitEvent7 = QuitEvent.ENCHANT;
                                        K18 = z.K1(quitEvent7.e(), str, true);
                                        if (!K18) {
                                            QuitEvent quitEvent8 = QuitEvent.AURACAST;
                                            K19 = z.K1(quitEvent8.e(), str, true);
                                            if (!K19) {
                                                return QuitEvent.PLAY;
                                            }
                                            return quitEvent8;
                                        }
                                        return quitEvent7;
                                    }
                                    return quitEvent6;
                                }
                                return quitEvent5;
                            }
                            return quitEvent4;
                        }
                        return quitEvent3;
                    }
                    return quitEvent2;
                }
                return quitEvent;
            }

            private a() {
            }
        }

        static {
            QuitEvent[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
            Companion = new a(null);
        }

        private QuitEvent(String str, int i4, int i5, String str2) {
            this.value = i5;
            this.desc = str2;
        }

        private static final /* synthetic */ QuitEvent[] b() {
            return new QuitEvent[]{PLAY, AUTHENTICS, SOUNDSTICK, HORIZON, AURASTUDIO, BANDBOX_SOLO, BANDBOX_TRIO, ENCHANT, AURACAST};
        }

        @l3.d
        public static kotlin.enums.a<QuitEvent> f() {
            return $ENTRIES;
        }

        public static QuitEvent valueOf(String str) {
            return (QuitEvent) Enum.valueOf(QuitEvent.class, str);
        }

        public static QuitEvent[] values() {
            return (QuitEvent[]) $VALUES.clone();
        }

        @l3.d
        public final String e() {
            return this.desc;
        }

        public final int g() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Q<T> {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final Q<? super T> f46162a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final AtomicBoolean f46163b;

        public a(@l3.d Q<? super T> observer) {
            F.p(observer, "observer");
            this.f46162a = observer;
            this.f46163b = new AtomicBoolean(false);
        }

        public final void a() {
            this.f46163b.set(true);
        }

        @Override // androidx.lifecycle.Q
        public void f(T t3) {
            if (this.f46163b.compareAndSet(true, false)) {
                this.f46162a.f(t3);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    @K
    public void k(@l3.d E owner, @l3.d Q<? super T> observer) {
        F.p(owner, "owner");
        F.p(observer, "observer");
        a<? super T> aVar = new a<>(observer);
        Set<a<? super T>> set = this.f46161n.get(owner);
        if (set != null) {
            set.add(aVar);
        } else {
            Set<a<? super T>> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            newSetFromMap.add(aVar);
            ConcurrentHashMap<E, Set<a<? super T>>> concurrentHashMap = this.f46161n;
            F.m(newSetFromMap);
            concurrentHashMap.put(owner, newSetFromMap);
        }
        super.k(owner, aVar);
    }

    @Override // androidx.lifecycle.P, androidx.lifecycle.LiveData
    @InterfaceC0561d
    public void o(T t3) {
        Iterator<Map.Entry<E, Set<a<? super T>>>> it = this.f46161n.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a();
            }
        }
        super.o(t3);
    }

    @Override // androidx.lifecycle.LiveData
    public void p(@l3.d Q<? super T> observer) {
        F.p(observer, "observer");
        if (!(observer instanceof a)) {
            return;
        }
        for (Map.Entry<E, Set<a<? super T>>> entry : this.f46161n.entrySet()) {
            if (entry.getValue().remove(observer) && entry.getValue().isEmpty()) {
                this.f46161n.remove(entry.getKey());
            }
        }
        super.p(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void q(@l3.d E owner) {
        F.p(owner, "owner");
        this.f46161n.remove(owner);
        super.q(owner);
    }

    @Override // androidx.lifecycle.P, androidx.lifecycle.LiveData
    @K
    public void r(@l3.e T t3) {
        Iterator<Map.Entry<E, Set<a<? super T>>>> it = this.f46161n.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a();
            }
        }
        super.r(t3);
    }

    @K
    public final void u() {
        r(null);
    }
}
