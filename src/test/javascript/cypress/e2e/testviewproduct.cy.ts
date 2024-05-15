describe('Login and navigate to a page', () => {
  it('Logs in, navigates to entities, clicks on product, and views the first product', () => {
    const username = 'admin';
    const password = 'admin';

    cy.visit('http://localhost:8080/login');

    cy.get('input[name="username"]').type(username);
    cy.get('input[name="password"]').type(password);

    cy.get('button[type="submit"]').click();

    cy.url().should('not.include', '/login');

    cy.contains('Entidades').click();

    cy.contains('Product').click();
  });
});
