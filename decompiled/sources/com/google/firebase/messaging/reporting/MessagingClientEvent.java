package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.encoders.proto.c;

/* loaded from: classes2.dex */
public final class MessagingClientEvent {

    /* renamed from: p, reason: collision with root package name */
    private static final MessagingClientEvent f37092p = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f37093a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37094b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37095c;

    /* renamed from: d, reason: collision with root package name */
    private final MessageType f37096d;

    /* renamed from: e, reason: collision with root package name */
    private final SDKPlatform f37097e;

    /* renamed from: f, reason: collision with root package name */
    private final String f37098f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37099g;

    /* renamed from: h, reason: collision with root package name */
    private final int f37100h;

    /* renamed from: i, reason: collision with root package name */
    private final int f37101i;

    /* renamed from: j, reason: collision with root package name */
    private final String f37102j;

    /* renamed from: k, reason: collision with root package name */
    private final long f37103k;

    /* renamed from: l, reason: collision with root package name */
    private final Event f37104l;

    /* renamed from: m, reason: collision with root package name */
    private final String f37105m;

    /* renamed from: n, reason: collision with root package name */
    private final long f37106n;

    /* renamed from: o, reason: collision with root package name */
    private final String f37107o;

    /* loaded from: classes2.dex */
    public enum Event implements c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int b() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum MessageType implements c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int b() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum SDKPlatform implements c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int b() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f37108a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f37109b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f37110c = "";

        /* renamed from: d, reason: collision with root package name */
        private MessageType f37111d = MessageType.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private SDKPlatform f37112e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f37113f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f37114g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f37115h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f37116i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f37117j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f37118k = 0;

        /* renamed from: l, reason: collision with root package name */
        private Event f37119l = Event.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f37120m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f37121n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f37122o = "";

        a() {
        }

        public MessagingClientEvent a() {
            return new MessagingClientEvent(this.f37108a, this.f37109b, this.f37110c, this.f37111d, this.f37112e, this.f37113f, this.f37114g, this.f37115h, this.f37116i, this.f37117j, this.f37118k, this.f37119l, this.f37120m, this.f37121n, this.f37122o);
        }

        public a b(String str) {
            this.f37120m = str;
            return this;
        }

        public a c(long j4) {
            this.f37118k = j4;
            return this;
        }

        public a d(long j4) {
            this.f37121n = j4;
            return this;
        }

        public a e(String str) {
            this.f37114g = str;
            return this;
        }

        public a f(String str) {
            this.f37122o = str;
            return this;
        }

        public a g(Event event) {
            this.f37119l = event;
            return this;
        }

        public a h(String str) {
            this.f37110c = str;
            return this;
        }

        public a i(String str) {
            this.f37109b = str;
            return this;
        }

        public a j(MessageType messageType) {
            this.f37111d = messageType;
            return this;
        }

        public a k(String str) {
            this.f37113f = str;
            return this;
        }

        public a l(int i4) {
            this.f37115h = i4;
            return this;
        }

        public a m(long j4) {
            this.f37108a = j4;
            return this;
        }

        public a n(SDKPlatform sDKPlatform) {
            this.f37112e = sDKPlatform;
            return this;
        }

        public a o(String str) {
            this.f37117j = str;
            return this;
        }

        public a p(int i4) {
            this.f37116i = i4;
            return this;
        }
    }

    MessagingClientEvent(long j4, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i4, int i5, String str5, long j5, Event event, String str6, long j6, String str7) {
        this.f37093a = j4;
        this.f37094b = str;
        this.f37095c = str2;
        this.f37096d = messageType;
        this.f37097e = sDKPlatform;
        this.f37098f = str3;
        this.f37099g = str4;
        this.f37100h = i4;
        this.f37101i = i5;
        this.f37102j = str5;
        this.f37103k = j5;
        this.f37104l = event;
        this.f37105m = str6;
        this.f37106n = j6;
        this.f37107o = str7;
    }

    public static MessagingClientEvent f() {
        return f37092p;
    }

    public static a q() {
        return new a();
    }

    @Protobuf(tag = 13)
    public String a() {
        return this.f37105m;
    }

    @Protobuf(tag = 11)
    public long b() {
        return this.f37103k;
    }

    @Protobuf(tag = 14)
    public long c() {
        return this.f37106n;
    }

    @Protobuf(tag = 7)
    public String d() {
        return this.f37099g;
    }

    @Protobuf(tag = 15)
    public String e() {
        return this.f37107o;
    }

    @Protobuf(tag = 12)
    public Event g() {
        return this.f37104l;
    }

    @Protobuf(tag = 3)
    public String h() {
        return this.f37095c;
    }

    @Protobuf(tag = 2)
    public String i() {
        return this.f37094b;
    }

    @Protobuf(tag = 4)
    public MessageType j() {
        return this.f37096d;
    }

    @Protobuf(tag = 6)
    public String k() {
        return this.f37098f;
    }

    @Protobuf(tag = 8)
    public int l() {
        return this.f37100h;
    }

    @Protobuf(tag = 1)
    public long m() {
        return this.f37093a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform n() {
        return this.f37097e;
    }

    @Protobuf(tag = 10)
    public String o() {
        return this.f37102j;
    }

    @Protobuf(tag = 9)
    public int p() {
        return this.f37101i;
    }
}
