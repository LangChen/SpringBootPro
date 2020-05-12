### Mybatis 配置问题

1.Mybatis生成器

context下的标签需要按顺序添加：

"(property*,plugin*,commentGenerator?,jdbcConnection,javaTypeResolver?,javaModelGenerator,sqlMapGenerator?,javaClientGenerator?,table+)"

