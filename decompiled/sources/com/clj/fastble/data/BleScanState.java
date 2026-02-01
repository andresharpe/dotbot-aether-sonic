package com.clj.fastble.data;

/* loaded from: classes.dex */
public enum BleScanState {
    STATE_IDLE(-1),
    STATE_SCANNING(1);

    private int code;

    BleScanState(int i4) {
        this.code = i4;
    }

    public int b() {
        return this.code;
    }
}
