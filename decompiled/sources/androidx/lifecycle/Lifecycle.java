package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public abstract class Lifecycle {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private AtomicReference<Object> f15437a = new AtomicReference<>();

    @kotlin.E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Landroidx/lifecycle/Lifecycle$State;", "g", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @l3.d
        public static final a Companion = new a(null);

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.Lifecycle$Event$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0134a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f15438a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f15438a = iArr;
                }
            }

            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @W2.n
            @l3.e
            public final Event a(@l3.d State state) {
                kotlin.jvm.internal.F.p(state, "state");
                int i4 = C0134a.f15438a[state.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return null;
                        }
                        return Event.ON_PAUSE;
                    }
                    return Event.ON_STOP;
                }
                return Event.ON_DESTROY;
            }

            @W2.n
            @l3.e
            public final Event b(@l3.d State state) {
                kotlin.jvm.internal.F.p(state, "state");
                int i4 = C0134a.f15438a[state.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            return null;
                        }
                        return Event.ON_DESTROY;
                    }
                    return Event.ON_PAUSE;
                }
                return Event.ON_STOP;
            }

            @W2.n
            @l3.e
            public final Event c(@l3.d State state) {
                kotlin.jvm.internal.F.p(state, "state");
                int i4 = C0134a.f15438a[state.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 5) {
                            return null;
                        }
                        return Event.ON_CREATE;
                    }
                    return Event.ON_RESUME;
                }
                return Event.ON_START;
            }

            @W2.n
            @l3.e
            public final Event d(@l3.d State state) {
                kotlin.jvm.internal.F.p(state, "state");
                int i4 = C0134a.f15438a[state.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return null;
                        }
                        return Event.ON_RESUME;
                    }
                    return Event.ON_START;
                }
                return Event.ON_CREATE;
            }

            private a() {
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15439a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f15439a = iArr;
            }
        }

        @W2.n
        @l3.e
        public static final Event e(@l3.d State state) {
            return Companion.a(state);
        }

        @W2.n
        @l3.e
        public static final Event f(@l3.d State state) {
            return Companion.b(state);
        }

        @W2.n
        @l3.e
        public static final Event i(@l3.d State state) {
            return Companion.c(state);
        }

        @W2.n
        @l3.e
        public static final Event j(@l3.d State state) {
            return Companion.d(state);
        }

        @l3.d
        public final State g() {
            switch (b.f15439a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @kotlin.E(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "state", "", "e", "(Landroidx/lifecycle/Lifecycle$State;)Z", "<init>", "(Ljava/lang/String;I)V", "DESTROYED", "INITIALIZED", kotlinx.coroutines.debug.internal.g.f53448a, "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean e(@l3.d State state) {
            kotlin.jvm.internal.F.p(state, "state");
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    @androidx.annotation.K
    public abstract void a(@l3.d D d4);

    @l3.d
    @androidx.annotation.K
    public abstract State b();

    @l3.d
    public final AtomicReference<Object> c() {
        return this.f15437a;
    }

    @androidx.annotation.K
    public abstract void d(@l3.d D d4);

    public final void e(@l3.d AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.F.p(atomicReference, "<set-?>");
        this.f15437a = atomicReference;
    }
}
