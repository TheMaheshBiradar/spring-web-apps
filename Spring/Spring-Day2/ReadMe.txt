http://www.dineshonjava.com/2012/06/using-applicationcontextaware-in-spring.html#.VZAIifmqpHw


================================
Bean Initialization - of methods are same in each class then it can be given in tab beans tab which is parent.

<bean id="account" class="com.taggy.spring.context.applicationcontextAware.beaninit.Account" init-method="myOwnInit" destroy-method="myOwnDestroy">
		<property name="name" value="HDFC" />
	</bean>
	
------------------------------------------------------------
	
Bean Inheritence (Merge , Global and local)

parent, abstract parent--> Do not crate bean it is just a template , list merge
===============================================================================


beanPostProcessor  - after each bean being processed , this is call back method---Required annotaions is one of the exaple

factorypostProcessor -after factory being initilized , this is called 

property place holder is factoryPostProcessor example
=============================================================


Annotations - Add @required annotation on setter and <bean id="required" class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"/>
============
register this beanPostProcessor.

Autowired
---------

First see for Type if one then fine

second see for name of the bean with same with multiple bean then fine

or else assign.

Resource javax. JSR anniotaions same as autowire -> default will find same name
----------
	@PostConstruct 	@PreDestroy
	
<context:component-scan base-package="com.taggy.spring.annotations"></context:component-scan>

It scans all the Sterotype annotations

----------------------


MessageResources
====================================

PropertyPlaceholderConfigurer used for properties files to be used in the application context or inside the code with with @value.

ResourceBundleMessageSource used for Internationalization & Localization (i18n) of messages you want to show to the user, within jsp direct, or from your code by wiring message resources bean inside your component.


=======================================


events are not initilized in constructor..

make sure as , first bean is created and the set|ApplicationEventPublisher will be called.

Event-> Publisher ->Listener

