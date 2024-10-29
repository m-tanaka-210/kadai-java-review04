package animal;

public class Animal {
    // フィールドの定義
    private String name; // 名前
    private int age;     // 年齢


    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
    this.name = name;
    this.age = age;
}

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
