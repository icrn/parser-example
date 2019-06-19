# JSONparse
json解析器

*******************

- 对json数据格式进行词法分析，JSON数据格式一般分为String,Boolean,{,},null,[,],:, , 等，将其分解成为多个Token
- 对Token进行顺序的语义分析（通过递归实现，可以将Token分为map，array分为数组对象和字典对象）
- 最后返回object对象，即可完成json数据转为java对象格式
