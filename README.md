
<body>

   <h1>ClassListEJBModule</h1>
    <h2>Description</h2>
    <p>The <strong>ClassListEJBModule</strong> is an EJB-based module designed to manage a list of students. It includes the functionality to create, edit, remove, and find student records, as well as interact with an <em>EntityManager</em> for persistence using JPA annotations.</p>

  <h2>Project Structure</h2>
    <ul>
        <li><strong>za.ac.tut.models</strong>: Contains the <code>ClassList</code> entity which represents a student.</li>
        <li><strong>za.ac.tut.bl</strong>: Business logic layer containing the <code>ClassListFacade</code> for managing the entity and <code>ClassListFacadeLocal</code> interface for defining the methods.</li>
    </ul>

  <h3>Files</h3>
    <ul>
        <li><strong>AbstractFacade.java</strong>: Abstract class providing basic CRUD operations for any entity class.</li>
        <li><strong>ClassListFacade.java</strong>: Stateless EJB extending <code>AbstractFacade</code> to manage <code>ClassList</code> entities.</li>
        <li><strong>ClassListFacadeLocal.java</strong>: Local interface defining the available operations for <code>ClassList</code>.</li>
        <li><strong>ClassList.java</strong>: Entity class representing the student details, annotated with JPA annotations for persistence.</li>
    </ul>
    <h2>Entity Details</h2>
    <p>The <strong>ClassList</strong> entity is used to represent a student in the system. It contains the following fields:</p>
    <ul>
        <li><strong>studentNum</strong>: Unique ID for each student (primary key).</li>
        <li><strong>name</strong>: First name of the student.</li>
        <li><strong>surname</strong>: Last name of the student.</li>
        <li><strong>stu_photo</strong>: A binary (LOB) field to store the student's photo.</li>
        <li><strong>timestampreal</strong>: The timestamp when the record was last updated, using JPA's <code>@Temporal</code> annotation.</li>
    </ul>
    <h2>How to Use</h2>
    <p>This module uses EJB for business logic and JPA for entity persistence. To use this module, ensure you have a configured persistence unit and an EJB container like GlassFish or WildFly for deployment.</p>
    <h3>Example Usage</h3>
    <p>You can interact with the <code>ClassListFacade</code> through an injected <code>ClassListFacadeLocal</code> bean in other components of your application to perform CRUD operations on the <code>ClassList</code> entities.</p>
    <h2>Technologies Used</h2>
    <ul>
        <li>Java EE (EJB, JPA)</li>
        <li>NetBeans IDE</li>
    </ul>

</body>
</html>
