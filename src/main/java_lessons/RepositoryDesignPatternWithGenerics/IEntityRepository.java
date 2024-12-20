package RepositoryDesignPatternWithGenerics;

public interface IEntityRepository<T extends IEntity> {
    void Add(T entity); // entity is a database object
    void Delete(T entity);
    void Update(T entity);
}
