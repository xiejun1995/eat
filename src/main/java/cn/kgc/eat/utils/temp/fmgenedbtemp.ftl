package cn.kgc.eat.pojo;
public interface ${className}{

<#list filedList as filed>
private ${filed.type} ${filed.name} ;
</#list>


<#list filedList as filed>
public ${filed.type} get${filed.upperName}() {
return ${filed.name};
}
public void set${filed.upperName}(${filed.type} ${filed.name}) {
this.${filed.name} = ${filed.name};
}
</#list>

}