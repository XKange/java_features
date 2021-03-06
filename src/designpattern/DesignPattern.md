# 设计模式
## 1.单例模式

保证类在运行周期中任一时刻，只存在唯一一个实例。单例模式确保一个
类只有一个实例，而且自行实例化。

所以需要满足以下3点：
- 1.单例类构造函数应该是私有的；
- 2.私有实例化一个静态对象；
- 3.公有的返回对象的静态接口。
为什么对象和接口都要声明为静态的？

自己的理解：因为单例类的实例化由类自己完成，外部不能对其进行实例化，所以只能将
返回单例对象的方法设置为静态的，因而对象也只能是静态的（静态方法操作静态对象）。

