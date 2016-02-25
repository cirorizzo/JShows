package com.github.cirorizzo.jshows.presenter;

public class MasterPresenterInject {
    private MasterPresenterImpl masterPresenterImpl;

    protected MasterPresenterImpl createMasterPresenterImpl() {
        return new MasterPresenterImpl();
    }

    public MasterPresenterImpl provideMasterPresenterImpl() {
        if (masterPresenterImpl == null) {
            masterPresenterImpl = createMasterPresenterImpl();
        }

        return masterPresenterImpl;
    }
}
