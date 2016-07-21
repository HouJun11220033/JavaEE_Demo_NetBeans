package com.spring.hellospring;

public class TextEditor {

    private SpellChecker spellChecker;
//没有显示得调用get方法

//    public SpellChecker getSpellChecker() {
//        System.out.println("Inside getSpellChecker.");
//        //return:获得spellChecker的构造方法，和其他方法
//        return spellChecker;
//    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    //只负责invoke就行
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
