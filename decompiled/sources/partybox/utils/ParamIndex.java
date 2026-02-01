package partybox.utils;

/* loaded from: classes2.dex */
public enum ParamIndex {
    DEV_URL(0),
    PRO_URL(1),
    DEV_API_KEY(2),
    PRO_API_KEY(3),
    DEV_STREAM_NAME(4),
    PRO_STREAM_NAME(5);

    private int mIndex;

    ParamIndex(int i4) {
        this.mIndex = i4;
    }

    public int e() {
        return this.mIndex;
    }
}
