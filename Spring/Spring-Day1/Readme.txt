why we should not use Type based context loader ...multiple types 

LAZY Loading (BeanContex ) vs aggressive Loading(Application Contet only singleton...prototype - created when getbean)

Circular Dependency

<bean id="helloBean" class="com.taggy.spring.context.Account"  lazy-init="true">
		<property name="name" value="HDFC" />
	</bean>

Importance of lazy-init -true


Construction injections - type(useful for single parameter) and index ((useful for multiple parameter)


==========================================

property Loader

<bean class="org.springframework.beans.factory.config.PropertySourcesPlaceholderConfigurer">
 <property name="location" value=classpath:test.properties/>
 </bean>



<context:property-placeholder location="classpath:test.properties" />


http://www.baeldung.com/2012/02/06/properties-with-spring/

=============================================

Autowire

Autowire by Type is default

make sure that you have single bean 

autowire by name - names should be same


no meaning for default

<bean id="loanBean" autowire="default" class="com.taggy.spring.context.autowire.Loan">
	</bean>
===================================================


id and name has different meaning..id is not sufficoent and has probilems of characters of limitation of bean identifier


name can be http://com.cognizant.ubs.wma

name can be enityDao,Dao -you can assign mutltiple values....i.e multiple identifiers

Alias 	<alias name="loanBean" alias="loan"/>

Nested Bean - inner bean --> when bean is not required at multiple places then have a nested bean

================================================

IDREF

local (Same congif file) vs bean(Entire context)

==============================================



Collections List set map properties

================

Dependency checking modes
4 dependency checking modes are supported:

none – No dependency checking.
simple – If any properties of primitive type (int, long,double…) and collection types (map, list..) have not been set, UnsatisfiedDependencyException will be thrown.
objects – If any properties of object type have not been set, UnsatisfiedDependencyException will be thrown.
all – If any properties of any type have not been set, an UnsatisfiedDependencyException
will be thrown.
P.S The default mode is none


